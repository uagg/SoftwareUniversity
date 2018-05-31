using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArrayData
{
    /* You will receive a list of integers, each separated with a single space. On the next line, you will receive one of the
     * following commands: “Min”, “Max” or “All”. Your task is to remove all numbers, which are smaller than the average of
     * the initial list and depending on the next command, to print an additional line: 
    •	If the command is “Min” – print the smallest element from the remaining numbers.
    •	If the command is “Max” – print the largest element from the remaining numbers.
    •	If the command is “All” – print all of the remaining numbers ordered in ascending order and separated by a single whitespace. */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var average = listOfIntegers.Average();
            listOfIntegers.RemoveAll(x => x < average);

            var command = Console.ReadLine();

            switch (command)
            {
                case "Min":
                    Console.WriteLine(listOfIntegers.Min());
                    break;
                case "Max":
                    Console.WriteLine(listOfIntegers.Max());
                    break;
                case "All":
                    Console.WriteLine(string.Join(" ", listOfIntegers.OrderBy(x => x)));
                    break;
            }
        }
    }
}
