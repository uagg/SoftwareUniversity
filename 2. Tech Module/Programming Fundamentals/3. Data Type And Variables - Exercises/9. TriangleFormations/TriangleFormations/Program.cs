using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TriangleFormations
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int c = int.Parse(Console.ReadLine());
            if((a < (b + c)) && (b < (a + c)) && (c < (a + b)))
            {
                Console.WriteLine("Triangle is valid.");
                if((a*a)+(b*b) == (c*c))
                {
                    Console.WriteLine("Triangle has a right angle between sides a and b");
                } else if((c*c) + (a*a) == (b*b))
                {
                    Console.WriteLine("Triangle has a right angle between sides a and c");
                } else if((b*b) + (c*c) == (a*a))
                {
                    Console.WriteLine("Triangle has a right angle between sides b and c");
                } else
                {
                    Console.WriteLine("Triangle has no right angles");
                }
            } else
            {
                Console.WriteLine("Invalid Triangle.");
            }
        }
    }
}