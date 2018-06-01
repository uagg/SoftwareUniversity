using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RandomizeWords
{
    /* You are given a list of words in one line. Randomize their order and print each word at a separate line. */
    class Program
    {
        static void Main(string[] args)
        {
            var text = Console.ReadLine().Split(' ').ToArray();
            var rnd = new Random();

            for (int i = 0; i < text.Length; i++)
            {
                var randomIterator = rnd.Next(text.Length);
                var temp = text[i];
                text[i] = text[randomIterator];
                text[randomIterator] = temp;
            }

            foreach (var word in text)
            {
                Console.WriteLine(word);
            }
        }
    }
}
