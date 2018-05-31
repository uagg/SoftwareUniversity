using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountOccurrencesOfLarger
{
    class Program
    {
        static void Main(string[] args)
        {
            var realNumbers = Console.ReadLine().Split(' ').Select(double.Parse).ToArray();
            double p = double.Parse(Console.ReadLine());
            int counter = 0;

            for (int i = 0; i < realNumbers.Length; i++)
            {
                if(realNumbers[i] > p)
                {
                    counter++;
                }
            }
            Console.WriteLine(counter);
        }
    }
}
