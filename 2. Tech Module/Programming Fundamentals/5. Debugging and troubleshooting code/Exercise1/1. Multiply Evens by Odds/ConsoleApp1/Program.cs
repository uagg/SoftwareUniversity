using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main()
        {
            var num = int.Parse(Console.ReadLine());
            var result = GetMultipleOfOddEventDigits(num);
            Console.WriteLine(result);
        }

        private static long GetMultipleOfOddEventDigits(int num)
        {
            var oddSum = SumOddDigits(num);
            var evenSum = SumEvenDigits(num);
            return oddSum * evenSum;
        }

        private static long SumOddDigits(int num)
        {
            long sum = 0;
            num = Math.Abs(num);
            while (num > 0)
            {
                var digit = num % 10;
                if (digit % 2 != 0)
                {
                    sum = sum + digit;
                }
                num = num / 10;
            }
            return sum;
        }

        private static long SumEvenDigits(int num)
        {
            long sum = 0;
            num = Math.Abs(num);
            while (num > 0)
            {
                var digit = num % 10;
                if (digit % 2 == 0)
                {
                    sum = sum + digit;
                }
                num = num / 10;
            }
            return sum;
        }
    }
}
