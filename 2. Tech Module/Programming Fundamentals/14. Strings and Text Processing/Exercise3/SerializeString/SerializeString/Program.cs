using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SerializeString
{
    /* You have been tasked to serialize a string. The serialization is done in a special way, in which a character from that string is saved
     * with the indexes at which it is found. The input will consist of a single input line, containing a single string, which may consist of
     * ANY ASCII character. Your task is to serialize the string in the following way:
        {char}:{index1}/{index2}/{index3}
    The char will be the character, and the indexes, will be the indexes it is found at in the string.
    Note: This problem is a string problem, and should ONLY use strings in its solution.  */
    class Program
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine();
            var notes = new Dictionary<char, List<int>>();

            foreach (var character in input)
            {
                if (!notes.ContainsKey(character))
                {
                    for (int i = input.IndexOf(character); i > -1; i = input.IndexOf(character, i + 1))
                    {
                        if (!notes.ContainsKey(character))
                        {
                            notes[character] = new List<int>();
                        }

                        notes[character].Add(i);
                    }
                }
            }

            foreach (var entry in notes)
            {
                var ch = entry.Key;
                var indexes = entry.Value;

                Console.WriteLine($"{ch}:{string.Join("/", indexes)}");
            }
        }
    }
}
