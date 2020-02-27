using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Richards
{
    class IdleTask : Task
    {

        protected int count;
        public IdleTask(Scheduler scheduler, int v1, int count)
        {
            this.scheduler = scheduler;
            this.v1 = v1;
            this.count = count;
        }

        override public TaskControlBlock run(Packet packet)
        {
            this.count--;
            int v1 = (int) this.v1;
            if (this.count == 0) return this.scheduler.holdCurrent();
            if ((v1 & 1) == 0)
            {
                this.v1 = v1 >> 1;
                return this.scheduler.release(Richards.ID_DEVICE_A);
            }
            else
            {
                this.v1 = (v1 >> 1) ^ 0xD008;
                return this.scheduler.release(Richards.ID_DEVICE_B);
            }
        }
    }
}
