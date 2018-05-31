using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MirrorImage
{
    /* You will receive a collection of elements from the console. Until you receive the command
     * “Print” you will receive on every line a single number - n, which will represent index from your collection.
     * Your task is to reverse the elements from index 0 to index n-1 and from n+1 to the last element of the collection.
     * You should not change he position of the element at the given index.
     * Example: We have the array 10 20 30 40 50 60 70 80 90. We receive from the console the index 3,
     * which is the number 40. After reversing the element left and right from the number the collection will
     * look like this: 30 20 10 40 90 80 70 60 50 */
    class Program
    {
        static void Main(string[] args)
        {
            var elements = Console.ReadLine().Split(' ').ToList();
            var indexOrCommand = Console.ReadLine();
            var counter = 0;

            while (indexOrCommand != "Print")
            {
                var index = int.Parse(indexOrCommand);

                if (index < elements.Count - 1 && index > 0)
                {
                    elements.Reverse(0, index);
                    elements.Reverse(index + 1, ((elements.Count - 1) - (index)));
                }
                else if (index == elements.Count - 1)
                {
                    elements.Reverse(0, elements.Count - 1);
                }
                else if (index == 0)
                {
                    elements.Reverse(index + 1, ((elements.Count - 1) - (index)));
                }

                indexOrCommand = Console.ReadLine();
            }

            Console.WriteLine(string.Join(" ", elements));
        }
    }
}

//if (index < elements.Count - 1)
//{
//    for (int i = 0; i < (index - 1) / 2; i++)
//    {
//        var temp = elements[i];
//        elements[i] = elements[(index - 1) - i];
//        elements[(index - 1) - i] = temp;
//    }

//    var mid = index + 1 + ((elements.Count - 1 - index) / 2);
//    for (int i = index + 1; i < mid; i++)
//    {
//        var temp = elements[i];
//        elements[i] = elements[elements.Count - 1 - counter];
//        elements[elements.Count - 1 - counter] = temp;
//        counter++;
//    }
//    counter = 0;
//}
//else if (index == elements.Count - 1)
//{
//    for (int i = 0; i < (elements.Count - 1) / 2; i++)
//    {
//        var temp = elements[i];
//        elements[i] = elements[elements.Count - 2 - counter];
//        elements[elements.Count - 2 - counter] = temp;
//        counter++;
//    }
//}