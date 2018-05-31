using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SmallestElementInArray
{
    class Program
    {
        static void Main(string[] args)
        {
            var arrayOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int smallestElement = int.MaxValue;

            for (int i = 0; i < arrayOfIntegers.Length; i++)
            {
                if (arrayOfIntegers[i] < smallestElement)
                {
                    smallestElement = arrayOfIntegers[i];
                }
            }
            Console.WriteLine(smallestElement);
        }
    }
}
