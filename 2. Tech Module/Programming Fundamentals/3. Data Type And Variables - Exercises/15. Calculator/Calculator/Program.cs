using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculator
{
    class Program
    {
        static void Main(string[] args)
        {
            int operand1 = int.Parse(Console.ReadLine());
            string theOperator = Console.ReadLine();
            int operand2 = int.Parse(Console.ReadLine());
            switch(theOperator)
            {
                case "+":
                    Console.WriteLine("{0} + {1} = {2}",operand1, operand2, operand1 + operand2);
                    break;
                case "-":
                    Console.WriteLine("{0} - {1} = {2}", operand1, operand2, operand1 - operand2);
                    break;
                case "*":
                    Console.WriteLine("{0} * {1} = {2}", operand1, operand2, operand1 * operand2);
                    break;
                case "/":
                    Console.WriteLine("{0} / {1} = {2}", operand1, operand2, operand1 / operand2);
                    break;
            }
        }
    }
}