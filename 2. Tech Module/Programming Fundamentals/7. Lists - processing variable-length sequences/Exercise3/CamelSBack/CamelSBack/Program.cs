using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CamelSBack
{
    class Program
    {
        static void Main(string[] args)
        {
            var city = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var camelBack = int.Parse(Console.ReadLine());
            var round = 0;

            while (city.Count > camelBack)
            {
                city.RemoveAt(0);
                city.RemoveAt(city.Count - 1);
                round++;
            }

            if (round == 0)
            {
                Console.WriteLine("already stable: {0}", (string.Join(" ", city)));
            } else
            {
                Console.WriteLine($"{round} rounds");
                Console.WriteLine("remaining: {0}", (string.Join(" ", city)));
            }
        }
    }
}