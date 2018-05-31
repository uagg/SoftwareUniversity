using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LargestElementInArray
{
    class Program
    {
        static void Main(string[] args)
        {
            int count = int.Parse(Console.ReadLine());
            int[] array = new int[count];

            for (int i = 0; i < array.Length; i++)
            {
                array[i] = int.Parse(Console.ReadLine());
            }

            int largestElement = int.MinValue;

            for (int i = 0; i < array.Length; i++)
            {
                if(array[i] > largestElement)
                {
                    largestElement = array[i];
                }
            }
            Console.WriteLine(largestElement);
        }
    }
}
