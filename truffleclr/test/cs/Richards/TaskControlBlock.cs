using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Richards
{
    public enum States
    {
        RUNNING = 0,
        /**
             * The task has packets left to process.
             */
        RUNNABLE = 1,
        /**
             * The task is not currently running.  The task is not blocked as such and may
            * be started by the scheduler.
             */
        SUSPENDED = 2,
        /**
             * The task is blocked and cannot be run until it is explicitly released.
             */
        HELD = 4,
        SUSPENDED_RUNNABLE = SUSPENDED | RUNNABLE,
        NOT_HELD = ~HELD,
    }

    class TaskControlBlock
    {



        public int id;
        public TaskControlBlock link;
        public int priority;
        private Packet queue;
        private States state;
        private Task task;

        public TaskControlBlock(TaskControlBlock link, int id, int priority, Packet queue, Task task)
        {
            this.link = link;
            this.id = id;
            this.priority  = priority;
            this.queue = queue ;
            this.task = task ;
            if (queue == null)
            {
                this.state  = States.SUSPENDED;
            }
            else
            {
                this.state  = States.SUSPENDED_RUNNABLE;
            }
        }


        public void setRunning()
        {
            this.state = States.RUNNING;
        }

        public void markAsNotHeld()
        {
            this.state = this.state   & States.NOT_HELD;
        }

        public void markAsHeld()
        {
            this.state = this.state   | States.HELD;
        }

        public bool isHeldOrSuspended()
        {
            return (this.state  & States.HELD) != 0 || (this.state   == States.SUSPENDED);
        }

        public void markAsSuspended()
        {
            this.state  = this.state  | States.SUSPENDED ;
        }

        public void markAsRunnable()
        {
            this.state  = this.state  | States.RUNNABLE;
        }

        /**
         * Runs this task, if it is ready to be run, and returns the next task to run.
         */
        public TaskControlBlock run()
        {
            Packet packet;
            if (this.state  == States.SUSPENDED_RUNNABLE)
            {
                packet = this.queue;
                this.queue = packet.link;
                if (this.queue == null)
                {
                    this.state  = States.RUNNING;
                }
                else
                {
                    this.state = States.RUNNABLE;
                }
            }
            else
            {
                packet = null;
            }
            return this.task.run(packet);
        }

        /**
         * Adds a packet to the worklist of this block's task, marks this as runnable if
         * necessary, and returns the next runnable object to run (the one
         * with the highest priority).
         */
        public TaskControlBlock checkPriorityAdd(TaskControlBlock task, Packet packet)
        {
            if (this.queue == null)
            {
                this.queue = packet;
                this.markAsRunnable();
                if (this.priority  > task.priority ) return this;
            }
            else
            {
                this.queue = packet.addTo(this.queue);
            }
            return task;
        }

    }
}
