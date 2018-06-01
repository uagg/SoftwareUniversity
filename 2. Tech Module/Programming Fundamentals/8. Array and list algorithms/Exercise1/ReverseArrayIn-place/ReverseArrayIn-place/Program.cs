using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReverseArrayIn_place
{
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            for (int i = 0; i < listOfIntegers.Count / 2; i++)
            {
                var temp = listOfIntegers[i];
                listOfIntegers[i] = listOfIntegers[listOfIntegers.Count - 1 - i];
                listOfIntegers[listOfIntegers.Count - 1 - i] = temp;
            }
            Console.WriteLine(string.Join(" ", listOfIntegers));
        }
    }
}
