using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountOf_Given_Element
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arrayOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int element = int.Parse(Console.ReadLine());
            int counter = 0;

            for (int i = 0; i < arrayOfIntegers.Length; i++)
            {
                if(arrayOfIntegers[i] == element)
                {
                    counter++;
                }
            }
            Console.WriteLine(counter);
        }
    }
}
