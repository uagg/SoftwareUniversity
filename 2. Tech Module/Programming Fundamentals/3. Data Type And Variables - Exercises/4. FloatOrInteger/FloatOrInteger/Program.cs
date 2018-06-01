using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FloatOrInteger
{
    class Program
    {
        static void Main(string[] args)
        {
            double number = double.Parse(Console.ReadLine());
            if (number % 1 != 0)
            {
                number = Math.Round(number);
                Console.WriteLine("{0:F0}", number);
            } else
            {
                Console.WriteLine("{0:F0}", number);
            }
        }
    }
}
