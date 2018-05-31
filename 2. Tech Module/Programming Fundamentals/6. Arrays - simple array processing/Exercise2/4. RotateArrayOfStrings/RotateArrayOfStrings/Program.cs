using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RotateArrayOfStrings
{
    class Program
    {
        static void Main(string[] args)
        {
            var arrayOfStrings = Console.ReadLine().Split().ToArray();
            var rotatedArray = new string[arrayOfStrings.Length];

            for (int i = 0; i < arrayOfStrings.Length - 1; i++)
            {
                rotatedArray[i + 1] = arrayOfStrings[i];
            }

            var lastElement = arrayOfStrings[rotatedArray.Length - 1];
            rotatedArray[0] = lastElement;

            Console.WriteLine(string.Join(" ", rotatedArray));
        }
    }
}
