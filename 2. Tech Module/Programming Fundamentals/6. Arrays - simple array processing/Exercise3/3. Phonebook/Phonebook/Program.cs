using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Phonebook
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] phoneNumbers = Console.ReadLine().Split(' ').ToArray();
            string[] names = Console.ReadLine().Split(' ').ToArray();
            string searchName = string.Empty;

            while(searchName != "done")
            {
                searchName = Console.ReadLine();
                for (int i = 0; i < names.Length; i++)
                {
                    if(searchName == names[i])
                    {
                        Console.WriteLine("{0} -> {1}", names[i],phoneNumbers[i]);
                    }
                }
            }
        }
    }
}
