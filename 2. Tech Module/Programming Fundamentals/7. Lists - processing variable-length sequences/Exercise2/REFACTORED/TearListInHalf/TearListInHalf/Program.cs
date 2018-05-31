using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TearListInHalf
{
    /* You will receive a list of integers on the first input line(space-separated). Your task is to separate the list into two parts. */
    class Program
    {
        static void Main(string[] args)
        {
            var list = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var leftHalf = new List<int>();
            var RightHalf = new List<int>();
            var result = new List<int>();

            for (int i = 0; i < list.Count / 2; i++)
            {
                leftHalf.Add(list[i]);
            }

            for (int j = list.Count / 2; j < list.Count; j++)
            {
                RightHalf.Add(list[j]);
            }

            for (int i = 0; i < leftHalf.Count; i++)
            {
                result.Add(RightHalf[i] / 10);
                result.Add(leftHalf[i]);
                result.Add(RightHalf[i] % 10);
            }
            Console.WriteLine(string.Join(" ", result));
        }
    }
}
