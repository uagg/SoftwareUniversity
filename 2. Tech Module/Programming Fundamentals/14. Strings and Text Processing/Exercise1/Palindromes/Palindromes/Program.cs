using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Palindromes
{
    /* Write a program that extracts from a given text all palindromes, e.g. ABBA, lamal, exe and prints them on the console on a single line,
     * separated by comma and space. Use spaces, commas, dots, question marks and exclamation marks as word delimiters.
     * Print only unique palindromes, sorted lexicographically. */
    class Program
    {
        static void Main(string[] args)
        {
            var inputText = Console.ReadLine().Split(new[] { ' ', ',', '.', '?', '!' }, StringSplitOptions.RemoveEmptyEntries);
            var palindromes = new List<string>();

            foreach (var word in inputText)
            {
                var wordArray = word.ToCharArray();
                var firstHalf = string.Empty;
                var secondHalf = string.Empty;

                for (int i = 0; i < word.Length / 2; i++)
                {
                    firstHalf += wordArray[i];
                }

                if (word.Length % 2 == 0)
                {
                    for (int i = word.Length - 1; i >= word.Length / 2; i--)
                    {
                        secondHalf += wordArray[i];
                    }
                }
                else
                {
                    for (int i = word.Length - 1; i > word.Length / 2; i--)
                    {
                        secondHalf += wordArray[i];
                    }
                }

                if (firstHalf.Equals(secondHalf))
                {
                    palindromes.Add(word);
                }
            }

            palindromes.Sort();

            var result = new List<string>();

            foreach (var palindrome in palindromes.Distinct())
            {
                result.Add(palindrome);
            }

            Console.WriteLine(string.Join(", ", result));
        }
    }
}
