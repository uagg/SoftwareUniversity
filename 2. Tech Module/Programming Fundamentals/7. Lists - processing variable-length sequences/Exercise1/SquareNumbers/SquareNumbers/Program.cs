using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SquareNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            var result = new List<int>();

            foreach (var item in listOfIntegers)
            {
                if (Math.Sqrt(item) == (int)Math.Sqrt(item))
                {
                    result.Add(item);
                }
            }
            result.Sort((a, b) => b.CompareTo(a));

            Console.WriteLine(string.Join(" ", result));
        }
    }
}
