using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SumArrayElements
{
    class Program
    {
        static void Main(string[] args)
        {
            int numberOfArrayElements = int.Parse(Console.ReadLine());
            var arrayOfIntegers = new int[numberOfArrayElements];
            int sum = 0;
            for (int i = 0; i < arrayOfIntegers.Length; i++)
            {
                arrayOfIntegers[i] = int.Parse(Console.ReadLine());
                sum += arrayOfIntegers[i];
            }
            Console.WriteLine(sum);
        }
    }
}
