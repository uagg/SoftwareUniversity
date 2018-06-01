using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UnunionLists
{
    /* You will be given a sequence of integers, separated by a space. This is the primal list. Then you will
     * receive an integer N. On the next N lines, you will receive sequences of integers. Your task is to add all
     * elements that the primal list does not contain from the current sequence to the primal list and then remove
     * from the primal list, all elements which are contained in the current sequence of integers. If there are
     * several occurrences, remove all occurrences you find.
     * After you are done receiving lists and manipulating the primal list, sort the primal list and print it. */
    class Program
    {
        static void Main(string[] args)
        {
            var primalList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var numberOfLines = int.Parse(Console.ReadLine());
            for (int i = 0; i < numberOfLines; i++)
            {
                var list = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
                foreach (var number in list)
                {
                    if (primalList.Contains(number))
                    {
                        while (primalList.Contains(number))
                        {
                            primalList.Remove(number);
                        }
                    }
                    else if (!primalList.Contains(number))
                    {
                        primalList.Add(number);
                    }
                }
            }
            primalList.Sort();
            Console.WriteLine(string.Join(" ", primalList));
        }
    }
}
