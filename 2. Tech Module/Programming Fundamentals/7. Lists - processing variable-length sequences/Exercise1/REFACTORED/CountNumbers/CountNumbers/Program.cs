using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountNumbers
{
    /* Read a list of integers in range [0…1000] and print them in ascending order along with their number of occurrences. */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            listOfIntegers.Sort();
            listOfIntegers.Add(int.MaxValue);
            var counter = 1;

            for (int i = 0; i < listOfIntegers.Count - 1; i++)
            {
                if (listOfIntegers[i] == listOfIntegers[i + 1])
                {
                    counter++;
                }
                else
                {
                    Console.WriteLine($"{listOfIntegers[i]} -> {counter}");
                    counter = 1;
                }
            }
        }
    }
}
