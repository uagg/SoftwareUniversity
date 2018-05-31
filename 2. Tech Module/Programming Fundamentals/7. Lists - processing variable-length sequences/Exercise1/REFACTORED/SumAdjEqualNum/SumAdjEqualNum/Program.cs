using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SumAdjEqualNum
{
    /* Write a program to sum all adjacent equal numbers in a list of decimal numbers, starting from left to right.
     * After two numbers are summed, the obtained result could be equal to some of its neighbors and should be summed as well (see the examples below).
     * Always sum the leftmost two equal neighbors (if several couples of equal neighbors are available).*/
    class Program
    {
        static void Main(string[] args)
        {
            var listOfNumbers = Console.ReadLine().Split(' ').Select(double.Parse).ToList();

            for (int i = 0; i < listOfNumbers.Count - 1; i++)
            {
                if (listOfNumbers[i] == listOfNumbers[i + 1])
                {
                    listOfNumbers[i] += listOfNumbers[i + 1];
                    listOfNumbers.RemoveAt(i + 1);
                    i = -1;
                }
            }
            Console.WriteLine(string.Join(" ", listOfNumbers));
        }
    }
}
