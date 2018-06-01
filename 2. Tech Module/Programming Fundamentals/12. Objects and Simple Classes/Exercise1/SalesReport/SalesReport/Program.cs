using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SalesReport
{
    /* Write a class Sale holding the following data: town, product, price, quantity. Read a list of sales and calculate
     * and print the total sales by town as shown in the output. Order alphabetically the towns in the output. */
    class Program
    {
        static void Main(string[] args)
        {
            var total = int.Parse(Console.ReadLine());
            var result = new SortedDictionary<string, decimal>();


            for (int i = 0; i < total; i++)
            {
                var currentSaleAsString = Console.ReadLine();
                var currentSale = Sale.Parse(currentSaleAsString);

                if (!result.ContainsKey(currentSale.Town))
                {
                    result[currentSale.Town] = 0;
                }

                result[currentSale.Town] += currentSale.Quantity * currentSale.Price;
            }

            foreach (var kvp in result)
            {
                Console.WriteLine($"{kvp.Key} -> {kvp.Value:F2}");
            }
        }
    }

    public class Sale
    {
        public string Town { get; set; }
        public string Product { get; set; }
        public decimal Price { get; set; }
        public decimal Quantity { get; set; }

        public static Sale Parse(string saleAsString)
        {
            var saleParts = saleAsString.Split(' ');

            return new Sale
            {
                Town = saleParts[0],
                Product = saleParts[1],
                Price = decimal.Parse(saleParts[2]),
                Quantity = decimal.Parse(saleParts[3])
            };
        }
    }
}
