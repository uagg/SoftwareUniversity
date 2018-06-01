using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LargestNElements
{
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var selectedNumbers = int.Parse(Console.ReadLine());

            for (int i = 0; i < listOfIntegers.Count - 1; i++)
            {
                var j = i + 1;
                while (j > 0)
                {
                    if (listOfIntegers[j] > listOfIntegers[j - 1])
                    {
                        var temp = listOfIntegers[j];
                        listOfIntegers[j] = listOfIntegers[j - 1];
                        listOfIntegers[j - 1] = temp;
                    }
                    j--;
                }
            }

            var result = new List<int>();

            for (int i = 0; i < selectedNumbers; i++)
            {
                result.Add(listOfIntegers[i]);
            }
            Console.WriteLine(string.Join(" ", result));
        }
    }
}
