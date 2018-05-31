using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NthDigit
{
    class Program
    {
        static void Main(string[] args)
        {
            long nmbr = long.Parse(Console.ReadLine());
            int idx = int.Parse(Console.ReadLine());
            byte result = (byte)FindNthDigit(nmbr, idx);
            Console.WriteLine(result);
        }
        static int FindNthDigit(long number, int index)
        {
            int currentIndex = 1;
            while(number > 0)
            {
                if(currentIndex == index)
                {
                    return (int)(number % 10);
                }
                currentIndex++;
                number /= 10;
            }
            return (int)(number % 10);
        }
    }
}
