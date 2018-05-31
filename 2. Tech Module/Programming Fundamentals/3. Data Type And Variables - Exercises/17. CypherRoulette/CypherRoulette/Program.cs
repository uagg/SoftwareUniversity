using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CypherRoulette
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            bool addToEnd = true;
            string output = "";
            string lastWord = "";
            for (int i = 0; i < n; i++)
            {
                string word = Console.ReadLine();
                if(word == "spin")
                {
                    addToEnd = !addToEnd;
                    i--;
                }
                switch (addToEnd)
                {
                    case (true):
                        output += word;
                        break;
                    case (false):
                        output = word + output;
                        break;
                }
                if(word == lastWord)
                {
                    output = "";
                    if(word == "spin")
                    {
                        addToEnd = !addToEnd;
                    }
                    lastWord = word;
                }
                lastWord = word;
            }
            output = output.Replace("spin", "");
            Console.WriteLine(output);
        }
    }
}
