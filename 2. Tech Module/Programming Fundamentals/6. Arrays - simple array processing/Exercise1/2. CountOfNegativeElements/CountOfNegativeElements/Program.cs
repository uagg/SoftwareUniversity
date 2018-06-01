using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountOfNegativeElements
{
    class Program
    {
        static void Main(string[] args)
        {
            int count = int.Parse(Console.ReadLine());

            int[] array = new int[count];

            int negativeElementsCounter = 0;

            for (int i = 0; i < array.Length; i++)
            {
                array[i] = int.Parse(Console.ReadLine());
            }

            for (int i = 0; i < array.Length; i++)
            {
                if(array[i] < 0)
                {
                    negativeElementsCounter++;
                }
            }
            Console.WriteLine(negativeElementsCounter);
        }
    }
}
