using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EnduranceRally
{
    class Program
    {
        static void Main(string[] args)
        {
            var drivers = Console.ReadLine().Split(' ').ToArray();
            var trackLayoutZones = Console.ReadLine().Split(' ').Select(double.Parse).ToArray();
            var checkpointIndexes = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();

            for (int i = 0; i < drivers.Length; i++)
            {
                var fuel = (double)(drivers[i].ToCharArray()[0]);
                var reached = 0;

                for (int j = 0; j < trackLayoutZones.Length; j++)
                {
                    var hasCheckpoint = false;

                    for (int k = 0; k < checkpointIndexes.Length; k++)
                    {
                        if (j.Equals(checkpointIndexes[k]))
                        {
                            hasCheckpoint = true;
                            k = checkpointIndexes.Length;
                        }
                    }
                    if (!hasCheckpoint)
                    {
                        fuel -= trackLayoutZones[j];
                    }
                    else
                    {
                        fuel += trackLayoutZones[j];
                    }

                    if (fuel <= 0)
                    {
                        j = trackLayoutZones.Length;
                    }
                    else
                    {
                        reached++;
                    }
                }

                if (fuel <= 0)
                {
                    Console.WriteLine($"{drivers[i]} - reached {reached}");
                }
                else
                {
                    Console.WriteLine($"{drivers[i]} - fuel left {fuel:F2}");
                }
            }
        }
    }
}
