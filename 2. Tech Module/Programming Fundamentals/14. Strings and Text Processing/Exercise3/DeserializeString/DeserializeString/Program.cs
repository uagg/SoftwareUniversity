using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DeserializeString
{
    /* Write a program, which takes the output from the previous task and turns it back into a string.
    Until you receive the line “end”, you will receive several lines of input on the console, in the following format:
    • “{letter}:{index1}/{index2}/{index…}/{indexN}”
    Your task is to take every letter and its index and form a string out of them. */
    class Program
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine();
            var lettersAndIndexes = new Dictionary<char, List<int>>();

            while (input != "end")
            {
                var tokens = input.Split(':');
                var letter = char.Parse(tokens[0]);
                
                if (!lettersAndIndexes.ContainsKey(letter))
                {
                    lettersAndIndexes[letter] = new List<int>();
                }

                foreach (var index in tokens[1].Split('/'))
                {
                    lettersAndIndexes[letter].Add(int.Parse(index));
                }

                input = Console.ReadLine();
            }

            var length = int.MinValue;

            foreach (var index in lettersAndIndexes.Values)
            {
                foreach (var ind in index)
                {
                    if (ind > length)
                    {
                        length = ind;
                    }
                }
            }

            var charArray = new char[length + 1];
            var letter2 = default(char);

            foreach (var let in lettersAndIndexes)
            {
                var currentLetter = let.Key;
                var letterIndexes = let.Value;

                foreach (var indexes in letterIndexes)
                {
                    charArray[indexes] = currentLetter;
                }
            }

            var word = new string(charArray);

            Console.WriteLine(word);
        }
    }
}