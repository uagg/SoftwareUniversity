using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FlipListSides
{
    /* You will receive an integer list on the first line of the input (space-separated).
     * Leave the first, middle and last elements as they are. For every other element,
     * exchange it with its opposite indexed element (list[1]  list[length-2] and so on…).
     * After that, print the list on the console (space-separated).
     * NOTE: If the list has an even number of elements, as there is no middle element,
     * flip all the elements except for the first and last ones. */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var firstElement = listOfIntegers[0];
            var lastElement = listOfIntegers[listOfIntegers.Count - 1];
            var result = new List<int>();

            for (int i = 0; i < listOfIntegers.Count; i++)
            {
                result.Add(listOfIntegers[i]);
            }
            result.RemoveAt(0);
            result.RemoveAt(result.Count - 1);
            result.Reverse();
            result.Insert(0, firstElement);
            result.Add(lastElement);
            Console.WriteLine(string.Join(" ", result));
        }
    }
}
