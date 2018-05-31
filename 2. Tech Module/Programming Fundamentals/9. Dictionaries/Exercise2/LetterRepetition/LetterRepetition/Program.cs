using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LetterRepetition
{
    /* You will be given a single string, containing random ASCII character. Your task is to print every character,
     * and how many times it has been used in the string. */
    class Program
    {
        static void Main(string[] args)
        {
            var singleString = Console.ReadLine().ToArray();
            var counts = new Dictionary<char, int>();
            foreach (var character in singleString)
            {
                if (!counts.ContainsKey(character))
                {
                    counts[character] = 1;
                }
                else
                {
                    counts[character]++;
                }
            }

            foreach (var character in counts)
            {
                Console.Write(character.Key);
                Console.Write(" -> ");
                Console.WriteLine(character.Value);
            }
        }
    }
}
