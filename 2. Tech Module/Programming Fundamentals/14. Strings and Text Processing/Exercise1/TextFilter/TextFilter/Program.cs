using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TextFilter
{
    /* Write a program that takes a text and a string of banned words. All words included in the ban list should be replaced with
     * asterisks "*", equal to the word's length. The entries in the ban list will be separated by a comma and space ", ".
     * The ban list should be entered on the first input line and the text on the second input line. */
    class Program
    {
        static void Main(string[] args)
        {
            var bannedWords = Console.ReadLine().Split(new[] { ',', ' ' }, StringSplitOptions.RemoveEmptyEntries).ToArray();
            var text = Console.ReadLine();

            foreach (var word in bannedWords)
            {
                if (text.Contains(word))
                {
                    text = text.Replace(word, new String('*', word.Length));
                }
            }

            Console.WriteLine(text);
        }
    }
}
