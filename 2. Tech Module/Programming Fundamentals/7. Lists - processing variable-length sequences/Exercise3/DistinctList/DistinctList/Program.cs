using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DistinctList
{
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var result = new List<int>();

            foreach (var item in listOfIntegers.Distinct())
            {
                result.Add(item);
            }
            Console.WriteLine(string.Join(" ", result));
        }
    }
}
