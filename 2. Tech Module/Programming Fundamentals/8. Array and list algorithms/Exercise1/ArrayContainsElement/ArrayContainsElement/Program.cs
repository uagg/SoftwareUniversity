using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArrayContainsElement
{
    class Program
    {
        static void Main(string[] args)
        {
            var listOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var contain = int.Parse(Console.ReadLine());
            var isFound = false;
            
            foreach (var item in listOfIntegers)
            {
                if (contain == item)
                {
                    isFound = true;
                    Console.WriteLine("yes");
                    break;
                }
            }
            if (!isFound)
            {
                Console.WriteLine("no");
            }
        }
    }
}
