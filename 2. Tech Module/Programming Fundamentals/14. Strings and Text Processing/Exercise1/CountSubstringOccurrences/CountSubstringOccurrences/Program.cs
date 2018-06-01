using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountSubstringOccurrences
{
    /* Write a program to find how many times a given string appears in a given text as substring. The text is given at the first input line.
     * The search string is given at the second input line. The output is an integer number. Please ignore the character casing.
     * Overlapping between occurrences is allowed. */
    class Program
    {
        static void Main(string[] args)
        {
            var inputText = Console.ReadLine().ToLower();
            var subString = Console.ReadLine().ToLower();
            var counter = 0;
            var index = inputText.IndexOf(subString);

            while (index != -1)
            {
                counter++;
                index = inputText.IndexOf(subString, index + 1);
            }

            Console.WriteLine(counter);
        }
    }
}
