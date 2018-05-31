using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SortArrayUsingBubbleSort
{
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var isFound = true;

            while (isFound)
            {
                isFound = false;
                for (int i = 0; i < listOfIntegers.Count - 1; i++)
                {
                    if (listOfIntegers[i] > listOfIntegers[i + 1])
                    {
                        var temp = listOfIntegers[i];
                        listOfIntegers[i] = listOfIntegers[i + 1];
                        listOfIntegers[i + 1] = temp;
                        isFound = true;
                    }
                }
            }
            Console.WriteLine(string.Join(" ", listOfIntegers));
        }
    }
}
