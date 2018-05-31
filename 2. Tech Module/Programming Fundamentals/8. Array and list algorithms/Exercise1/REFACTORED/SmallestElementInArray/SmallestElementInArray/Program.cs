using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SmallestElementInArray
{
    /* Read a list of integers on the first line of the console. After that, find the smallest element in the array and print it on the console. */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var smallestElement = int.MaxValue;

            foreach (var number in listOfIntegers)
            {
                if (number < smallestElement)
                {
                    smallestElement = number;
                }
            }
            Console.WriteLine(smallestElement);
        }
    }
}
