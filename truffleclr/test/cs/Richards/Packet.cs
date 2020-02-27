using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Richards
{
    public enum Kind
    {
        DEVICE,
        WORK
    }
    class Packet
    {


        public Packet link;
        public int id;
        public Kind kind;
        public int a1;
        public int[] a2;

        public Packet(Packet link, int id, Kind kind)
        {
            this.link = link;
            this.id = id;
            this.kind = kind;
            this.a1 = 0;
            this.a2 = new int[Richards.DATA_SIZE];
        }

        public Packet addTo(Packet queue)
        {
            this.link = null;
            if (queue == null) return this;
            Packet peek = queue;
            Packet next = queue;
            while ((peek = next.link) != null)
            {
                next = peek;
            }
            next.link = this;
            return queue;
        }
    }
}
