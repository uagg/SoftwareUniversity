using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ShootListElements
{
    /* Until you receive the command "stop", you will either receive an integer, or the command bang on every line.
     * If you receive an integer, place it at the front of the list. If, however, you receive the command bang,
     * remove the first element whose value is smaller than the average of the elements of the list, print "shot {element}"
     * and then decrement every element in the list by 1.
     * If you receive "bang" and there are no elements left in the list, print "nobody left to shoot! last one was {lastRemovedInt}"
     * and end the program. When you finally do receive the command "end", either print "survivors: {elements, separated by space}"
     * if there are any, or "you shot them all. last one standing was {lastRemovedInt}". */
    class Program
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine();
            var result = new List<int>();
            var lastElement = 0;
            var isDone = false;

            while ((input != "stop") && (input != "dead"))
            {
                if (input != "bang")
                {
                    result.Insert(0, int.Parse(input));
                }
                else
                {
                    if (input == "bang")
                    {
                        if (result.Count == 0)
                        {
                            Console.WriteLine("nobody left to shoot! last one was {0}", lastElement);
                            isDone = true;
                        }
                        else
                        {
                            var sum = 0.0D;
                            var average = 0.0D;

                            foreach (var number in result)
                            {
                                sum += number;
                            }

                            average = sum / result.Count;

                            if (result.Count == 1)
                            {
                                lastElement = result[0];
                                Console.WriteLine("shot {0}", result[0]);
                                result.Remove(result[0]);
                            }

                            for (int i = 0; i < result.Count; i++)
                            {
                                if (result[i] < average)
                                {
                                    Console.WriteLine("shot {0}", result[i]);
                                    result.Remove(result[i]);
                                    i = result.Count;
                                }
                            }
                            for (int i = 0; i < result.Count; i++)
                            {
                                result[i]--;
                            }
                        }
                    }
                }
                if (!isDone)
                {
                    input = Console.ReadLine();
                }
                else
                {
                    input = "dead";
                }
            }

            if (input == "stop")
            {
                if (result.Count == 0)
                {
                    Console.WriteLine("you shot them all. last one was {0}", lastElement);
                }
                else
                {
                    Console.WriteLine("survivors: {0}", string.Join(" ", result));
                }
            }
        }
    }
}
