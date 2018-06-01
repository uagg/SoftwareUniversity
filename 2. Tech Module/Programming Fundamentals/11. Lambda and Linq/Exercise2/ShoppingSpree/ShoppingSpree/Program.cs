using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ShoppingSpree
{
    /* Pesho has a problem with taking decisions and mostly with deciding on what to eat for dinner. He asked you to write
     * a program which chooses dinner for him. On the first line, you will receive Pesho’s budget as decimal number.
     * On the next lines, until you receive the command “end”, you will receive strings with the name of the product and the
     * price of the product. Save all products and if you receive the same product and its price is lower than the already
     * saved one – rewrite the old value. At the end, sum all values of the received products. If the sum is bigger than
     * Pesho’s budget – print: “Need more money... Just buy banichka”
     * If Pesho has enough money – print all purchased products, ordered by price in descending order, then by the count
     * of the characters in its name in ascending order. Use the following format for each product: “{productName} costs {productPrice}”
     * Print all prices rounded to the 2nd decimal sign. */
    class Program
    {
        static void Main(string[] args)
        {
            var budget = decimal.Parse(Console.ReadLine());
            var productNameAndPrice = Console.ReadLine();
            var productAndPriceList = new Dictionary<string, decimal>();
            var sumOfValues = 0.0M;

            while (productNameAndPrice != "end")
            {
                var tokens = productNameAndPrice.Split(' ');
                var product = tokens[0];
                var price = decimal.Parse(tokens[1]);

                if (!productAndPriceList.ContainsKey(product) || price < productAndPriceList[product])
                {
                    productAndPriceList[product] = price;
                }

                productNameAndPrice = Console.ReadLine();
            }

            sumOfValues = productAndPriceList.Values.Sum();

            if (budget >= sumOfValues)
            {

                productAndPriceList =
                    productAndPriceList
                    .OrderByDescending(x => x.Value)
                    .ThenBy(x => x.Key.Length)
                    .ToDictionary(x => x.Key, x => x.Value);

                foreach (var product in productAndPriceList)
                {
                    Console.WriteLine($"{product.Key} costs {product.Value:F2}");
                }
            }
            else
            {
                Console.WriteLine("Need more money... Just buy banichka");
            }
        }
    }
}
