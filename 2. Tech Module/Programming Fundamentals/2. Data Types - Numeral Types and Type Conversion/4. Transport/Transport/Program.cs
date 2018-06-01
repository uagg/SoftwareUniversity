using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Transport
{
    class Program
    {
        static void Main(string[] args)
        {
            int persons = int.Parse(Console.ReadLine());
            int capacity = 4 + 8 + 12;
            int Courses = (int) Math.Ceiling((double)persons / capacity);
            Console.WriteLine(Courses);
        }
    }
}