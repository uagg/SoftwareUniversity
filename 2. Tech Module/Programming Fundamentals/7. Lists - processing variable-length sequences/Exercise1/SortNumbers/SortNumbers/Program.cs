using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SortNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            var decimalNumbers = Console.ReadLine().Split(' ').Select(decimal.Parse).ToList();
            decimalNumbers.Sort();
            Console.WriteLine(string.Join(" ", decimalNumbers));
        }
    }
}
