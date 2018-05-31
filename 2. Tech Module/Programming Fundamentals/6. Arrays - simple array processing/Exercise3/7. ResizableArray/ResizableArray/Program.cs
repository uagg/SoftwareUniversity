using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ResizableArray
{
    class Program
    {
        static void Main(string[] args)
        {
            var list = new List<int>(4);

            var command = Console.ReadLine().Split().ToArray();

            while (command[0] != "end")
            {
                if ("push".Equals(command[0]))
                {
                    list.Add(int.Parse(command[1]));
                } else if ("pop".Equals(command[0]))
                {
                    list.RemoveAt(list.Count - 1);
                } else if ("removeAt".Equals(command[0]))
                {
                    list.RemoveAt(int.Parse(command[1]));
                } else if ("clear".Equals(command[0]))
                {
                    list.Clear();
                }
                command = Console.ReadLine().Split().ToArray();
            }
            
            if (list.Count > 0)
            {
                Console.WriteLine(string.Join(" ", list));
            } else
            {
                Console.WriteLine("empty array");
            }
        }
    }
}
