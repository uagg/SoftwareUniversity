using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UnunionLists
{
    class Program
    {
        static void Main(string[] args)
        {
            var primalList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var count = int.Parse(Console.ReadLine());

            for (int i = 0; i < count; i++)
            {
                var nLines = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

                foreach (var item in nLines)
                {
                    if (!primalList.Contains(item))
                    {
                        primalList.Add(item);
                    } else
                    {
                        primalList.RemoveAll(x => x == item);
                    }
                }
            }

            primalList.Sort();
            Console.WriteLine(string.Join(" ", primalList));
        }
    }
}
