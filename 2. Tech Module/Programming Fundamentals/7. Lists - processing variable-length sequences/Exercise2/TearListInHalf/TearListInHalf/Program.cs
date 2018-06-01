using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TearListInHalf
{
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            var firstList = new List<int>();
            var secondList = new List<int>();

            var result = new List<int>();

            for (int i = 0; i < listOfIntegers.Count / 2; i++)
            {
                firstList.Add(listOfIntegers[i]);

            }

            for (int i = listOfIntegers.Count / 2; i < listOfIntegers.Count; i++)
            {
                secondList.Add(listOfIntegers[i]);
            }

            for (int i = 0; i < firstList.Count; i++)
            {
                result.Add(secondList[i] / 10);
                result.Add(firstList[i]);
                result.Add(secondList[i] % 10);
            }

            Console.WriteLine(string.Join(" ", result));
        }
    }
}
