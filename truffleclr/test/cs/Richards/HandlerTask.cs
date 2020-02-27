using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Richards
{
    class HandlerTask : Task
    {
        Packet v2;
        /**
         * A task that manipulates work packets and then suspends itself.
         * @param {Scheduler} scheduler the scheduler that manages this task
         * @constructor
         */
        public HandlerTask(Scheduler scheduler)
        {
            this.scheduler = scheduler;
            this.v1 = null;
            this.v2 = null;
        }

        override public TaskControlBlock run(Packet packet)
        {
            Packet v1 = (Packet)this.v1;
            if (packet != null)
            {
                if (packet.kind == Kind.WORK)
                {
                    this.v1 = packet.addTo(v1);
                }
                else
                {
                    this.v2 = packet.addTo(this.v2);
                }
            }
            v1 = (Packet)this.v1;
            if (this.v1 != null)
            {
                int count = v1.a1;
                Packet v;
                if (count < Richards.DATA_SIZE)
                {
                    if (this.v2 != null)
                    {
                        v = this.v2;
                        this.v2 = this.v2.link;
                        v.a1 = v1.a2[count];
                        v1.a1 = count + 1;
                        this.v1 = v1;
                        return this.scheduler.queue(v);
                    }
                }
                else
                {
                    v = v1;
                    this.v1 = v1.link;
                    return this.scheduler.queue(v);
                }
            }
            return this.scheduler.suspendCurrent();
        }
    }
}
