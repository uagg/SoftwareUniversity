﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Notifications
{
    class Program
    {
        static void Main(string[] args)
        {
            var n = int.Parse(Console.ReadLine());

            var result = string.Empty;

            for (int i = 0; i < n; i++)
            {
                var currentchar = char.Parse(Console.ReadLine());
                var encrypted = Encrypt(currentchar);

                result += encrypted;
            }
            Console.WriteLine(result);
        }

        static string Encrypt(char currentChar)
        {
            var asciiCode = (int)currentChar;

            var firstDigit = GetFirstDigit(asciiCode);
            var lastDigit = GetLastDigit(asciiCode);

            var firstSymbol = (char)(asciiCode + lastDigit);
            var lastSymbol = (char)(asciiCode - firstDigit);


            var result = $"{firstSymbol}{firstDigit}{lastDigit}{lastSymbol}";

            return result;
        }

        static int GetLastDigit(int asciiCode)
        {
            return asciiCode % 10;
        }

        static int GetFirstDigit(int asciiCode)
        {
            var firstDigit = asciiCode;

            while (firstDigit >= 10)
            {
                firstDigit /= 10;
            }

            return firstDigit;
        }
    }
}