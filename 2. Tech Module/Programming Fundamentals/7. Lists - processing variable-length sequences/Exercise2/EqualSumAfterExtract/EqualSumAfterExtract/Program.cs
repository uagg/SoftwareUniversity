using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EqualSumAfterExtract
{
    class Program
    {
        static void Main(string[] args)
        {
            var firstList = Console.ReadLine().Split(' ').ToList();
            var secondList = Console.ReadLine().Split(' ').ToList();
            var firstListSum = 0;
            var secondListSum = 0;
            var difference = 0;

            foreach (var item in firstList)
            {
                firstListSum += int.Parse(item);
            }

            foreach (var item in secondList)
            {
                if (!firstList.Contains(item))
                {
                    secondListSum += int.Parse(item);
                }
            }

            if (firstListSum == secondListSum)
            {
                Console.WriteLine($"Yes. Sum: {firstListSum}");
            } else
            {
                difference = Math.Abs(firstListSum - secondListSum);
                Console.WriteLine($"No. Diff: {difference}");
            }

        }
    }
}