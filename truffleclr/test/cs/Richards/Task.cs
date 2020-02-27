using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Richards
{
    abstract class Task
    {
        protected Scheduler scheduler;
        protected Object v1;

        public abstract TaskControlBlock run(Packet packet);

    }
}
