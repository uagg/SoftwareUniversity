using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Batteries
{
    /* You are in a battery manufacturing plant. Your task is to stress test the latest batch of batteries for longevity.
     * You will receive an array of doubles on the console (first line, space-separated),
     * indicating the capacities of the different batteries in the batch (in mAh). On the next line, you will receive
     * the usage per hour for each battery as an array of doubles (second line, space-separated).
     * Next, you will receive the amount of hours you have to stress test each battery for (as an integer).
     * Each of the batteries drains by its capacity until either the testing hours are over, or the battery dies (reaches 0 capacity).
     * Print the status of all the batteries at the end of the testing session (in percentage).
     * If any batteries die, along with the percentage, print how many hours it took.
     * The capacity and percentage are rounded to the 2nd decimal point. */
    class Program
    {
        static void Main(string[] args)
        {
            var capacities = Console.ReadLine().Split(' ').Select(double.Parse).ToList();
            var usagePerHour = Console.ReadLine().Split(' ').Select(double.Parse).ToList();
            var hours = int.Parse(Console.ReadLine());

            for (int i = 0; i < capacities.Count; i++)
            {
                var isDone = false;
                var hoursValue = 0;
                var usageValue = 0.0D;

                while (usageValue <= capacities[i] && isDone == false && hoursValue <= hours)
                {
                    usageValue += usagePerHour[i];
                    hoursValue++;
                    if (hoursValue == hours)
                    {
                        isDone = true;
                    }
                }

                if ((capacities[i] - usageValue) > 0)
                {
                    Console.WriteLine("Battery {0}: {1:F2} mAh ({2:F2})%", i + 1, capacities[i] - usageValue, (capacities[i] - usageValue) * 100 / capacities[i]);
                }
                else
                {
                    Console.WriteLine("Battery {0}: dead (lasted {1} hours)", i + 1, hoursValue);
                }
            }
        }
    }
}
