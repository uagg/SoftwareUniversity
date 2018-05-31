using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ASCIIString
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string word = "";
            for (int i = 0; i < n; i++)
            {
                int asciiNumber = int.Parse(Console.ReadLine());
                char a = (char)asciiNumber;
                word += a;
            }
            Console.WriteLine(word);
        }
    }
}
