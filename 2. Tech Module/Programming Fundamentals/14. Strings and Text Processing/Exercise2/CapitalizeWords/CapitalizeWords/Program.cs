using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CapitalizeWords
{
    /* Create a program, which receives sentences of words, and capitalizes the words in them. The sentences will be grammatically correct.
     * You must extract each word from the sentences, and you must capitalize it.
    The capitalization of a word is the process of making the first letter Capital, and every other letter – lowercase.
    You should read input lines, until you receive the command “end”. You might receive SEVERAL sentences on 1 input line.
    After you’ve read a sentence, you extract the words, capitalize them, and print them, separated by a space and a comma.
    ONLY then should you read the next sentence. */
    class Program
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine();


            while (input != "end")
            {
                var words = new List<string>();
                var tokens = input.Split(new[] { ' ', '.', '!', ',', '?', '(', ')', '{', '}', '[', ']', ':', ';', '-', '/' }, StringSplitOptions.RemoveEmptyEntries);

                foreach (var token in tokens)
                {
                    var firstLetter = token.Substring(0, 1).ToUpper();
                    var otherParts = token.Substring(1).ToLower();
                    var capitalized = firstLetter + otherParts;
                    words.Add(capitalized);
                }

                Console.WriteLine(string.Join(", ", words));

                input = Console.ReadLine();
            }
        }
    }
}
