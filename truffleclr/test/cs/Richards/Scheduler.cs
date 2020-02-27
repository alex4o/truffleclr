using Richards;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Richards
{
    class Scheduler
    {
        const int NUMBER_OF_IDS = 6;

        public int queueCount;
        public int holdCount;
        public int currentId;
        TaskControlBlock[] blocks;
        TaskControlBlock list;
        TaskControlBlock currentTCB;

        public Scheduler()
        {
            this.queueCount = 0;
            this.holdCount = 0;
            this.blocks = new TaskControlBlock[NUMBER_OF_IDS];
            this.list = null;
            this.currentTCB = null;
            this.currentId = 0;//check this
        }

        /**
         * Add an idle task to this scheduler.
         * @param id the identity of the task
         * @param priority the task's priority
         * @param queue the queue of work to be processed by the task
         * @param count the number of times to schedule the task
         */
        public void addIdleTask(int id, int priority, Packet queue, int count)
        {
            this.addRunningTask(id, priority, queue, new IdleTask(this, 1, count));
        }

        /**
         * Add a work task to this scheduler.
         * #param {int} id the identity of the task
         * #param {int} priority the task's priority
         * #param {Packet} queue the queue of work to be processed by the task
         */
        public void addWorkerTask(int id , int priority, Packet queue)
        {
            this.addTask(id, priority, queue, new WorkerTask(this, Richards.ID_HANDLER_A, 0));
        }

        /**
         * Add a handler task to this scheduler.
         * #param {int} id the identity of the task
         * #param {int} priority the task's priority
         * #param {Packet} queue the queue of work to be processed by the task
         */
        public void addHandlerTask(int id ,int priority, Packet queue)
        {
            this.addTask(id, priority, queue, new HandlerTask(this));
        }

        /**
         * Add a handler task to this scheduler.
         * #param {int} id the identity of the task
         * #param {int} priority the task's priority
         * #param {Packet} queue the queue of work to be processed by the task
         */
        public void addDeviceTask(int id, int priority, Packet queue)
        {
            this.addTask(id, priority, queue, new DeviceTask(this));
        }

        /**
         * Add the specified task and mark it as running.
         * #param {int} id the identity of the task
         * #param {int} priority the task's priority
         * #param {Packet} queue the queue of work to be processed by the task
         * #param {Task} task the task to add
         */
        public void addRunningTask(int id, int priority, Packet queue, Task task)
        {
            this.addTask(id, priority, queue, task);
            this.currentTCB.setRunning();
        }

        /**
         * Add the specified task to this scheduler.
         * @param {int} id the identity of the task
         * @param {int} priority the task's priority
         * @param {Packet} queue the queue of work to be processed by the task
         * @param {Task} task the task to add
         */
        public void addTask(int id, int priority, Packet queue, Task task)
        {
            this.currentTCB = new TaskControlBlock(this.list, id, priority, queue, task);
            this.list = this.currentTCB;
            this.blocks[id] = this.currentTCB;
        }

        /**
         * Execute the tasks managed by this scheduler.
         */
        public void schedule()
        {
            this.currentTCB = this.list;
            while (this.currentTCB != null)
            {
                if (this.currentTCB.isHeldOrSuspended())
                {
                    this.currentTCB = this.currentTCB.link;
                }
                else
                {
                    this.currentId  = this.currentTCB.id ;
                    this.currentTCB = this.currentTCB.run();
                }
            }
        }

        /**
         * Release a task that is currently blocked and return the next block to run.
         * #param {int} id the id of the task to suspend
         */
        public TaskControlBlock release(int id)
        {
            TaskControlBlock tcb = this.blocks[id];
            if (tcb == null) return tcb;
            tcb.markAsNotHeld();
            if (tcb.priority  > this.currentTCB.priority  )
            {
                return tcb;
            }
            else
            {
                return this.currentTCB;
            }
        }

        /**
         * Block the currently executing task and return the next task control block
         * to run.  The blocked task will not be made runnable until it is explicitly
         * released, even if new work is added to it.
         */
        public TaskControlBlock holdCurrent()
        {
            this.holdCount++;
            this.currentTCB.markAsHeld();
            return this.currentTCB.link;
        }

        /**
         * Suspend the currently executing task and return the next task control block
         * to run.  If new work is added to the suspended task it will be made runnable.
         */
        public TaskControlBlock suspendCurrent()
        {
            this.currentTCB.markAsSuspended();
            return this.currentTCB;
        }

        /**
         * Add the specified packet to the end of the worklist used by the task
         * associated with the packet and make the task runnable if it is currently
         * suspended.
         * #param {Packet} packet the packet to add
         */
        public TaskControlBlock queue(Packet packet)
        {
            TaskControlBlock t = this.blocks[packet.id];
            if (t == null) return t;
            this.queueCount++;
            packet.link = null;
            packet.id  = this.currentId;
            return t.checkPriorityAdd(this.currentTCB, packet);
        }
    }
}
