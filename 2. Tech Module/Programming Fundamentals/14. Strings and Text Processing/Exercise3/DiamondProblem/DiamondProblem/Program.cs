using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DiamondProblem
{
    /* In the programming languages, which permit multiple inheritance, the diamond problem is a very common problem. In our task,
     * the diamond problem is a bit more… money driven. Your task is to write a program, which finds all diamonds in a string and
     * calculates the carats of each diamond. Each diamond will start with the character ‘<’. After that, it will be followed by
     * several random characters (contents of the diamond). The diamond will end with the character ‘>’. The carat value of the
     * diamond is equal to the sum of all the digits in the contents of the diamond.
    Example: “<2big32diamond>”  2 + 3 + 2  7 carats
    If the given string contains one or more diamonds, print for each found diamond the following output:
        • Found {caratValueOfTheDiamond} carat diamond
    If in the given string cannot be found any diamond, print:
        • Better luck next time */
    class Program
    {
        static void Main(string[] args)
        {
            var stringWithDiamonds = Console.ReadLine();
            var carats = new List<int>();

            while (true)
            {
                var indexOfStart = stringWithDiamonds.IndexOf('<');
                var indexOfEnd = stringWithDiamonds.IndexOf('>');

                if (indexOfStart == -1 || indexOfEnd == -1 || stringWithDiamonds.Length == 0)
                {
                    break;
                }

                if (indexOfStart > indexOfEnd)
                {
                    stringWithDiamonds = stringWithDiamonds.Substring(indexOfEnd + 1);
                    indexOfStart = stringWithDiamonds.IndexOf('<');
                    indexOfEnd = stringWithDiamonds.IndexOf('>');

                    if (indexOfStart == -1 || indexOfEnd == -1)
                    {
                        break;
                    }
                }

                var currentDiamond = stringWithDiamonds.Substring(indexOfStart, indexOfEnd + 1 - indexOfStart);

                var carat = 0;

                if (currentDiamond.Contains('<'))
                {
                    var newStartIndex = currentDiamond.LastIndexOf('<');
                    currentDiamond = currentDiamond.Substring(newStartIndex);
                }

                if (currentDiamond.Length > 0)
                {
                    foreach (var ch in currentDiamond)
                    {
                        if (ch > 47 && ch < 58)
                        {
                            carat += ch - 48;
                        }
                    }

                    carats.Add(carat);
                }

                stringWithDiamonds = stringWithDiamonds.Substring(indexOfEnd + 1);
            }

            if (carats.Count > 0)
            {
                foreach (var carat in carats)
                {
                    if (carat >= 1)
                    {
                        Console.WriteLine($"Found {carat} carat diamond");
                    }
                    else
                    {
                        Console.WriteLine($"Better luck next time");
                    }
                }
            }
            else
            {
                Console.WriteLine($"Better luck next time");
            }
        }
    }
}
