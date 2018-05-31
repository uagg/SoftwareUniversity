using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;

namespace SinoTheWalker
{
    class Program
    {
        static void Main(string[] args)
        {
            var timeFormat = @"hh\:mm\:ss";
            var leavingTime = TimeSpan.ParseExact(Console.ReadLine(), timeFormat, CultureInfo.InvariantCulture);
            var steps = int.Parse(Console.ReadLine());
            var stepsSpeed = int.Parse(Console.ReadLine());
            var secondsInDay = 60 * 60 * 24;
            var walkingTime = (int)(((double)steps * stepsSpeed) % secondsInDay);
            var arrivalTime = leavingTime.Add(new TimeSpan(0, 0, walkingTime));

            Console.WriteLine($"Time Arrival: {arrivalTime.ToString(timeFormat)}");
        }
    }
}
