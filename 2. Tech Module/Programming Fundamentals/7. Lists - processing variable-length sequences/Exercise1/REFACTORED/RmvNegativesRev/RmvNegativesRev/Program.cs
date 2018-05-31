using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RmvNegativesRev
{
    /* Read a list of integers, remove all negative numbers from it and print the remaining elements in reversed order.
	 * In case of no elements left in the list, print “empty”.*/
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            for (int i = 0; i < listOfIntegers.Count; i++)
            {
                if (listOfIntegers[i] < 0)
                {
                    listOfIntegers.Remove(listOfIntegers[i]);
                    i = -1;
                }
            }

            if (listOfIntegers.Count == 0)
            {
                Console.WriteLine("empty");
            }
            else
            {
                listOfIntegers.Reverse();
                Console.WriteLine(string.Join(" ", listOfIntegers));
            }
        }
    }
}