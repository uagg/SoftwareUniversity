using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StuckZipper
{ /* You will be given two lists of integers on the first and second line of the input respectively (space-separated).
    We want to zip these two lists together like a zipper, but one or several of the elements in either of the lists are
    too large to allow that to happen. Being larger, they have more digits than the element with the smallest amount of digits in the two lists. 
    Your task is to find any elements which have more digits than the element with the least amount of digits in the list (if such exist)
    and remove them, then zip the lists together as shown in the example.
    After you stack the lists, print the resulting list on the console (one line, space-separated). */
    class Program
    {
        static void Main(string[] args)
        {
            var firstList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var secondList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var minDigitCount = double.MaxValue;
            var maxLength = Math.Max(firstList.Count, secondList.Count);
            var result = new List<int>();

            foreach (var number in firstList)
            {
                if (Math.Floor(Math.Log10(Math.Abs(number)) + 1) < minDigitCount)
                {
                    minDigitCount = Math.Floor(Math.Log10(Math.Abs(number)) + 1);
                }
            }

            foreach (var number in secondList)
            {
                if (Math.Floor(Math.Log10(Math.Abs(number)) + 1) < minDigitCount)
                {
                    minDigitCount = Math.Floor(Math.Log10(Math.Abs(number)) + 1);
                }
            }

            for (int i = 0; i < firstList.Count; i++)
            {
                if (Math.Floor(Math.Log10(Math.Abs(firstList[i])) + 1) != minDigitCount)
                {
                    firstList.RemoveAt(i);
                    i = -1;
                }
            }

            for (int i = 0; i < secondList.Count; i++)
            {
                if (Math.Floor(Math.Log10(Math.Abs(secondList[i])) + 1) != minDigitCount)
                {
                    secondList.RemoveAt(i);
                    i = -1;
                }
            }

            for (int i = 0; i < maxLength; i++)
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
    }
}