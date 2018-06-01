using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DecodeRadioFrequencies
{
    class Program
    {
        static void Main(string[] args)
        {
            var arrayOfStrings = Console.ReadLine().Split(' ');
            var leftNumbers = new List<int>();
            var rightNumbers = new List<int>();

            var result = new List<char>();

            for (int i = 0; i < arrayOfStrings.Length; i++)
            {
                var freqDivision = arrayOfStrings[i].Split('.').Select(int.Parse).ToArray();
                leftNumbers.Add(freqDivision[0]);
                rightNumbers.Add(freqDivision[1]);
            }

            foreach (var item in leftNumbers)
            {
                if (item > 0)
                {
                    result.Add((char)item);
                }
            }
            rightNumbers.Reverse();
            foreach (var item in rightNumbers)
            {
                if (item > 0)
                {
                    result.Add((char)item);
                }
            }

            Console.WriteLine(string.Join("", result));
        }
    }
}