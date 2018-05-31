using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Numerics;

namespace BigFactorial
{
    /* Calculate and print n! (n factorial) for very big integer n (e.g. 1000). */
    class Program
    {
        static void Main(string[] args)
        {
            var number = int.Parse(Console.ReadLine());
            BigInteger factorialResult = 1;

            for (int i = 1; i <= number; i++)
            {
                factorialResult *= i;
            }

            Console.WriteLine(factorialResult);
        }
    }
}
