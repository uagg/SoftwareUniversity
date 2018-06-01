using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NoteStatistics
{
    /* In music, certain frequencies correspond to certain musical notes (example: A -> 440hz, C# -> 554.37hz). 
     * You will be given frequencies as real numbers on the first line of the input (space-separated).
     * Your task is to convert the numbers to their musical note representation, then separate them into naturals
     * (C, B, F and etc.) and sharp notes (C#, F#, A#, etc.). After that, print both lists in the console in the
     * format described in the examples. After you print them, sum each list’s frequencies and print it on the console,
     * rounded to the second decimal place. */
    class Program
    {
        static void Main(string[] args)
        {
            var frequencies = Console.ReadLine().Split(' ').Select(double.Parse).ToList();
            var constraints = new List<string> { "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" };
            var constraintsValues = new List<double> { 261.63, 277.18, 293.66, 311.13, 329.63, 349.23, 369.99,
                392.00, 415.30, 440.00, 466.16, 493.88 };
            var convertedValues = new List<string>();
            var naturals = new List<string>();
            var naturalsSum = 0.0D;
            var sharps = new List<string>();
            var sharpsSum = 0.0D;
            var constraint = 0;

            for (int i = 0; i < frequencies.Count; i++)
            {
                if (constraintsValues.Contains(frequencies[i]))
                {
                    constraint = constraintsValues.IndexOf(frequencies[i]);
                }
                if (constraint >= 0 && constraint <= 11)
                {
                    convertedValues.Add(constraints[constraint]);
                }
                constraint = 0;
            }

            for (int i = 0; i < convertedValues.Count; i++)
            {
                var item = convertedValues[i].ToList();
                if (item.Contains('#'))
                {
                    sharps.Add(convertedValues[i]);
                    sharpsSum += constraintsValues.ElementAt(constraints.IndexOf(convertedValues[i]));
                }
                else
                {
                    naturals.Add(convertedValues[i]);
                    naturalsSum += constraintsValues.ElementAt(constraints.IndexOf(convertedValues[i]));
                }
            }
            Console.WriteLine("Notes: {0}", string.Join(" ", convertedValues));
            Console.WriteLine("Naturals: {0}", string.Join(", ", naturals));
            Console.WriteLine("Sharps: {0}", string.Join(", ", sharps));
            Console.WriteLine($"Naturals sum: {naturalsSum}");
            Console.WriteLine($"Sharps sum: {sharpsSum}");
        }
    }
}
