using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArrayHistogram
{
    class Program
    {
        static void Main(string[] args)
        {
            var arrayOfStrings = Console.ReadLine().Split(' ').ToArray();

            var words = new List<string>();
            var occurrencesCount = new List<int>();


            for (int i = 0; i < arrayOfStrings.Length; i++)
            {
                var currentWord = arrayOfStrings[i];

                if (!words.Contains(currentWord))
                {
                    words.Add(currentWord);
                    occurrencesCount.Add(1);
                }
                else
                {
                    var wordIndex = words.IndexOf(currentWord);
                    occurrencesCount[wordIndex]++;
                }
            }

            var isSwapped = true;

            while (isSwapped)
            {
                isSwapped = false;

                for (int i = 0; i < occurrencesCount.Count - 1; i++)
                {
                    if (occurrencesCount[i] < occurrencesCount[i + 1])
                    {
                        var temp = occurrencesCount[i];
                        occurrencesCount[i] = occurrencesCount[i + 1];
                        occurrencesCount[i + 1] = temp;
                        
                        var tempForWord = words[i];
                        words[i] = words[i + 1];
                        words[i + 1] = tempForWord;
                        isSwapped = true;
                    }
                }
            }

            var sum = 0.0D;
            for (int i = 0; i < occurrencesCount.Count; i++)
            {
                sum += occurrencesCount[i];               
            }

            for (int i = 0; i < occurrencesCount.Count; i++)
            {
                var percentage = occurrencesCount[i] * 100 / sum;
                Console.WriteLine("{0} -> {1} times ({2:F2}%)", words[i], occurrencesCount[i], percentage);
            }
        }
    }
}
