using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DictRefAdvanced
{
    /* Remember the DIct-Ref Problem from the previous exercise? Well this one is an Advanced Version.
     * You will begin receiving input lines containing information in one of the following formats: {key} -> {value1, value2, value3. . .}
     * {key} -> {otherKey} The keys will always be strings, and the values will always be integers, separated by a comma and a space.
     * If you are given a key and values, you must store the values to the given key. If the key already exists, you must add the given
     * values to the old ones. If you are given a key and another key, you must copy the values of the other key to the first one.
     * If the other key does not exist, this input line must be IGNORED. When you receive the command “end”, you must stop reading input lines,
     * and you must print all keys with their values, in the following format: {key} === {value1, value2, value3. . .} */
    class Program
    {
        static void Main(string[] args)
        {
            var dictionary = new Dictionary<string, List<int>>();
            var input = Console.ReadLine();

            while (input != "end")
            {
                var inputParameters = input.Split(new[] { ' ', '-', '>', ',' }, StringSplitOptions.RemoveEmptyEntries);
                var currentKey = inputParameters[0];
                var firstValue = -1;

                if (int.TryParse(inputParameters[1], out firstValue))
                {
                    if (!dictionary.ContainsKey(currentKey))
                    {
                        dictionary[currentKey] = new List<int>();
                    }

                    for (int i = 1; i < inputParameters.Length; i++)
                    {
                        dictionary[currentKey].Add(int.Parse(inputParameters[i]));
                    }
                }
                else
                {
                    var otherKey = inputParameters[1];

                    if (dictionary.ContainsKey(otherKey))
                    {
                        dictionary[currentKey] = new List<int>(dictionary[otherKey]);
                    }
                }

                input = Console.ReadLine();
            }

            foreach (var entry in dictionary)
            {
                Console.WriteLine("{0} === {1}", entry.Key, string.Join(", ", entry.Value));
            }
        }
    }
}
