using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloName
{
    class Program
    {
        static void Main(string[] args)
        {
            string getName = Console.ReadLine();
            receiveName(getName);
        }
        static void receiveName(string name)
        {
            Console.WriteLine("Hello, {0}!", name);
        }
    }
}
