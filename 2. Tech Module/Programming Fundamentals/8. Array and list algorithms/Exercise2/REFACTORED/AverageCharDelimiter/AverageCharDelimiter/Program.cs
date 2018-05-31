using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AverageCharDelimiter
{
    /* You will receive an array of strings as input. Your task is to find the average character within every string in the array.
     * As in, take every character’s ASCII code, sum it and divide the result by the sum of the count of all the letters in the array. */
    class Program
    {
        static void Main(string[] args)
        {
            var arrayOfStrings = Console.ReadLine().Split(' ').ToArray();
            var sum = 0;
            var divider = 0;

            for (int i = 0; i < arrayOfStrings.Length; i++)
            {
                foreach (var item in arrayOfStrings[i])
                {
                    sum += item;
                    divider++;
                }
            }
            var character = (sum / divider);
            var toUpper = Char.ToUpper((char)character);
            Console.WriteLine(string.Join($"{toUpper}", arrayOfStrings));
        }
    }
}