using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KeyKeyValueValue
{
    /* Write a program, which searches for a key and value inside of several key-value pairs.
     * •	On the first line, you will receive a key. 
     * •	On the second line, you will receive a value. 
     * •	On the third line, you will receive N. 
     * •	On the next N lines, you will receive strings in the following format: “key => {value 1};{value 2};…{value X}”
     * After you receive N key -> values pairs, your task is to go through them and print only the keys, which contain the 
     * key and the values, which contain the value. Print them in the following format:
    {key}:
        -{value1}
        -{value2}
        …
        -{valueN} */
    class Program
    {
        static void Main(string[] args)
        {
            var dictionary = new Dictionary<string, List<string>>();
            var key = Console.ReadLine();
            var value = Console.ReadLine();
            var lines = int.Parse(Console.ReadLine());

            for (int count = 0; count < lines; count++)
            {
                var currentLine = Console.ReadLine().Split(new[] { ' ', ';' });
                var givenKey = currentLine[0];
                var givenValues = currentLine.Skip(2);

                if (givenKey.Contains(key))
                {
                    if (!dictionary.ContainsKey(givenKey))
                    {
                        dictionary[givenKey] = new List<string>();
                    }

                    foreach (var vallue in givenValues)
                    {
                        if (value.Contains(vallue) || vallue.Contains(value))
                        {
                            dictionary[givenKey].Add(vallue);
                        }
                    }
                }
            }

            foreach (var item in dictionary)
            {
                Console.WriteLine("{0}:", item.Key);

                foreach (var element in item.Value)
                {
                    Console.WriteLine("-{0}", element);
                }
            }
        }
    }
}
