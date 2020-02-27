using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Richards
{
    class DeviceTask : Task
    {

        /**
         * A task that suspends itself after each time it has been run to simulate
         * waiting for data from an external device.
         * @param {Scheduler} scheduler the scheduler that manages this task
         * @constructor
         */
        public DeviceTask(Scheduler scheduler)
        {
            this.scheduler = scheduler;
            this.v1 = null;
        }

        override public TaskControlBlock run(Packet packet)
        {
            if (packet == null)
            {
                if (this.v1 == null) return this.scheduler.suspendCurrent();
                Object v = this.v1;
                this.v1 = null;
                return this.scheduler.queue((Packet)v);
            }
            else
            {
                this.v1 = packet;
                return this.scheduler.holdCurrent();
            }
        }

    }
}
