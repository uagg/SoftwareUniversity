using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IntegerInsertion
{
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var listOfStrings = Console.ReadLine();

            while (listOfStrings != "end")
            {
                var currentNum = int.Parse(listOfStrings);
                var firstDigit = listOfStrings[0].ToString();
                var index = int.Parse(firstDigit);

                listOfIntegers.Insert(index, currentNum);
                listOfStrings = Console.ReadLine();
            }
            Console.WriteLine(string.Join(" ", listOfIntegers));
        }
    }
}
