using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MinMethod
{
    class Program
    {
        static void Main(string[] args)
        {
            int number1 = int.Parse(Console.ReadLine());
            int number2 = int.Parse(Console.ReadLine());
            int number3 = int.Parse(Console.ReadLine());
            int result1 = GetMin(number1, number2);
            int result2 = GetMin(result1, number3);
            Console.WriteLine(result2);
        }
        static int GetMin(int a, int b)
        {
            return Math.Min(a, b);
        }
    }
}