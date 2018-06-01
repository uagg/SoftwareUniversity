using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FindTheLetter
{
    /* Write a program, which receives a string and prints the index of a given letter in the string.
     * The tricky part is that you will have to find not the first letter, but the nth letter. */
    class Program
    {
        static void Main(string[] args)
        {
            var strings = Console.ReadLine();
            var tokens = Console.ReadLine().Split(' ').ToArray();
            var letter = char.Parse(tokens[0]);
            var occurrence = int.Parse(tokens[1]);

            var indexCounter = -1;
            var letterCounter = 0;

            for (int i = 0; i < strings.Length; i++)
            {
                indexCounter++;

                if (strings[i].Equals(letter))
                {
                    letterCounter++;
                }

                if (letterCounter == occurrence)
                {
                    i = strings.Length;
                }
            }

            if (letterCounter < occurrence)
            {
                Console.WriteLine("Find the letter yourself!");
            }
            else if (letterCounter == occurrence)
            {
                Console.WriteLine(indexCounter);
            }
        }
    }
}