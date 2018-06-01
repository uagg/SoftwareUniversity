using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Winecraft
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
            var growthDays = int.Parse(Console.ReadLine());

            for (int i = 0; i < growthDays; i++)
            {
                for (int j = 0; j < grapes.Count; j++)
                {
                    grapes[i]++;
                }
            }

            for (int i = 1; i < grapes.Count - 1; i++)
            {
                var leftGrape = grapes[i - 1];
                var currentGrape = grapes[i];
                var rightGrape = grapes[i + 1];
                var greatestGrape = Math.Max(leftGrape, Math.Max(currentGrape, rightGrape));
                Console.WriteLine(greatestGrape);
            }
        }
    }
}
