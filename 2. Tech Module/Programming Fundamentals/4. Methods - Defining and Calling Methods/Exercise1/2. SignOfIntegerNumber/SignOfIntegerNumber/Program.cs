using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SignOfIntegerNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            PrintSign(number);
        }
        static void PrintSign(int n)
        {
            if(n > 0)
            {
                Console.WriteLine("The number {0} is positive.", n);
            } else if(n == 0)
            {
                Console.WriteLine("The number {0} is zero.", n);
            } else
            {
                Console.WriteLine("The number {0} is negative.", n);
            }
        }
    }
}
