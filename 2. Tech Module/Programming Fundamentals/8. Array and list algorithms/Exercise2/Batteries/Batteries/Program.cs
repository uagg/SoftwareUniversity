using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Batteries
{
    class Program
    {
        static void Main(string[] args)
        {
            var capacities = Console.ReadLine().Split(' ').Select(double.Parse).ToList();
            var usagePerHour = Console.ReadLine().Split(' ').Select(double.Parse).ToList();
            var usageCount = new List<double>(usagePerHour);
            var hoursWorkedBeforeDie = 0;
            var hours = int.Parse(Console.ReadLine());

            for (int i = 0; i < usagePerHour.Count; i++)
            {
                int a = 1;

                for (; a <= hours; a++)
                {
                    usageCount[i] = usagePerHour[i] * a;
                    hoursWorkedBeforeDie++;

                    if (usageCount[i] > capacities[i])
                    {
                        a = hours;
                    }
                }

                var percentage = (capacities[i] - usageCount[i]) * 100 / capacities[i];

                if((capacities[i] - usageCount[i]) > 0)
                {
                    Console.WriteLine("Battery {0}: {1:F2} mAh ({2:F2})%", i + 1, capacities[i] - usageCount[i], percentage);
                }
                else
                {
                    Console.WriteLine("Battery {0}: dead (lasted {1} hours)", i + 1, hoursWorkedBeforeDie);
                }

                hoursWorkedBeforeDie = 0;
            }
        }
    }
}