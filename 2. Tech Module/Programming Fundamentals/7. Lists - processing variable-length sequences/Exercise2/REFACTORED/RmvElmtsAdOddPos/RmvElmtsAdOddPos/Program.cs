using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RmvElmtsAdOddPos
{
    /* Write a program which reads a list of space-separated strings and removes the elements at positions [1…3…5…7…etc.].
     * After that, print the elements with no delimiter. Note that positions are counted from 1. */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfStrings = Console.ReadLine().Split(' ').ToList();

            for (int i = 0; i < listOfStrings.Count; i++)
            {
                if (i % 2 != 0)
                {
                    Console.Write(listOfStrings[i]);
                }
            }
        }
    }
}
