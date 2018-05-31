using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArrayHistogram
{
    /* You will be given a string array on the console (single line, space-separated).
     * Your task is to make statistics about the elements of the array.
     * Find out how many times each word occurs in the array. After which,
     * sort the result by the count of occurrences in descending order and print statistics
     * about every word in the following format: {word} -> {count} times ({percentage:F2}%) */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfStrings = Console.ReadLine().Split(' ').ToList();
            var occurrences = new List<int>();
            var occurrencesCounter = 0;

            for (int i = 0; i < listOfStrings.Count; i++)
            {
                if (!listOfStrings[i].Equals(listOfStrings[i + 1]))
                {
                    foreach (var word in listOfStrings)
                    {
                        if (listOfStrings[i] == word)
                        {
                            occurrencesCounter++;
                        }
                    }
                }
                occurrences.Add(occurrencesCounter);
                occurrencesCounter = 0;
                Console.WriteLine("{0} -> {1} times", listOfStrings[i], occurrences[i]);

            }
        }
    }
}
