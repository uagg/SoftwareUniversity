using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LargestNElement
{
    /* Read a list of integers on the first line of the console. On the next line, you will receive an integer N.
     * After that, find and print the largest N elements the array, sorted in descending order. */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var n = int.Parse(Console.ReadLine());
            for (int i = 0; i < listOfIntegers.Count - 1; i++)
            {
                var j = i + 1;

                while (j > 0)
                {
                    if (listOfIntegers[j - 1] < listOfIntegers[j])
                    {
                        var temp = listOfIntegers[j - 1];
                        listOfIntegers[j - 1] = listOfIntegers[j];
                        listOfIntegers[j] = temp;
                    }
                    j--;
                }
            }

            for (int i = 0; i < n; i++)
            {
                Console.Write("{0} ", listOfIntegers[i]);
            }
        }
    }
}
