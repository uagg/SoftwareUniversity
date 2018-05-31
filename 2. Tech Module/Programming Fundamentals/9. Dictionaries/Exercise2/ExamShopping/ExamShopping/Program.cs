using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExamShopping
{
    /* A supermarket has products which have quantities. Your task is to stock the shop before Exam Sunday.
     * Until you receive the command “shopping time”, add the various products to the shop’s inventory, keeping track of their
     * quantity (for inventory purposes). When you receive the aforementioned command, the students start pouring in before the
     * exam and buy various products. The format for stocking a product is: “stock {product} {quantity}”. The format for buying
     * a product is: “buy {product} {quantity}”. If a student tries to buy a product, which doesn’t exist, print “{product} doesn't exist”.
     * If it does exist, but it’s out of stock, print “{product} out of stock”. If a student tries buying more than the quantity
     * of that product, sell them all the quantity of the product (the product is left out of stock, don’t print anything).
     * When you receive the command “exam time”, your task is to print the remaining inventory in the following format: “{product} -> {quantity}”.
     * If a product is out of stock, do not print it. */
    class Program
    {
        static void Main(string[] args)
        {
            var supermakert = new Dictionary<string, int>();
            var input = Console.ReadLine().Split(' ').ToArray();
            var isOpen = false;
            while (input[0] != "exam" && input[1] != "time")
            {
                while (!isOpen)
                {
                    if (input[0] == "stock")
                    {
                        if (!supermakert.ContainsKey(input[1]))
                        {
                            supermakert[input[1]] = int.Parse(input[2]);
                        }
                        else
                        {
                            supermakert[input[1]] += int.Parse(input[2]);
                        }
                    }

                    input = Console.ReadLine().Split(' ').ToArray();

                    if (input[0] == "shopping" && input[1] == "time")
                    {
                        isOpen = true;
                    }
                }

                input = Console.ReadLine().Split(' ').ToArray();

                if (input[0] == "buy")
                {
                    if (!supermakert.ContainsKey(input[1]))
                    {
                        Console.WriteLine($"{input[1]} doesn't exist");
                    }
                    else if (supermakert[input[1]] == 0)
                    {
                        Console.WriteLine($"{input[1]} out of stock");
                    }
                    else
                    {
                        if (supermakert[input[1]] < int.Parse(input[2]))
                        {
                            supermakert[input[1]] = 0;
                        }
                        else
                        {
                            supermakert[input[1]] -= int.Parse(input[2]);
                        }
                    }
                }
            }
            foreach (var items in supermakert)
            {
                if (items.Value > 0)
                {
                    Console.WriteLine($"{items.Key} -> {items.Value}");
                }
                
            }
        }
    }
}
