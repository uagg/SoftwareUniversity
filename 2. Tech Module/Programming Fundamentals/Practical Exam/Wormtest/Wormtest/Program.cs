using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Wormtest
{
    class Program
    {
        static void Main(string[] args)
        {
            // Worm length in Meters
            var wormLength = int.Parse(Console.ReadLine()) * 100; // multiplying to convert in Centimeters.
            // Worm width in Centimeters
            var wormWidth = double.Parse(Console.ReadLine());

            var remainder = wormLength % wormWidth;
            var product = wormLength * wormWidth;
            var percentage = ((double)wormLength / wormWidth) * 100.00;

            if (remainder == 0 || wormWidth == 0)
            {
                Console.WriteLine($"{product:F2}");
            }
            else
            {
                Console.WriteLine($"{percentage:F2}%");
            }
        }
    }
}
