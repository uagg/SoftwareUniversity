using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InsertionSortUsingList
{
    /* Read a list of integers on the first line of the console. After that, sort the array,
     * using the Insertion Sort algorithm, but instead of doing it in-place, add the result one by one to a list. */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            for (int i = 0; i < listOfIntegers.Count - 1; i++)
            {
                int j = i + 1;
                while (j > 0)
                {
                    if (listOfIntegers[j - 1] > listOfIntegers[j])
                    {
                        var temp = listOfIntegers[j - 1];
                        listOfIntegers[j - 1] = listOfIntegers[j];
                        listOfIntegers[j] = temp;
                    }
                    j--;
                }
            }
            Console.WriteLine(string.Join(" ", listOfIntegers));
        }
    }
}
