using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SortArrUsingBubbleSort
{
    /* Read a list of integers on the first line of the console. After that, sort the array, using the Bubble Sort algorithm. */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var isSwapped = true;

            while (isSwapped)
            {
                isSwapped = false;

                for (int i = 0; i < listOfIntegers.Count - 1; i++)
                {
                    if (listOfIntegers[i] > listOfIntegers[i + 1])
                    {
                        var temp = listOfIntegers[i];
                        listOfIntegers[i] = listOfIntegers[i + 1];
                        listOfIntegers[i + 1] = temp;
                        isSwapped = true;
                    }
                }
            }
            Console.WriteLine(string.Join(" ", listOfIntegers));
        }
    }
}
