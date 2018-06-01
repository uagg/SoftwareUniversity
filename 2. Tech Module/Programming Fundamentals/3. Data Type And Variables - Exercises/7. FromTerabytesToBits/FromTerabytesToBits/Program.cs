using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FromTerabytesToBits
{
    class Program
    {
        static void Main(string[] args)
        {
            decimal tbNumber = decimal.Parse(Console.ReadLine());
            decimal bitsNumber = tbNumber * 8796093022208M;
            Console.WriteLine("{0:f0}", bitsNumber);
        }
    }
}
