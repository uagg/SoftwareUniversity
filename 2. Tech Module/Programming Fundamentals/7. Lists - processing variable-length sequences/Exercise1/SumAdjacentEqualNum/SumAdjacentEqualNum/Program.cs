using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SumAdjacentEqualNum
{
    class Program
    {
        static void Main(string[] args)
        {
            var inputList = Console.ReadLine().Split(' ').Select(double.Parse).ToList();

            for (int i = 0; i < inputList.Count - 1; i++)
            {
                var firstNumber = inputList[i];
                var secondNumber = inputList[i + 1];

                if (firstNumber == secondNumber)
                {
                    inputList[i] += inputList[i + 1];
                    inputList.RemoveAt(i + 1);
                    i -= 2;

                    if (i < -1)
                    {
                        i = -1;
                    }
                }
            }

            Console.WriteLine(string.Join(" ", inputList));
        }
    }
}
