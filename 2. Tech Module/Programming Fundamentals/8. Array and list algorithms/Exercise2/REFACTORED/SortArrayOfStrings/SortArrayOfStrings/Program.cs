using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SortArrayOfStrings
{
    /* You are given an array of strings (one line, space-delimited). Sort the array using the Bubble sort or Insertion sort algorithms.
     * Instead of comparing if one string is smaller than the other (which you can’t do), you can use the string.CompareTo(str) method.
     * Once the array is sorted, print it on the console, separating the elements by spaces. */
    class Program
    {
        static void Main(string[] args)
        {
            var arrayOfStrings = Console.ReadLine().Split(' ').ToList();
            var isSorted = true;

            while (isSorted)
            {
                isSorted = false;
                for (int i = 0; i < arrayOfStrings.Count - 1; i++)
                {
                    var compare = arrayOfStrings[i].CompareTo(arrayOfStrings[i + 1]);
                    if (compare == 1)
                    {
                        var temp = arrayOfStrings[i];
                        arrayOfStrings[i] = arrayOfStrings[i + 1];
                        arrayOfStrings[i + 1] = temp;
                        isSorted = true;
                    }
                }
            }
            Console.WriteLine(string.Join(" ", arrayOfStrings));
        }
    }
}
