using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommandInterpreter
{
    class Program
    {
        static void Main(string[] args)
        {
            var strings = Console.ReadLine().Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).ToList();
            var input = Console.ReadLine();

            while (input != "end")
            {
                var tokens = input.Split(' ');
                var command = tokens[0];

                switch (command)
                {
                    case "reverse":
                        if (IsValid(strings, int.Parse(tokens[2]), int.Parse(tokens[4])))
                        {
                            strings.Reverse(int.Parse(tokens[2]), int.Parse(tokens[4]));
                        }             
                        else
                        {
                            Console.WriteLine("Invalid input parameters.");
                        }
                        break;
                    case "sort":
                        if (IsValid(strings, int.Parse(tokens[2]), int.Parse(tokens[4])))
                        {
                            strings.Sort(int.Parse(tokens[2]), int.Parse(tokens[4]), null);
                        }
                        else
                        {
                            Console.WriteLine("Invalid input parameters.");
                        }
                        break;
                    case "rollLeft":
                        if (int.Parse(tokens[1]) >= 0)
                        {
                            var rotations = int.Parse(tokens[1]) % strings.Count;
                            for (int i = 0; i < rotations; i++)
                            {
                                var firstElement = strings[0];

                                for (int j = 0; j < strings.Count - 1; j++)
                                {
                                    strings[j] = strings[j + 1];
                                }

                                strings[strings.Count - 1] = firstElement;
                            }
                        }
                        else
                        {
                            Console.WriteLine("Invalid input parameters.");
                        }
                        break;
                    case "rollRight":
                        if (int.Parse(tokens[1]) >= 0)
                        {
                            var rotations = int.Parse(tokens[1]) % strings.Count;
                            for (int i = 0; i < rotations; i++)
                            {
                                var lastElement = strings[strings.Count - 1];

                                for (int j = strings.Count - 1; j > 0; j--)
                                {
                                    strings[j] = strings[j - 1];
                                }

                                strings[0] = lastElement;
                            }
                        }
                        else
                        {
                            Console.WriteLine("Invalid input parameters.");
                        }
                        break;
                }

                input = Console.ReadLine();
            }

            Console.WriteLine($"[{string.Join(", ", strings)}]");
        }

        private static bool IsValid(List<string> array, int reverseStart, int reverseCount)
        {
            var result = reverseStart >= 0 && reverseStart < array.Count && reverseCount >= 0 && (reverseStart + reverseCount) <= array.Count;

            return result;
        }
    }
}
