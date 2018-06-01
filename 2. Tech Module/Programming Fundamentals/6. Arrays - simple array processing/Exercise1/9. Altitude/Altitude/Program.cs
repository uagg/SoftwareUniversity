using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Altitude
{
    class Program
    {
        static void Main(string[] args)
        {
            var arrayOfCommands = Console.ReadLine().Split(' ').ToArray();
            double altitude = double.Parse(arrayOfCommands[0]);

            for (int i = 1; i < arrayOfCommands.Length; i++)
            {
                if(i % 2 != 0 && arrayOfCommands[i] == "up")
                {
                    altitude += double.Parse(arrayOfCommands[i + 1]);
                } else if(i % 2 != 0 && arrayOfCommands[i] == "down")
                {
                    altitude -= double.Parse(arrayOfCommands[i + 1]);
                    if(altitude <= 0)
                    {
                        break;
                    }
                }
            }
            if(altitude <= 0)
            {
                Console.WriteLine("crashed");
            } else
            {
                Console.WriteLine($"got through safely. current altitude: {altitude}m");
            }
        }
    }
}
