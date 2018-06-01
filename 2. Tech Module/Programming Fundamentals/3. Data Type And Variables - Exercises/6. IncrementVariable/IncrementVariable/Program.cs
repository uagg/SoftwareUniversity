using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IncrementVariable
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            byte number = 0;
            int manyOverflow = 0;
            for (int i = 0; i < n; i++)
            {
                number++;
                if (number == 0)
                {
                    manyOverflow++;
                }
            }
            if(manyOverflow == 0)
            {
                Console.WriteLine(number);
            } else
            {
                Console.WriteLine("{0}\nOverflowed {1} times" , number, manyOverflow);
            }
        }
    }
}