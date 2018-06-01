using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountOfOddNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            var arrayOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int oddCounter = 0;
            for (int i = 0; i < arrayOfIntegers.Length; i++)
            {
                if(arrayOfIntegers[i] % 2 != 0)
                {
                    oddCounter++;
                }
            }
            Console.WriteLine(oddCounter);
        }
    }
}
