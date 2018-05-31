using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MixedPhones
{
    /* You will be given several phone entries, in the form of strings in format: {firstElement} : {secondElement}
     * The first element is usually the person’s name, and the second one – his phone number. The phone number consists ONLY of digits,
     * while the person’s name can consist of any ASCII characters. Sometimes the phone operator gets distracted by the Minesweeper she
     * plays all day, and gives you first the phone, and then the name. e.g. : 0888888888 : Pesho. You must store them correctly, even in those cases.
     * When you receive the command “Over”, you are to print all names you’ve stored with their phones. The names must be printed in alphabetical order. */
    class Program
    {
        static void Main(string[] args)
        {
            var phoneBook = new SortedDictionary<string, long>();
            var nameAndPhone = Console.ReadLine().Split(' ').ToArray();
            
            while (nameAndPhone[0] != "Over")
            {
                var firstElement = nameAndPhone[0];
                var secondElement = nameAndPhone[2];
                long number;

                if (long.TryParse(secondElement, out number))
                {
                    phoneBook[firstElement] = number;
                }
                else
                {
                    var temp = firstElement;
                    firstElement = secondElement;
                    secondElement = temp;
                    phoneBook[firstElement] = long.Parse(secondElement);
                }
                nameAndPhone = Console.ReadLine().Split(' ').ToArray();
            }

            foreach (var person in phoneBook)
            {
                Console.WriteLine($"{person.Key} -> {person.Value}");
            }
        }
    }
}
