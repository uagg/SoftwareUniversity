using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shellbound
{
    /*Vladi is a crab. Crabs are scared from almost anything, which is why they usually hide in their shells.
     * Vladi is a rich crab though. He has acquired many outer shells, in different regions, in which he can hide – each with a different size. 
     * However, it is really annoying to look after all your shells when they are so spread. That is why, Vladi decided to merge all shells
     * in each region, so that he has one big shell for every region. He needs your help to do that.
     * You will be given several input lines containing a string and an integer, separated by a space. The string will represent the region’s name,
     * and the integer – the shell, in the given region, size. You must store all shells in their corresponding regions.
     * If the region already exists, add the new shell to it. Make sure you have NO duplicate shells (shells with same size).
     * Vladi doesn’t like shells with the same size. When you receive the command “Aggregate”, you must stop reading input lines,
     * and you must print every region, all of the shells in that region, and the size of the giant shell after you’ve merged them in the
     * following format: {regionName} -> {shell1, shell2, shell3…} ({giantShell})
     * The giant shell size is calculated when you subtract the average of the shells from the sum of the shells.
     * Or in other words: (sum of shells) – (sum of shells) / (count of shells). */
    class Program
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine().Split(' ');
            var regionAndShellSize = new Dictionary<string, List<int>>();

            while (input[0] != "Aggregate")
            {
                var region = input[0];
                var shellSize = int.Parse(input[1]);

                if (!regionAndShellSize.ContainsKey(region))
                {
                    regionAndShellSize[region] = new List<int>();
                    regionAndShellSize[region].Add(shellSize);
                }
                else
                {
                    if (!regionAndShellSize[region].Contains(shellSize))
                    {
                        regionAndShellSize[region].Add(shellSize);
                    }
                }
                

                input = Console.ReadLine().Split(' ');
            }

            foreach (var region in regionAndShellSize)
            {
                var regionName = region.Key;
                var shellSize = region.Value;
                var shellSum = 0;

                foreach (var shells in shellSize)
                {
                    shellSum += shells;
                }

                var giandShell = shellSum - shellSum / shellSize.Count;

                Console.Write($"{regionName} -> ");
                Console.Write(string.Join(", ", shellSize));
                Console.WriteLine($" ({giandShell})");
            }
        }
    }
}
