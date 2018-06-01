using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SquareNumbers
{
    /* Read a list of integers and extract all square numbers from it and print them in descending order.
     * A square number is an integer which is the square of any integer. For example, 1, 4, 9, 16 are square numbers. */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var result = new List<int>();

            foreach (var number in listOfIntegers)
            {
                if (Math.Sqrt(number) == (int)Math.Sqrt(number))
                {
                    result.Add(number);
                }
            }
            result.Sort((a, b) => b.CompareTo(a));
            Console.WriteLine(string.Join(" ", result));
        }
    }
}
