using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReverseArrayIn_place
{
    /* Read a list of integers on the first line of the console. After that, reverse the array in-place
     * (as in, don’t create a new collection to hold the result, reverse it using only the original array).
     * After you are done, print the reversed array on the console.
     * Note: You are not allowed to iterate over the list backwards and just print it, */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            for (int i = 0; i < listOfIntegers.Count / 2; i++)
            {
                var temp = listOfIntegers[i];
                listOfIntegers[i] = listOfIntegers[listOfIntegers.Count - i - 1];
                listOfIntegers[listOfIntegers.Count - i - 1] = temp;
            }
            Console.WriteLine(string.Join(" ", listOfIntegers));
        }
    }
}
