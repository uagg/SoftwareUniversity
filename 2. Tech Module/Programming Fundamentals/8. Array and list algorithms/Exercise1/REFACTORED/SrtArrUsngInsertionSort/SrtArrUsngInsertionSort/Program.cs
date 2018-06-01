using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SrtArrUsngInsertionSort
{
    /* Read a list of integers on the first line of the console. After that, sort the array, using the Insertion Sort algorithm. */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            for (int i = 0; i < listOfIntegers.Count - 1; i++)
            {
                var index = i + 1;
                while (index > 0)
                {
                    if (listOfIntegers[index - 1] > listOfIntegers[index])
                    {
                        var temp = listOfIntegers[index];
                        listOfIntegers[index] = listOfIntegers[index - 1];
                        listOfIntegers[index - 1] = temp;
                    }
                    index--;
                }
            }
            Console.WriteLine(string.Join(" ", listOfIntegers));
        }
    }
}
