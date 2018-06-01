using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RefactorSpecialNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            int sumOfDigits = 0;
            int num = 0;
            for (int counter = 1; counter <= number; counter++)
            {
                num = counter;
                while (counter > 0)
                {
                    sumOfDigits += counter % 10;
                    counter = counter / 10;
                }
                bool isSpecial = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11);
                Console.WriteLine($"{num} -> {isSpecial}");
                sumOfDigits = 0;
                counter = num;
            }
        }
    }
}
