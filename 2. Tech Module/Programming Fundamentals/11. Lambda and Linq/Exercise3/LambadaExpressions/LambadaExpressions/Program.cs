using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LambadaExpressions
{
    /* IT Researchers at the MIT (Massachusetts Institute of Technology) have discovered that, at certain (room) temperatures,
     * the lambda expressions in their code are acting strange. In particular, a dancing behavior has been observed in them.
     * The specialists choose to call this phenomenon – The Lambada expressions.
    Input
    You will be given several input lines in the following format:
    {selector} => {selectorObject}.{property}
    All elements of the input are strings. You need to store every lambada expression, as it is given.
    In some rare cases, you will receive the input “dance”, which indicates that the lambada expressions are starting to dance. When that happens,
    you must COPY the selectorObject ONCE with a dot (“.”) between it., so that it becomes “{selectorObject}.{selectorObject}”
    in every lambada expression’s condition. 
    In other words, if you have “x => x.Value”, and you say “dance”, you should get “x => x.x.Value”.
    Check the examples for more info.
    If you meet a selectorObject which already exists, you must replace its property with the given new one.
    When you receive the command “lambada”, you must stop reading input. 
    Output
    Print all lambada expressions in order of insertion. */
    class Program
    {
        static void Main(string[] args)
        {
            var collection = new Dictionary<string, string>();
            var enteredLine = Console.ReadLine().Split(" =>".ToCharArray(), StringSplitOptions.RemoveEmptyEntries).ToList();
            while (enteredLine[0] != "lambada")
            {
                if (enteredLine[0] != "dance")
                {
                    collection[enteredLine[0]] = enteredLine[1];
                }
                if (enteredLine[0] == "dance")
                {
                    collection = collection.ToDictionary(x => x.Key, x => $"{x.Key}.{x.Value}");
                }

                enteredLine = Console.ReadLine().Split(" =>".ToCharArray(), StringSplitOptions.RemoveEmptyEntries).ToList();
            }

            foreach (var item in collection)
            {
                Console.WriteLine($"{item.Key} => {item.Value}");
            }
        }
    }
}