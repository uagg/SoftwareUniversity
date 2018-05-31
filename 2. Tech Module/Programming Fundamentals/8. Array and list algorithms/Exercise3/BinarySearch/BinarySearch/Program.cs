using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BinarySearch
{
    /* In most of our tasks we use linear search, when we are looking for an element. However,
     * another simple to implement and widely used algorithm is the binary search. Its idea is to work on
     * sorted collections and to use the principle of divide and conquer. 
     * Your task is to write two methods, which receive an array and an element, which we will be looking for.
     * Perform the linear search on the unmodified collection and start from the first element. For the binary
     * search order the collection in ascending order, so you receive a viable result. Print “Yes” if the element
     * can be found in the collection or “No” if it’s not present. 
     * After that print the count of iterations, which the linear search made in format: “Linear search made {countOfIterations} iterations”
     * And the count of iterations, which binary search made: “Binary search made {countOfIterations} iterations” */
    class Program
    {
        static void Main(string[] args)
        {
            var numbers = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            var numberToFind = int.Parse(Console.ReadLine());
            var iterations = 0;
            var isFound = false;

            // linear method
            for (int i = 0; i < numbers.Count; i++)
            {
                iterations++;
                if (numberToFind.Equals(numbers[i]))
                {
                    i = numbers.Count();
                    isFound = true;
                }
            }

            if (isFound)
            {
                Console.WriteLine("Yes");
                Console.WriteLine($"Linear search made {iterations} iterations");
            }
            else
            {
                Console.WriteLine("No");
                Console.WriteLine($"Linear search made {iterations} iterations");
            }
            // end of linear method

            iterations = 0;

            // binary method
            numbers.Sort();
            var arraySize = numbers.Count();
            isFound = false;
            var isExists = true;
            var lowerBound = 0;
            var upperBound = arraySize - 1;

            while (!isFound && isExists)
            {
                if (lowerBound >= upperBound)
                {
                    isExists = false;
                }

                var midPoint = lowerBound + (upperBound - lowerBound) / 2;

                if (numbers[midPoint] < numberToFind)
                {
                    lowerBound = midPoint + 1;
                }
                else if (numbers[midPoint] > numberToFind)
                {
                    upperBound = midPoint - 1;
                }
                else if (numbers[midPoint] == numberToFind)
                {
                    isFound = true;
                }
                iterations++;
            }

            Console.WriteLine($"Binary search made {iterations} iterations");
            // end of binary method
        }
    }
}
