using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StringCommander
{
    /* Strings can be hard to manipulate because of their immutable nature. As a master of strings, you have to write a program,
     * which will help the less experienced manipulate them. On the first line, you will receive the string, which you have to manipulate.
    On the next input lines, until you receive the command "end", you’ will receive a series of commands in one of the following formats:
    • "Left {count} times" – this command moves all elements left count times. On each roll, the first element is placed at the end of the string.
    • "Right {count} times" – this command moves all elements left count times. On each roll, the last element is placed at the beginning of
    the string.
    • "Insert {index} {string}" – insert the given string at the index.
    • "Delete {startIndex} {endIndex}" – delete the element from the startIndex (inclusive) to the endIndex (inclusive)
    At the end, print the string after all modifications.
    Input
    • The first input line will hold the string, which we have to manipulate.
    • The next lines will hold commands in the described formats.
    • The input ends with the keyword "end".
    Output
    • After receiving the "end" command, print the string after all manipulations.
    Constraints
    • All commands, indices and counts will be in the correct format and inside the string. You do not have to check them explicitly. */
    class Program
    {
        static void Main(string[] args)
        {
            var text = Console.ReadLine();
            var command = Console.ReadLine();

            while (command != "end")
            {
                var tokens = command.Split(' ').ToArray();
                var cmd = tokens[0];
                var count = 0;
                var index = 0;
                var endIndex = 0;
                var str = string.Empty;

                if (cmd == "Left" || cmd == "Right")
                {
                    count = int.Parse(tokens[1]);
                }
                else if (cmd == "Insert")
                {
                    index = int.Parse(tokens[1]);
                    str = tokens[2];
                }
                else if (cmd == "Delete")
                {
                    index = int.Parse(tokens[1]);
                    endIndex = int.Parse(tokens[2]);
                }

                switch (cmd)
                {
                    case "Left":
                        text = ShiftStringLeft(text, count);
                        break;
                    case "Right":
                        text = ShiftStringRight(text, count);
                        break;
                    case "Insert":
                        text = InsertString(text, index, str);
                        break;
                    case "Delete":
                        text = DeleteString(text, index, endIndex);
                        break;
                }

                command = Console.ReadLine();
            }

            Console.WriteLine(text);
        }

        public static string ShiftStringLeft(string text, int indx)
        {
            var count = indx % text.Length;
            return text.Substring(count, text.Length - count) + text.Substring(0, count);
        }

        public static string ShiftStringRight(string text, int indx)
        {
            var count = indx % text.Length;
            return text.Substring(text.Length - count, count) + text.Substring(0, text.Length - count);
        }

        public static string InsertString(string text, int index, string str)
        {
            return text.Insert(index, str);
        }

        public static string DeleteString(string text, int start, int end)
        {
            var diff = end - start + 1;
            return text.Remove(start, diff); ;
        }
    }
}
