using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OddNumbersOddPositions
{
    class Program
    {
        static void Main(string[] args)
        {
            var arrayOfNumbers = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();

            for (int i = 0; i < arrayOfNumbers.Length; i++)
            {
                if(i % 2 != 0)
                {
                    if(arrayOfNumbers[i] % 2 != 0)
                    {
                        Console.WriteLine($" Index {i} -> {arrayOfNumbers[i]}");
                    }
                }
            }
        }
    }
}
