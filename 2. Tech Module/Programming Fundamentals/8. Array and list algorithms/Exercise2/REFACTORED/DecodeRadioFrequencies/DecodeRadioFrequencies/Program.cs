using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DecodeRadioFrequencies
{
    /* You are given an array of doubles (one line, space-separated). Your task is to convert the double
     * values to their character representations and insert them into a list like so: Example: 83.105
     * Extract the left part of the number and convert it to its ASCII code representation: 83  S
     * Extract the right part of the number and convert I to its ASCII code representation: 105  i
     * Insert the left character at the position equal to the index of the double number in the original array.
     *  Index of double: 0  insert S at index 0
     * Insert the right character at the position equal to the index of the double number in the original array,
     * counted in reverse: index of the double: 0  insert “i” at index 0, counted in reverse (so, the end of the list)
     * Repeat the aforementioned algorithm for each element of the double array, until you run out of elements.
     * When you do, print the list with no delimiter. 
     * If any of the parts of the double number are 0 (such as 86.0 or 0.97), ignore them and do not insert them anywhere. */
    class Program
    {
        static void Main(string[] args)
        {
            var frequencies = Console.ReadLine().Split(' ').ToArray();
            var leftElements = new List<int>();
            var rightElements = new List<int>();
            var result = new List<char>();

            for (int i = 0; i < frequencies.Length; i++)
            {
                var frequency = frequencies[i].Split('.').Select(int.Parse).ToArray();
                leftElements.Add(frequency[0]);
                rightElements.Add(frequency[1]);
            }

            foreach (var item in leftElements)
            {
                if (item > 0)
                {
                    result.Add((char)item);
                }
            }

            rightElements.Reverse();

            foreach (var item in rightElements)
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
