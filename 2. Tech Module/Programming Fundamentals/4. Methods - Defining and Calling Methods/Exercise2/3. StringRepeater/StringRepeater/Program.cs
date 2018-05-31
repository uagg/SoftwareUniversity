using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StringRepeater
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = Console.ReadLine();
            int cnt = int.Parse(Console.ReadLine());
            string result = RepeatString(str, cnt);
            Console.WriteLine(result);
        }

        static string RepeatString(string str, int count)
        {
            string repeatedString = string.Empty;

            for (int i = 0; i < count; i++)
            {
                Console.Write(str);
            }

            return repeatedString;
        }
    }
}
