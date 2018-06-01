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
            var factorialOf = int.Parse(Console.ReadLine());
            BigInteger factorial = 1;

            for (int i = factorialOf; i > 0; i--)
            {
                factorial *= i;
            }
            Console.WriteLine(factorial);
        }
    }
}
