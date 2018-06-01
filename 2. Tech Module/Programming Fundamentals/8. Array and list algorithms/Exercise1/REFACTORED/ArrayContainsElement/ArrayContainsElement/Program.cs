using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArrayContainsElement
{
    /* Read a list of integers on the first line of the console and an integer N from the second line of the console
     * and print whether the element is contained in the array. If it is, print “yes”, otherwise print “no”. */
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var element = int.Parse(Console.ReadLine());
            var isContained = false;
            for (int i = 0; i < listOfIntegers.Count; i++)
            {
                if (element.Equals(listOfIntegers[i]))
                {
                    isContained = true;
                }
            }
            if (isContained)
            {
                Console.WriteLine("yes");
            }
            else
            {
                Console.WriteLine("no");
            }
        }
    }
}
