using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TrickyStrings
{
    class Program
    {
        static void Main(string[] args)
        {
            string delimiter = Console.ReadLine();
            int n = int.Parse(Console.ReadLine());
            string word = "";
            for (int i = 0; i < n; i++)
            {
                string newWord = Console.ReadLine();
                word += newWord + delimiter;
            }
            string removeLastChar = word.Remove(word.Length - delimiter.Length, delimiter.Length);
            Console.WriteLine($"{removeLastChar}");
        }
    }
}
