using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SortArrayUsingInsertionSort
{
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            for (int i = 0; i < listOfIntegers.Count - 1; i++)
            {
                var j = i + 1;
                while (j > 0)
                {
                    if (listOfIntegers[j] < listOfIntegers[j - 1])
                    {
                        var temp = listOfIntegers[j];
                        listOfIntegers[j] = listOfIntegers[j - 1];
                        listOfIntegers[j - 1] = temp;
                    }
                    j--;
                }
            }
            Console.WriteLine(string.Join(" ", listOfIntegers));
        }
    }
}
