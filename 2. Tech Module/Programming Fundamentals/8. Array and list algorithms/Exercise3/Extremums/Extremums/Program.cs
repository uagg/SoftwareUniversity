using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Extremums
{
    /*You are given a sequence of non-negative integers and a command (Min or Max). 
    Depending on the command, you must find the maximum or the minimum sum of numbers formed by the rotations of the digits of every element in the sequence. 
    You are allowed to use only rotations to form the numbers (you cannot swap digits, only rotations). 
    Input:
    •	On the first line you will receive integers, separated by a space, in range [0…100000];
    •	On the second line you will receive a string containing the one of the words “Min” or “Max”.
    Output:
    •	The numbers which form the result min / max sum separated by comma and space (‘, ’);
    •	A single integer number representing the minimum or the maximum sum of the numbers.*/

    class Program
    {
        static void Main(string[] args)
        {
            List<int> inputList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            string command = Console.ReadLine().ToLower();

            List<int> extremums = inputList.Select(x => FindExtremums(x, command)).ToList();

            Console.WriteLine(string.Join(", ", extremums));
            Console.WriteLine(extremums.Sum());
        }

        private static int FindExtremums(int x, string command)
        {
            int extremum = x;
            int digits = GetDigits(x);

            for (int i = 0; i < digits; i++)
            {
                int rotated = int.Parse(RotateNumber(x, i));

                if (command == "min" && rotated < extremum)
                {
                    extremum = rotated;
                }

                if (command == "max" && rotated > extremum)
                {
                    extremum = rotated;
                }
            }
            return extremum;
        }

        private static string RotateNumber(int x, int rotations)
        {
            List<char> digits = x.ToString().ToList();
            for (int i = 0; i < rotations; i++)
            {
                char temp = digits[0];
                digits.RemoveAt(0);
                digits.Add(temp);
            }

            return string.Join("", digits);
        }

        private static int GetDigits(int x)
        {
            int digits = x.ToString().Length;
            return digits;
        }
    }
}