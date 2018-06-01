using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppendLists
{
    /* Write a program to append several lists of numbers. Lists are separated by ‘|’.
     * Values are separated by spaces (‘ ’, one or several).
     * Order the lists from the last to the first, and their values from left to right.*/
    class Program
    {
        static void Main(string[] args)
        {
            var list = Console.ReadLine().Split('|').ToList();
            list.Reverse();

            foreach (var item in list)
            {
                var numbers = item.Split(' ').ToList();
                foreach (var number in numbers)
                {
                    if (number != "")
                    {
                        Console.Write("{0} ", number);
                    }
                }
            }
        }
    }
}
