using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQuistics
{
    /* LINQ is the greatest .NET component of all time. You can do almost anything with it. That’s why you have been tasked to do almost everything you can with it.
    Input
    You will be given several input lines containing information about collections, and LINQ methods that have been called on them, in the following format:
    {collection}.{method1}().{method2}()....{methodN}()
    The count of methods may vary. Your task is to store every collection and the methods that have been executed on it. If the collection already exists,
    you must ADD the new methods to it. Duplicate methods should be REMOVED.
    Output
    If you are given only a collection name, you must print the methods that have been executed on the collection, ordered by their length in descending order.
    If 2 methods have the same length, order them by the count of unique symbols they have in their names in descending order.
    Each method must be printed on a new line, with a prefixed asterisk and space (“* ”).
    If the collection name does NOT exist, you should IGNORE that line of input. 
    If you are given only a digit, you must take the collection which has the most methods, and print the first N methods, with the lowest length
    (N being the digit given in the input). If there are less than N methods you must print all of them in the same order.
    NOTE: When printing, you must print only the method name, without its brackets (e.g. “First”, not “First()”).
    The input sequence ends when you receive the command “exit”. After the ending command, you will receive one last line in the following format:
    {method} {selection}
    You must take all collections, which CONTAIN the given method, and print them. The selection will either be “collection” or “all”. 
    If you have “collection”, you must print only the collections’ names in the final output.
    If you have “all”, you must print the collections and their methods in the following format:
    {collection}
     * {method1}
     * {method2}
    ...
    The collections must be printed ordered by the count of their methods in descending order.
    If 2 collections have the same amount of methods, print the one whose shortest method name is longer than the other one’s shortest method name.
    The methods must be printed, ordered by their length in descending order. */
    class Program
    {
        static void Main(string[] args)
        {
            var collection = new Dictionary<string, HashSet<string>>();
            var input = Console.ReadLine().Split(" .()".ToCharArray(), StringSplitOptions.RemoveEmptyEntries).ToList();
            while (input[0] != "exit")
            {
                if (input.Count > 1)
                {
                    var collectionsName = input[0];
                    input.RemoveAt(0);
                    if (!collection.ContainsKey(collectionsName))
                    {
                        collection[collectionsName] = new HashSet<string>();
                    }
                    foreach (var method in input)
                    {
                        collection[collectionsName].Add(method);
                    }
                }
                else
                {
                    int number = 0;
                    if (int.TryParse(input[0], out number))
                    {
                        collection.Values.OrderByDescending(coll => coll.Count).Take(1).ToList()
                            .ForEach(x => Console.WriteLine(
                                $"* {string.Join("\n* ", x.OrderBy(m => m.Length).Take(number))}"));
                    }
                    else
                    {
                        if (collection.ContainsKey(input[0]))
                        {
                            collection[input[0]].OrderByDescending(x => x.Length).ThenByDescending(x => x.Distinct().Count()).ToList()
                                .ForEach(x => Console.WriteLine($"* {x}"));
                        }
                    }
                }

                input = Console.ReadLine().Split(" .()".ToCharArray(), StringSplitOptions.RemoveEmptyEntries).ToList();
            }
            var LastInput = Console.ReadLine().Split(" .()".ToCharArray(), StringSplitOptions.RemoveEmptyEntries).ToList();

            if (LastInput[1] == "all")
            {
                var resultCollection = collection.OrderByDescending(coll => coll.Value.Count)
                    .ThenByDescending(coll => coll.Value.Min(meth => meth.Length));
                foreach (var item in resultCollection.Where(coll => coll.Value.Contains(LastInput[0])))
                {
                    Console.WriteLine(item.Key);
                    foreach (var meth in item.Value.OrderByDescending(i => i.Length))
                    {
                        Console.WriteLine($"* {meth}");
                    }
                }
            }
            else
            {
                var resultCollection = collection.OrderByDescending(coll => coll.Value.Count)
                   .ThenByDescending(coll => coll.Value.Min(meth => meth.Length));
                foreach (var item in resultCollection.Where(coll => coll.Value.Contains(LastInput[0])))
                {
                    Console.WriteLine(item.Key);
                }
            }
        }
    }
}
