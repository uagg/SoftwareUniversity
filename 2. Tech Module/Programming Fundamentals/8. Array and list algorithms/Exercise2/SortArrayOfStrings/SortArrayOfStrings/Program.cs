using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SortArrayOfStrings
{
    class Program
    {
        static void Main(string[] args)
        {
            var arrayOfStrings = Console.ReadLine().Split(' ').ToArray();

            for (int i = 0; i < arrayOfStrings.Length; i++)
            {
                for (int j = i + 1; j < arrayOfStrings.Length; j++)
                {
                    var move = arrayOfStrings[i].CompareTo(arrayOfStrings[j]);

                    if (move == 1)
                    {
                        var temp = arrayOfStrings[i];
                        arrayOfStrings[i] = arrayOfStrings[j];
                        arrayOfStrings[j] = temp;
                    }
                }
            }
            Console.WriteLine(string.Join(" ", arrayOfStrings));
        }
    }
}

//using System;
//using System.Collections.Generic;
//using System.Linq;
//using System.Text;
//using System.Threading.Tasks;

//namespace SortArrayOfStrings
//{
//    class Program
//    {
//        static void Main(string[] args)
//        {
//            var arrayOfStrings = Console.ReadLine().Split(' ').ToArray();
//            var isSorted = true;

//            while (isSorted)
//            {
//                isSorted = false;

//                for (int i = 0; i < arrayOfStrings.Length - 1; i++)
//                {
//                    var firstSum = 0;
//                    var secondSum = 0;

//                    foreach (var item in arrayOfStrings[i])
//                    {
//                        firstSum += (int)item;
//                    }

//                    foreach (var item in arrayOfStrings[i + 1])
//                    {
//                        secondSum += (int)item;
//                    }

//                    if (firstSum > secondSum)
//                    {
//                        var temp = arrayOfStrings[i];
//                        arrayOfStrings[i] = arrayOfStrings[i + 1];
//                        arrayOfStrings[i + 1] = temp;
//                        isSorted = true;
//                    }

//                    firstSum = 0;
//                    secondSum = 0;
//                }
//            }
//            Console.WriteLine(string.Join(" ", arrayOfStrings));
//        }
//    }
//}