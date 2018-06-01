using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FlattenDictionary
{
    /* You will be given several input lines containing info about a key, an inner key and inner value, separated by SPACES.
    Your task is to store every inner key and inner value, in every key’s value. Check the Examples for more info.
    If you receive the command “flatten {key}”, you must flatten all the inner keys and inner values at the given key,
    or in other words, CONCATENATE them. When you receive the command “end”, the input ends. You must print all keys and
    their inner-keys and inner-values. Flattened inner keys and inner values, must be printed AFTER all else.
    The keys must be printed, ordered by length in descending order. All inner-keys must be printed ordered by length in ascending order.
    Flattened Values must be printed in order of input. */
    class Program
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine();
            var dictionary = new Dictionary<string, Dictionary<string, string>>();

            while (input != "end")
            {
                var tokens = input.Split(' ');

                if (tokens[0] != "flatten")
                {
                    var type = tokens[0];
                    var brand = tokens[1];
                    var model = tokens[2];

                    if (!dictionary.ContainsKey(type))
                    {
                        dictionary[type] = new Dictionary<string, string>();
                    }

                    dictionary[type][brand] = model;
                }
                else
                {
                    var type = tokens[1];

                    dictionary[type] = dictionary[type]
                        .ToDictionary(x => x.Key + x.Value, x => "flattened");
                }
                input = Console.ReadLine();
            }

            var orderedDictionary = dictionary
                .OrderByDescending(x => x.Key.Length)
                .ToDictionary(x => x.Key, x => x.Value);

            foreach (var entry in orderedDictionary)
            {
                Console.WriteLine($"{entry.Key}");

                var orderedInnerDictionary =
                    entry.Value
                    .Where(x => x.Value != "flattened")
                    .OrderBy(x => x.Key.Length)
                    .ToDictionary(x => x.Key, x => x.Value);

                var flattenedValues =
                    entry.Value
                    .Where(x => x.Value == "flattened")
                    .ToDictionary(x => x.Key, x => x.Value);

                var count = 1;

                foreach (var innerEntry in orderedInnerDictionary)
                {
                    Console.WriteLine($"{count}. {innerEntry.Key} - {innerEntry.Value}");
                    count++;
                }

                foreach (var flattenedEntry in flattenedValues)
                {
                    Console.WriteLine($"{count}. {flattenedEntry.Key}");
                    count++;
                }
            }
        }
    }
}
