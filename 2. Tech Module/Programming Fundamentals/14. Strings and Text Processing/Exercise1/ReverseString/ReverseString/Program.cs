using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReverseString
{
    /* Write a program that reads a string from the console, reverses it and prints the result back at the console. */
    class Program
    {
        static void Main(string[] args)
        {
            var inputText = Console.ReadLine();
            var outputText = new StringBuilder();

            for (int i = inputText.Length - 1; i >= 0; i--)
            {
                outputText.Append(inputText[i]);
            }

            Console.WriteLine(outputText);
        }
    }
}
