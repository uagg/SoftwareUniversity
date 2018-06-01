using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StuckZipper
{
    class Program
    {
        static void Main(string[] args)
        {
            var firstList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var secondList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            var concatenated = firstList.Concat(secondList);

            var minimalDigits = Math.Abs(concatenated.Min());

            uncopatibleElementsRemover(minimalDigits, firstList);
            uncopatibleElementsRemover(minimalDigits, secondList);

            var maximalLength = Math.Max(firstList.Count, secondList.Count);

            var result = new List<int>();

            for (int i  = 0; i < maximalLength; i++)
            {

                if (i <= secondList.Count - 1)
                {
                    result.Add(secondList[i]);
                }

                if (i <= firstList.Count - 1)
                {
                    result.Add(firstList[i]);
                }
            }

            Console.WriteLine(string.Join(" ", result));
        }

        static void uncopatibleElementsRemover(int minimalDigits, List<int> list)
        {
            for (int i = 0; i < list.Count; i++)
            {
                if (Math.Abs(list[i]).ToString().Length > minimalDigits.ToString().Length)
                {
                    list.Remove(list[i]);
                    i--;
                }
            }
        }
    }
}
