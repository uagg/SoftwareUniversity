using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RecordUniqueNames
{
    /* Write a program, which will take a list of names and print only the unique names in the list. */
    class Program
    {
        static void Main(string[] args)
        {
            var n = int.Parse(Console.ReadLine());

            var skep = new HashSet<string>();

            for (int i = 0; i < n; i++)
            {
                var names = Console.ReadLine();
                skep.Add(names);
            }

            foreach (var name in skep)
            {
                Console.WriteLine(name);
            }
        }
    }
}
