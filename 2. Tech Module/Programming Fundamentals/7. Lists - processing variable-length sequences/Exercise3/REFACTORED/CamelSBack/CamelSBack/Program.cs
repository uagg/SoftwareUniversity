using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CamelSBack
{
    /* The city is breaking down on a camel back. You will receive a sequence of N integers, (space-separated),
     * which will represent the buildings in the city.  You will then receive an integer M, indicating the camel back's size. 
     * The camel back is a linear structure standing below the city, in such a way that it has an equal amount of buildings
     * to its left and right. The idea is, if every round – one building falls from the left side of the city, and one from
     * the right side, how many rounds will it take for the city to stop breaking down?
     * As output you must print how many rounds it took before the city stopped breaking down as “{rounds} rounds”.
     * On the next line, print what’s left of the city (space-separated). Format: “remaining: {buildings (space-separated)}”
     * If no buildings have fallen, print “already stable: {buildings (space-separated)}” */
    class Program
    {
        static void Main(string[] args)
        {
            var buildings = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var camelSBackSize = int.Parse(Console.ReadLine());
            var roundCounter = 0;
            for (int i = 0; i < buildings.Count; i++)
            {
                if (buildings.Count > camelSBackSize)
                {
                    buildings.RemoveAt(buildings.Count - 1);
                    buildings.RemoveAt(0);
                    roundCounter++;
                    i = -1;
                }
            }

            if (roundCounter == 0)
            {
                Console.WriteLine("already stable: {0}", string.Join(" ", buildings));
            }
            else
            {
                Console.WriteLine("{0} rounds", roundCounter);
                Console.WriteLine("remaining: {0}", string.Join(" ", buildings));
            }
        }
    }
}