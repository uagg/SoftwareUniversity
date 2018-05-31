using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StringDecryption
{
    /* Write a program, which can decipher an array of integers into a string message. */
    class Program
    {
        static void Main(string[] args)
        {
            var numbers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var arrayOfNumbers = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            var result = arrayOfNumbers.Where(x => x >= 65 && x <= 90).ToList().Skip(numbers[0]).Take(numbers[1]);

            Console.WriteLine(string.Join(string.Empty, result.Select(x => (char)x)));
        }
    }
}