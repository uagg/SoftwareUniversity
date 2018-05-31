using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RmvElementsAtOddPstn
{
    class Program
    {
        static void Main(string[] args)
        {
            var list = Console.ReadLine().Split(' ').ToList();

            for (int i = 1; i <= list.Count - 1; i++)
            {
                if (i % 2 != 0)
                {
                    Console.Write(list[i]);
                }
            }
        }
    }
}
