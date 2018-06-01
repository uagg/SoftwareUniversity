using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ElementsEqualToTheirIndex
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arrayOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();

            for (int i = 0; i < arrayOfIntegers.Length; i++)
            {
                if(i == arrayOfIntegers[i])
                {
                    Console.Write("{0} ",arrayOfIntegers[i]);
                }
            }
        }
    }
}
