using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Richards
{
    class Richards
    {
        public const int ID_IDLE = 0;
        public const int ID_WORKER = 1;
        public const int DATA_SIZE = 4;
        public const int ID_HANDLER_A = 2;
        public const int ID_HANDLER_B = 3;
        public const int ID_DEVICE_A = 4;
        public const int ID_DEVICE_B = 5;

        public const int COUNT = 1000;
        public const int EXPECTED_QUEUE_COUNT = 2322;
        public const int EXPECTED_HOLD_COUNT = 928;

        public void run()
        {
            Scheduler scheduler = new Scheduler();
            scheduler.addIdleTask(ID_IDLE, 0, null, COUNT);

            Packet queue = new Packet(null, ID_WORKER, Kind.WORK);
            queue = new Packet(queue, ID_WORKER, Kind.WORK);
            scheduler.addWorkerTask(ID_WORKER, 1000, queue);

            queue = new Packet(null, ID_DEVICE_A, Kind.DEVICE);
            queue = new Packet(queue, ID_DEVICE_A, Kind.DEVICE);
            queue = new Packet(queue, ID_DEVICE_A, Kind.DEVICE);
            scheduler.addHandlerTask(ID_HANDLER_A, 2000, queue);

            queue = new Packet(null, ID_DEVICE_B, Kind.DEVICE);
            queue = new Packet(queue, ID_DEVICE_B, Kind.DEVICE);
            queue = new Packet(queue, ID_DEVICE_B, Kind.DEVICE);
            scheduler.addHandlerTask(ID_HANDLER_B, 3000, queue);

            scheduler.addDeviceTask(ID_DEVICE_A, 4000, null);

            scheduler.addDeviceTask(ID_DEVICE_B, 5000, null);

            scheduler.schedule();

            if (scheduler.queueCount != EXPECTED_QUEUE_COUNT ||
                scheduler.holdCount != EXPECTED_HOLD_COUNT)
            {
                Console.Write("Error during execution: queueCount = ");
                Console.Write(scheduler.queueCount);
                Console.Write(", holdCount = ");
                Console.Write(scheduler.holdCount);
                Console.WriteLine(".");
            }
            else
            {
                Console.WriteLine("Finished successfully");
            }
        }

    }
}
