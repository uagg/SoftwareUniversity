using System;
using System.Collections.Generic;
using System.Linq;
using System.Globalization;
using System.Text;
using System.Threading.Tasks;

namespace DayOfWeek
{
    /* You are given a date in format day-month-year. Calculate and print the day of week in English. */
    class Program
    {
        static void Main(string[] args)
        {
            // Variant A
            var inputDateA = Console.ReadLine();
            DateTime dateA = DateTime.ParseExact(inputDateA, "d-M-yyyy", CultureInfo.InvariantCulture);
            Console.WriteLine(dateA.DayOfWeek);

            // Variant B
            var inputDateB = Console.ReadLine().Split('-').Select(int.Parse).ToArray();
            var dateB = new DateTime(inputDateB[2], inputDateB[1], inputDateB[0]);
            Console.WriteLine(dateB.DayOfWeek);
        }
    }
}
