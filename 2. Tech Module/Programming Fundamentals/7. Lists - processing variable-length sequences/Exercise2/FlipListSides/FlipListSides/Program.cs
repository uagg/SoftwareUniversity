using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FlipListSides
{
    class Program
    {
        static void Main(string[] args)
        {
            var list = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var firstPosition = list[0];
            var lastPosition = list[list.Count - 1];

            var result = new List<int>();

            for (int i = 0; i < list.Count; i++)
            {
                result.Add(list[i]);
            }

            result.RemoveAt(0);
            result.RemoveAt(result.Count - 1);
            result.Reverse();

            result.Insert(0, firstPosition);
            result.Add(lastPosition);

            Console.WriteLine(string.Join(" ", result));
        }
    }
}