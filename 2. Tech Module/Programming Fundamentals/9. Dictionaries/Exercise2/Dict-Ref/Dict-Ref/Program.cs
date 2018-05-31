using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dict_Ref
{
    /* You have been tasked to create a referenced dictionary, or in other words a dictionary, which knows how to reference itself.
     * You will be given several input lines, in one of the following formats: {name} = {value} ::: {name} = {secondName}
     * The names will always be strings, and the values will always be integers.
     * In case you are given a name and a value, you must store the given name and its value. If the name already EXISTS,
     * you must CHANGE its value with the given one. In case you are given a name and a second name, you must store the given
     * name with the same value as the value of the second name. If the given second name DOES NOT exist, you must IGNORE that input.
     * When you receive the command “end”, you must print all entries with their value, by order of input, in the following format: {entry} === {value} */
    class Program
    {
        static void Main(string[] args)
        {
            var refDict = new Dictionary<string, int>();
            var input = Console.ReadLine().Split(' ').ToArray();

            while (input[0] != "end")
            {
                int value;
                if (int.TryParse(input[2], out value))
                {
                    refDict[input[0]] = value;
                }
                else
                {
                    if (refDict.ContainsKey(input[2]))
                    {
                        var valueOfKey = refDict[input[2]];
                        refDict[input[0]] = valueOfKey;
                    }
                }
                
                input = Console.ReadLine().Split(' ').ToArray();
            }

            foreach (var entry in refDict)
            {
                Console.WriteLine($"{entry.Key} === {entry.Value}");
            }
        }
    }
}
