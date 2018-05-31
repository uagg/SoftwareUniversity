using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ShootListElements
{
    class Program
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine();
            var listOfIntegers = new List<int>();

            var average = 0.0D;
            var elementForRemove = 0;

            while (input != "stop")
            {
                if (input != "bang")
                {
                    listOfIntegers.Insert(0, int.Parse(input));
                }
                else
                {
                    average = listOfIntegers.Average();

                    for (int i = 0; i < listOfIntegers.Count; i++)
                    {
                        elementForRemove = listOfIntegers[i];

                        if (elementForRemove < average)
                        {
                            listOfIntegers.RemoveAt(i);

                            if (listOfIntegers.Count > 0)
                            {
                                Console.WriteLine($"shoot {elementForRemove}");
                            }
                            else
                            {
                                Console.WriteLine($"nobody left to shoot! last one was {elementForRemove}");
                            }
                            break;
                        }
                        else if (listOfIntegers.Count == 1 && average <= elementForRemove)
                        {
                            listOfIntegers.Remove(elementForRemove);
                            Console.WriteLine($"shot {elementForRemove}");
                            break;
                        }
                    }
                    for (int i = 0; i < listOfIntegers.Count; i++)
                    {
                        listOfIntegers[i]--;
                    }
                }
                input = Console.ReadLine();

                if (listOfIntegers.Count == 0)
                {
                    break;
                }
            }

            if (elementForRemove >= average && listOfIntegers.Count == 0 && input != "stop")
            {
                Console.WriteLine($"nobody left to shoot! last one was {elementForRemove}");
            }
            else if (listOfIntegers.Count == 0 && input == "stop")
            {
                Console.WriteLine($"you shoot them all. last one was {elementForRemove}");
            }
            else if (listOfIntegers.Count >= 1)
            {
                Console.WriteLine($"survivors: {string.Join(" ", listOfIntegers)}");
            }
        }
    }
}
