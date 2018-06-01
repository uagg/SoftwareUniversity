using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SmallestElementInArray
{
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var smallestNumber = int.MaxValue;

            for (int i = 0; i < listOfIntegers.Count; i++)
            {
                if (listOfIntegers[i] < smallestNumber)
                {
                    smallestNumber = listOfIntegers[i];
                }
            }
            Console.WriteLine(smallestNumber);
        }
    }
}
