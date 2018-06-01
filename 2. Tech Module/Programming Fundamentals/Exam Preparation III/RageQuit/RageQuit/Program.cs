using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace RageQuit
{
    class Program
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine();

            var pattern = @"(\D+)(\d+)";
            var regex = new Regex(pattern);
            var matches = regex.Matches(input);

            var result = new StringBuilder();

            foreach (Match match in matches)
            {
                var partition = match.Groups[1].Value;
                var times = int.Parse(match.Groups[2].Value);

                result.Append(Repeat(partition, times).ToUpper());
            }

            var count = result.ToString().Distinct().Count();
            Console.WriteLine($"Unique symbols used: {count}");
            Console.WriteLine(result);
        }

        private static string Repeat(string partition, int times)
        {
            var final = new StringBuilder();

            for (int i = 0; i < times; i++)
            {
                final.Append(partition);
            }

            return final.ToString();
        }
    }
}

// INTERESTING VARIANT
//var input = Console.ReadLine().ToCharArray();
//var numberIndexes = new List<int>();
//var result = new List<string>();

//            for (int i = 0; i<input.Length; i++)
//            {
//                if (char.IsDigit(input[i]))
//                {
//                    numberIndexes.Add(i);
//                }
//            }

//            foreach (var index in numberIndexes)
//            {
//                var count = Char.GetNumericValue(input[index]);
//                for (int i = 0; i<input.Length; i++)
//                {
//                    var part = new List<char>();

//                    if (Char.GetNumericValue(input[i]) != count)
//                    {
//                        if (Char.IsLetter(input[i]))
//                        {
//                            var letter = Char.ToUpper(input[i]);
//part.Add(letter);
//                        }
//                        else if (!Char.IsDigit(input[i]) && !Char.IsLetter(input[i]))
//                        {
//                            part.Add(input[i]);
//                        }
//                    }
//                    else
//                    {
//                        i = input.Length;
//                    }

//                    var temp = String.Join("", part);
//                    if (temp != "")
//                    {
//                        for (int k = 0; k<count; k++)
//                        {
//                            result.Add(temp);
//                        }
//                    }
//                }

//                Console.WriteLine($"{String.Join("", result)}");
//            }