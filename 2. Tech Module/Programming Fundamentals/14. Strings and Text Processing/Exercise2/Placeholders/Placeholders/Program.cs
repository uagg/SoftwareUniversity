using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Placeholders
{
    /* Placeholders in C# are really comfortable for use, right? How about you implement them to see just how easy they are. */
    class Program
    {
        static void Main(string[] args)
        {
            var inputLines = Console.ReadLine().Split(new[] { "->" }, StringSplitOptions.RemoveEmptyEntries);

            while (inputLines[0] != "end")
            {
                var stringWithPlaceholders = inputLines[0].Trim();
                var Placeholders = inputLines[1].Split(',');
                var listOfWords = new List<string>();

                foreach (var word in Placeholders)
                {
                    var trimmedWord = word.Trim();
                    listOfWords.Add(trimmedWord);
                }

                for (int i = 0; i < listOfWords.Count; i++)
                {
                    var word = listOfWords[i];
                    stringWithPlaceholders = stringWithPlaceholders.Replace("{" + i + "}", word);
                }

                Console.WriteLine(stringWithPlaceholders);

                listOfWords.Clear();

                inputLines = Console.ReadLine().Split(new[] { "->" }, StringSplitOptions.RemoveEmptyEntries);
            }
        }
    }
}