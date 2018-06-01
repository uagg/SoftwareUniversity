using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TravelingAtLightSpeed
{
    class Program
    {
        static void Main(string[] args)
        {
            decimal ly = decimal.Parse(Console.ReadLine());
            decimal distance = 9450000000000M;
            decimal speed = 300000M;
            decimal time = (distance / speed) * ly;
            TimeSpan diff = TimeSpan.FromSeconds((double)time);
            string formatted = string.Format(
                 CultureInfo.CurrentCulture,
                 "{0} weeks\n{1} days\n{2} hours\n{3} minutes\n{4} seconds\n", diff.Days / 7, diff.Days % 7, diff.Hours, diff.Minutes, diff.Seconds);
            Console.WriteLine(formatted);
        }
    }
}
