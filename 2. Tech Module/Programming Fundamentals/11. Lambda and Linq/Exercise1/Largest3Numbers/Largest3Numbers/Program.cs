using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Largest3Numbers
{
    /* Read a list of real numbers and print largest 3 of them. If less than 3 numbers exit, print all of them. */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfNumbers = Console.ReadLine()
                .Split(' ')
                .Select(int.Parse)
                .OrderByDescending(x => x)
                .Take(3);

            Console.WriteLine(string.Join(" ", listOfNumbers));
        }
    }
}
