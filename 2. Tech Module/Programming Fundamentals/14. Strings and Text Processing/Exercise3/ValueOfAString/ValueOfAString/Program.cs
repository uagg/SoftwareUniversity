using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ValueOfAString
{
    /* Write a program which finds the sum of the ASCII codes of the letters in a given string.  Your tasks will be a bit harder,
     * because you will have to find the sum of either the lowercase or the uppercase letters. On the first line, you will receive the string.
    On the second line, you will receive one of two possible inputs:
        • If you receive “UPPERCASE”  find the sum of all uppercase English letters in the previously received string
        •  If you receive “LOWERCASE”  find the sum of all lowercase English letters in the previously received string
    You should not sum the ASCII codes of any characters, which is not letters.
    At the end print the sum in the following format:
        • The total sum is: {sum} */
    class Program
    {
        static void Main(string[] args)
        {
            var inputString = Console.ReadLine();
            var typeOfLetters = Console.ReadLine();
            var sumOfLetters = 0;

            if ("UPPERCASE".Equals(typeOfLetters))
            {
                var stringArray = inputString.ToCharArray();

                foreach (var letter in stringArray)
                {
                    if (char.IsLetter(letter) && char.IsUpper(letter))
                    {
                        var integerValue = (int)letter;
                        sumOfLetters += integerValue;
                    }
                }
            }
            else if ("LOWERCASE".Equals(typeOfLetters))
            {
                var stringArray = inputString.ToCharArray();

                foreach (var letter in stringArray)
                {
                    if (char.IsLetter(letter) && char.IsLower(letter))
                    {
                        var integerValue = (int)letter;
                        sumOfLetters += integerValue;
                    }
                }
            }

            Console.WriteLine($"The total sum is: {sumOfLetters}");
        }
    }
}