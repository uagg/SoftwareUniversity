using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DefaultValues
{
    /* You will be given several key-value pairs in the following format: “{key} -> {value}”
    Your task is to store all these pairs until you receive the command “end”. When you do receive the ending command,
    you must read one last line, containing the default value. Then you must change all values, which are equal to “null” with the given default value.
    At the end, you must print all key-value pairs, which have NOT been replaced with the default value, ordered in descending order,
    by their value’s length. After them, you must print all key-value pairs which HAVE been replaced with the default value, in order of input.
    Each key-value pair, must be printed in the following format: “{key} <-> {value}”. All variables in the program logic are strings.
    Note: If you receive the same key twice or more times, you should update its value every time. */
    class Program
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine();
            var storage = new Dictionary<string, string>();
            var defaultValue = string.Empty;
            var changedWithDefaultValue = new Dictionary<string, string>();

            while (input != "end")
            {
                var tokens = input.Split(new[] { ' ', '-', '>' }, StringSplitOptions.RemoveEmptyEntries);
                var key = tokens[0];
                var value = tokens[1];
                storage[key] = value;
                input = Console.ReadLine();
            }

            defaultValue = Console.ReadLine();

            foreach (var item in storage)
            {
                var key = item.Key;
                var value = item.Value;


                if (value == "null")
                {
                    changedWithDefaultValue[key] = defaultValue;
                }
                else
                {
                    changedWithDefaultValue[key] = value;
                }
            }

            storage = 
                storage
                .Where(x => x.Value != "null")
                .OrderByDescending(x => x.Value.Length)
                .ToDictionary(x => x.Key, x => x.Value);

            changedWithDefaultValue = changedWithDefaultValue
                .Where(x => x.Value == defaultValue)
                .OrderByDescending(x => x.Value.Length)
                .ToDictionary(x => x.Key, x => x.Value);

            foreach (var item in storage)
            {
                var key = item.Key;
                var value = item.Value;

                Console.WriteLine($"{key} <-> {value}");
            }

            foreach (var item in changedWithDefaultValue)
            {
                var key = item.Key;
                var value = item.Value;

                Console.WriteLine($"{key} <-> {value}");
            }
        }
    }
}
