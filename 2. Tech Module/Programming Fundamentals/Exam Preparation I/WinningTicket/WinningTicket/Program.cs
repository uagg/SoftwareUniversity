using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace WinningTicket
{
    class Program
    {
        static void Main(string[] args)
        {
            var tickets = Console.ReadLine().Split(',').Select(x => x.Trim()).ToArray();
            var result = new List<string>();
            var price = new List<int>();
            var signs = new List<char>();

            for (int i = 0; i < tickets.Length; i++)
            {
                if (tickets[i].Length == 20)
                {
                    var pattern = @"\w*(\${6,10}|#{6,10}|@{6,10}|\^{6,10})\w*(\1)\w*";
                    var regex = new Regex(pattern);
                    var hasMatch = regex.IsMatch(tickets[i]);

                    if (hasMatch)
                    {
                        var matches = regex.Matches(tickets[i]);
                        var matchToStringArr = matches.Cast<Match>().Select(m => m.Value).ToArray();
                        var lengthMatch = false;
                        var signMatch = false;
                        var sign = default(char);
                        var length = 0;

                        foreach (Match m in matches)
                        {
                            if (m.Groups[1].Length == m.Groups[2].Length)
                            {
                                lengthMatch = true;
                                length = m.Groups[1].Length;
                            }

                            if (m.Groups[1].Value.Equals(m.Groups[2].Value))
                            {
                                signMatch = true;
                                sign = m.Groups[1].Value.ToCharArray()[0];
                            }
                        }

                        if (lengthMatch && signMatch)
                        {
                            foreach (var match in matchToStringArr)
                            {
                                result.Add(match);
                            }
                        }

                        price.Add(length);
                        signs.Add(sign);
                    }
                    else
                    {
                        result.Add(tickets[i]);
                        price.Add(1);
                        signs.Add('N');
                    }
                }
                else
                {
                    result.Add(tickets[i]);
                    price.Add(-1);
                    signs.Add('I');
                }
            }

            for (int i = 0; i < result.Count; i++)
            {
                if (signs[i] == 'I')
                {
                    Console.WriteLine("invalid ticket");
                }
                else if (signs[i] == 'N')
                {
                    Console.WriteLine($"ticket \"{result[i]}\" - no match ");
                }
                else if (price[i] >= 6 && price[i] <= 9)
                {
                    Console.WriteLine($"ticket \"{result[i]}\" - {price[i]}{signs[i]}");
                }
                else if (price[i] == 10)
                {
                    Console.WriteLine($"ticket \"{result[i]}\" - {price[i]}{signs[i]} Jackpot!");
                }
            }
        }
    }
}

//var currentTicket = tickets[i].ToCharArray();
//var leftSide = new char[10];
//var rightSide = new char[10];

//for (int j = 0; j < currentTicket.Length; j++)
//{
//    while (j <= 9)
//    {
//        leftSide[j] = currentTicket[j];
//        break;
//    }

//    while (j > 9 && j <= 19)
//    {
//        rightSide[j - 10] = currentTicket[j];
//        break;
//    }
//}