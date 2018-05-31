using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IncreasingSequenceOfElements
{
    class Program
    {
        static void Main(string[] args)
        {
            var arrayOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int smallestNumber = int.MinValue;
            int count = 0;
            for (int i = 0; i < arrayOfIntegers.Length; i++)
            {
                if(arrayOfIntegers[i] > smallestNumber)
                {
                    smallestNumber = arrayOfIntegers[i];
                    count++;
                }
            }
            if(count == arrayOfIntegers.Length)
            {
                Console.WriteLine("Yes");
            } else
            {
                Console.WriteLine("No");
            }

        }
    }
}
