using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LadyBugs
{
    class Program
    {
        static void Main(string[] args)
        {
            int size = int.Parse(Console.ReadLine());
            int[] field = new int[size];
            var bugIndexes = Console.ReadLine().Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();

            foreach (var index in bugIndexes)
            {
                if (index < 0 || index >= size)
                {
                    continue;
                }
                field[index] = 1;
            }

            while (true)
            {
                var commands = Console.ReadLine();
                if (commands == "end")
                {
                    break;
                }
                var tokens = commands.Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).ToArray();
                var currentIndex = int.Parse(tokens[0]);
                var direction = tokens[1];
                var flightLength = int.Parse(tokens[2]);

                if (currentIndex < 0 || currentIndex >= size)
                {
                    continue;
                }

                if (field[currentIndex] == 0)
                {
                    continue;
                }

                var position = currentIndex;
                field[currentIndex] = 0;

                while (true)
                {

                    if (direction == "right")
                    {

                        position += flightLength;
                    }
                    else
                    {
                        position -= flightLength;

                    }
                    if (position >= size || position < 0)
                    {
                        break;
                    }

                    if (field[position] == 1)
                    {
                        continue;
                    }
                    else
                    {
                        field[position] = 1;
                        break;
                    }

                }
            }
            Console.WriteLine(string.Join(" ", field));
        }
    }
}
