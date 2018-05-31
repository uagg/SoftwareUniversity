using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VariableInHexadecimalFormat
{
    class Program
    {
        static void Main(string[] args)
        {
            string hexaNumber = Console.ReadLine();
            int convertedNumber = Convert.ToInt32(hexaNumber, 16);
            Console.WriteLine(convertedNumber);
        }
    }
}