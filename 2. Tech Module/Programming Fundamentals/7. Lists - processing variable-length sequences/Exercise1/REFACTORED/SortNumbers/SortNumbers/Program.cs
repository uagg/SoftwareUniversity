using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SortNumbers
{
    /* Read a list of decimal numbers and sort them in increasing order. */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfDecimalNumbers = Console.ReadLine().Split(' ').Select(decimal.Parse).ToList();
            listOfDecimalNumbers.Sort();
            Console.WriteLine(string.Join(" <= ", listOfDecimalNumbers));
        }
    }
}
