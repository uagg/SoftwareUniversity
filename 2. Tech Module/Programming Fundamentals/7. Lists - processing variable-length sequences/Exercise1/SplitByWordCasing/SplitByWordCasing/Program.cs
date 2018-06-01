using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SplitByWordCasing
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            var inputLetter = input.Split(new char[] { ' ', ',', ';', ':', '.', '!', '(', ')', '"', '\'', '\\', '/', '[', ']' }
            , StringSplitOptions.RemoveEmptyEntries).ToList();

            var lowerCase = new List<string>();
            var mixedCase = new List<string>();
            var upperCase = new List<string>();

            string word = string.Empty;
            bool isUpper = false;
            bool isLower = false;

            for (int i = 0; i < inputLetter.Count; i++)
            {
                word = inputLetter[i];

                isLower = CheckIsLower(word);
                isUpper = CheckIsUpper(word);

                if (isUpper == true && isLower == false)
                {
                    upperCase.Add(word);
                } else if (isLower == true && isUpper == false)
                {
                    lowerCase.Add(word);
                } else if (isLower == false && isUpper == false || isLower == true && isUpper == true)
                {
                    mixedCase.Add(word);
                }
                isLower = false;
                isUpper = false;
            }

            Console.Write("Lower-case: ");
            Console.WriteLine(string.Join(", ", lowerCase));

            Console.Write("Mixed-case: ");
            Console.WriteLine(string.Join(", ", mixedCase));

            Console.Write("Upper-case: ");
            Console.WriteLine(string.Join(", ", upperCase));

        }

        static bool CheckIsUpper (string word)
        {
            bool isOnlyLetters = word.All(Char.IsLetter);
            bool isOnlyUpper = word.All(Char.IsUpper);

            if (isOnlyLetters == true && isOnlyUpper == true)
            {
                return true;
            }

            return false;
        }

        static bool CheckIsLower(string word)
        {
            bool isOnlyLetters = word.All(Char.IsLetter);
            bool isOnlyUpper = word.All(Char.IsLower);

            if (isOnlyLetters == true && isOnlyUpper == true)
            {
                return true;
            }

            return false;
        }
    }
}
