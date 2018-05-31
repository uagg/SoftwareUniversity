using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountRealNumbers
{
    /* Read a list of real numbers and print them in ascending order along with their number of occurrences. */
    class Program
    {
        static void Main(string[] args)
        {
            var numbersArray = Console.ReadLine().Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(double.Parse).ToArray();
            var counts = new SortedDictionary<double, int>();

            foreach (var number in numbersArray)
            {
                if (!counts.ContainsKey(number))
                {
                    counts[number] = 1;
                }
                else
                {
                    counts[number]++;
                }
            }
            foreach (var count in counts.Keys)
            {
                Console.WriteLine($"{count} -> {counts[count]}");
            }
        }
    }
}
