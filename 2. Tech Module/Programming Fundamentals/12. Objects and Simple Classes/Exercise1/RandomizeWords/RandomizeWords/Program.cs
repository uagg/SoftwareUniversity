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
            var arrayOfWords = Console.ReadLine().Split(' ').ToArray();
            var rnd = new Random();

            for (int i = 0; i < arrayOfWords.Length; i++)
            {
                var rndPosition = rnd.Next(0, arrayOfWords.Length - 1);

                var temp = arrayOfWords[i];
                arrayOfWords[i] = arrayOfWords[rndPosition];
                arrayOfWords[rndPosition] = temp;
            }

            foreach (var item in arrayOfWords)
            {
                Console.WriteLine(item);
            }
        }
    }
}
