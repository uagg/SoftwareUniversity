using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;

namespace DayOfWeek
{
    /* You are given a date in format day-month-year. Calculate and print the day of week in English. */
    class Program
    {
        static void Main(string[] args)
        {
            var inputDate = Console.ReadLine();
            var dateTime = DateTime.ParseExact(inputDate, "d-M-yyyy", CultureInfo.InvariantCulture);
            Console.WriteLine(dateTime.DayOfWeek);
        }
    }
}
