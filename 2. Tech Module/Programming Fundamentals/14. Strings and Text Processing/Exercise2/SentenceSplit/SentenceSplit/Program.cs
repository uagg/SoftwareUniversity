using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SentenceSplit
{
    /* Splitting the input by a given delimiter is easy, especially when you are told in the problem descriptions, that the elements will
     * not contain the delimiter. What if, however, they do.
    Input
    You will be given a sentence, which may contain any ASCII character.
    Then you will be given a delimiter, which may also contain any ASCII character.
    Output
    Your task is to split the sentence by the given delimiter, and print each of the elements, in the following format:
        • [{element1}, {element2}, {element3}. . .]
    See the examples for more info. */
    class Program
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine();
            var delimiter = Console.ReadLine();
            var result = input.Replace(delimiter, ", ");

            Console.WriteLine($"[{result}]");
        }
    }
}
