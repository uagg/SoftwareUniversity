using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EqSumAfterExtract
{
    /* You will be given two integer lists on the first two lines (space-separated).
     * Remove the elements in the first list from the elements in the second list.
     * If an element from the first list occurs more than once in the second list, remove all occurrences. 
     * After you remove the elements, check the sum of both lists. If the sum of both of them is equal, print “Yes. Sum: {sum}”.
     * If not print the absolute difference between the two lists in the format “No. Diff: {sum}”. */
    class Program
    {
        static void Main(string[] args)
        {
            var firstIntegerList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var secondIntegerList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var sumOfElementsInFirstList = 0;
            var sumOfElementsInSecondList = 0;

            for (int i = 0; i < firstIntegerList.Count; i++)
            {
                for (int j = 0; j < secondIntegerList.Count; j++)
                {
                    var numberInFirstList = firstIntegerList[i];
                    var numberInSecondList = secondIntegerList[j];
                    if (numberInFirstList == numberInSecondList)
                    {
                        secondIntegerList.RemoveAt(j);
                    }
                }
            }

            foreach (var number in firstIntegerList)
            {
                sumOfElementsInFirstList += number;
            }

            foreach (var number in secondIntegerList)
            {
                sumOfElementsInSecondList += number;
            }
                        
            if (sumOfElementsInFirstList == sumOfElementsInSecondList)
            {
                Console.WriteLine("Yes. Sum: {0}",sumOfElementsInSecondList);
            }
            else
            {

                Console.WriteLine("No. Diff: {0}", Math.Abs(sumOfElementsInFirstList - sumOfElementsInSecondList));
            }
            
        }
    }
}