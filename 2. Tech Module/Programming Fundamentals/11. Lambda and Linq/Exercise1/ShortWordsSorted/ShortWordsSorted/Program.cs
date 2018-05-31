using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ShortWordsSorted
{
    /* Read a text, extract its words, find all short words (less than 5 characters) and print them alphabetically, in lowercase.
    •	Use the following separators: . , : ; ( ) [ ] " ' \ / ! ? (space).
    •	Use case-insensitive matching.
    •	Remove duplicated words. */
    class Program
    {
        static void Main(string[] args)
        {
            var text = Console.ReadLine()
                .ToLower()
                .Split(new[] { '.', ',', ':', ';', '(', ')', '[', ']', '"', '\'', '\\', '/', '!', '?', ' ' }, StringSplitOptions.RemoveEmptyEntries)
                .Where(x => x.Length < 5).OrderBy(w => w).Distinct();
            Console.WriteLine(string.Join(", ", text));
        }
    }
}
