using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WineCraft
{
    /* You will be given a sequence of integers, which will represent grapes.
     * On the next line you will be given N - an integer, indicating the growth days.
     * You must increment every integer in the list by 1 N times. However, if one of the
     * grapes’ value is greater than the grape to its left and is also greater than the one to his right,
     * it should steal the values, which would have been incremented to its neighbors, and add them to itself,
     * instead of being incremented by 1 like normal (note: if any of the greater grapes’ neighboring grapes have a value of 0,
     * DON’T decrement it and DON’T add its value to the greater grape).
     * Lesser grapes don’t get incremented, but instead they have their values decremented by 1 by their neighboring greater grapes,
     * therefore their values get added to the greater grapes.
     * After you're done with the growing (processed the grapes N times), every grape which has a value, lower than N should be removed.
     * The process should then repeat, again incrementing everything N times, where the greater grapes steal from the lesser grapes,
     * until your list contains less than N grapes.
     * After that, print the remaining grapes on the console (one line, space-separated). */
    class Program
    {
        static void Main(string[] args)
        {
            var grapes = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            int n = int.Parse(Console.ReadLine());

            while (grapes.Count > n)
            {
                for (int i = 1; i <= n; i++)
                {
                    IncrementAllElements(grapes);
                    for (int j = 0; j < grapes.Count; j++)
                    {
                        ProcessElements(grapes, j);
                    }
                }
                RemoveElement(grapes, n);
            }
            Console.WriteLine(string.Join(" ", grapes));
        }
        static void ProcessElements(List<int> list, int j)
        {
            var isFirstElement = j == 0;
            var isLastElement = j == list.Count - 1;

            if (!isFirstElement && !isLastElement)
            {
                var previousIndex = j - 1;
                var nextIndex = j + 1;
                var isGreater = list[j] > list[previousIndex] && list[j] > list[nextIndex];

                if (isGreater)
                {
                    list[j]--;

                    if (list[previousIndex] > 0)
                    {
                        list[j]++;
                        list[previousIndex] = Math.Max(list[previousIndex] - 2, 0);
                    }

                    if (list[nextIndex] > 0)
                    {
                        list[j]++;
                        list[nextIndex] = Math.Max(list[nextIndex] - 2, 0);
                    }
                }
            }
        }

        static void IncrementAllElements(List<int> list)
        {
            for (int i = 0; i < list.Count; i++)
            {
                list[i]++;
            }
        }

        static void RemoveElement(List<int> list, int n)
        {
            for (int i = 0; i < list.Count; i++)
            {
                if (list[i] <= n)
                {
                    list.RemoveAt(i);
                    i--;
                }
            }
        }
    }
}