using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArraySymmetry
{
    class Program
    {
        static void Main(string[] args)
        {
            var arrayOfStrings = Console.ReadLine().Split(' ').ToArray();
            string[] reversed = new string[arrayOfStrings.Length];
            bool isSymmetric = true;
            for (int i = 0; i < arrayOfStrings.Length; i++)
            {
                reversed[i] = arrayOfStrings[i];
            }
            Array.Reverse(reversed);
            for (int i = 0; i < arrayOfStrings.Length; i++)
            {
                if (reversed[i] != arrayOfStrings[i])
                {
                    isSymmetric = false;
                }
            }
            if (isSymmetric)
            {
                Console.WriteLine("Yes");
            }
            else
            {
                Console.WriteLine("No");
            }
        }
    }
}
