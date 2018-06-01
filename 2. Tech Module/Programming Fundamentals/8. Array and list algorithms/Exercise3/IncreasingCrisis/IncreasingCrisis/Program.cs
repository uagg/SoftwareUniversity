using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IncreasingCrisis
{
    /* You will be given N – an integer. On the next N lines, you will receive sequences of integers, separated by a space.
       Your task is to add each sequence’s integers to a list, so that it forms an increasing sequence.
       If there are already elements inside the list, you must find the right-most element, lower by value, than the first element from 
       the given sequence, and start INSERTING, the sequence’s elements at the position, AFTER the found element.
       If the increasing sequence is BROKEN, during the addition of new elements, you must IGNORE the element that breaks it and all others 
       after it.You must also remove all elements from the list, AFTER the LAST ADDED element.
       When you process all input lines, you must print the list’s elements, separated by a single space. */
    class Program
    {
        static void Main(string[] args)
        {
            List<int> numbers = new List<int>();
            int n = int.Parse(Console.ReadLine());

            List<int> input = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            n--;
            input.Sort();
            numbers = input;

            while (n > 0)
            {
                input = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

                for (int i = numbers.Count - 1; i >= 0; i--)
                {
                    if (numbers[i] <= input[0])
                    {
                        i++;
                        numbers.Insert(i, input[0]);
                        for (int k = 1; k < input.Count; k++)
                        {

                            if (input[k] >= input[k - 1])
                            {
                                i++;
                                numbers.Insert(i, input[k]);

                                if (i != numbers.Count - 1 && numbers[i] > numbers[i + 1])
                                {
                                    for (int p = i + 1; p < numbers.Count; p++)
                                    {
                                        numbers.RemoveAt(p);
                                        p--;
                                    }
                                    break;
                                }

                            }
                            else
                            {
                                for (int p = i + 1; p < numbers.Count; p++)
                                {
                                    numbers.RemoveAt(p);
                                    p--;
                                }
                                break;
                            }
                        }
                        break;
                    }
                }

                n--;

            }


            Console.WriteLine(string.Join(" ", numbers));

        }
    }
}