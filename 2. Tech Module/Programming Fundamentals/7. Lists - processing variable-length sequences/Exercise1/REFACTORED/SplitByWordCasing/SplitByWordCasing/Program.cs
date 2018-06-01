using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SplitByWordCasing
{
    /* Read a text, split it into words and distribute them into 3 lists.
     * Lower-case words like “programming”, “at” and “databases” – consist of lowercase letters only.
     * Upper-case words like “PHP”, “JS” and “SQL” – consist of uppercase letters only.
     * Mixed-case words like “C#”, “SoftUni” and “Java” – all others.
     * Use the following separators between the words: , ; : . ! ( ) " ' \ / [ ] space. */
    class Program
    {
        static void Main(string[] args)
        {
            var separators = new[] { ' ', ',', ';', ':', '.', '!', '(', ')', '"', '\'', '\\', '/', '[', ']' };
            var text = Console.ReadLine().Split(separators, StringSplitOptions.RemoveEmptyEntries).ToList();
            var lowerCase = new List<string>();
            var upperCase = new List<string>();
            var mixedCase = new List<string>();

            var upperCounter = 0;

            for (int i = 0; i < text.Count; i++)
            {
                var word = text[i];

                bool letter = word.All(char.IsLetter);
                bool upper = word.All(char.IsUpper);
                bool lower = word.All(char.IsLower);
                bool isUpper = false;
                bool isLower = false;

                if (letter == true &&  upper == true)
                {
                    isUpper = true;
                }
                if (letter == true && lower == true)
                {
                    isLower = true;
                }
                
                if (isLower == false && isUpper == false || isLower == true && isUpper == true)
                {
                    mixedCase.Add(text[i]);
                }
                else if (isUpper == true && isLower == false)
                {
                    upperCase.Add(text[i]);
                }
                else if (isLower == true && isUpper == false)
                {
                    lowerCase.Add(text[i]);
                }
                upperCounter = 0;
            }
            Console.WriteLine("Lower-case: {0}", string.Join(", ", lowerCase));
            Console.WriteLine("Mixed-case: {0}", string.Join(", ", mixedCase));
            Console.WriteLine("Upper-case: {0}", string.Join(", ", upperCase));
        }
    }
}