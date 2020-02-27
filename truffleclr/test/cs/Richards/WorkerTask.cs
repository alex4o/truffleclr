using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Richards
{
    class WorkerTask : Task
    {

        int v2;
        /**
         * A task that manipulates work packets.
         * @param {Scheduler} scheduler the scheduler that manages this task
         * @param {int} v1 a seed used to specify how work packets are manipulated
         * @param {int} v2 another seed used to specify how work packets are manipulated
         * @constructor
         */
        public WorkerTask(Scheduler scheduler, int v1, int v2)
        {
            this.scheduler = scheduler;
            this.v1 = v1;
            this.v2 = v2;
        }

        override public TaskControlBlock run(Packet packet)
        {
            if (packet == null)
            {
                return this.scheduler.suspendCurrent();
            }
            else
            {
                if ((int) this.v1 == Richards.ID_HANDLER_A)
                {
                    this.v1 = Richards.ID_HANDLER_B;
                }
                else
                {
                    this.v1 = Richards.ID_HANDLER_A;
                }
                packet.id = (int) this.v1;
                packet.a1 = 0;
                for (int i = 0; i < Richards.DATA_SIZE; i++)
                {
                    this.v2++;
                    if (this.v2 > 26) this.v2 = 1;
                    packet.a2[i] = this.v2;
                }
                return this.scheduler.queue(packet);
            }
        }
    }
}
