using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoftUniCoffeeOrders
{
    class Program
    {
        static void Main(string[] args)
        {
            var orders = int.Parse(Console.ReadLine());
            var listOfPrices = new List<decimal>();

            for (int i = 0; i < orders; i++)
            {
                var pricePerCapsule = decimal.Parse(Console.ReadLine());
                var orderDate = Console.ReadLine().Split('/').Select(int.Parse).ToArray();
                var daysInMonth = System.DateTime.DaysInMonth(orderDate[2], orderDate[1]);
                var capsulesCount = long.Parse(Console.ReadLine());

                var price = ((daysInMonth * capsulesCount) * pricePerCapsule);
                listOfPrices.Add(price);
            }

            foreach (var price in listOfPrices)
            {
                Console.WriteLine($"The price for the coffee is: ${price:F2}");
            }

            var sumOfPrices = listOfPrices.Sum();
            Console.WriteLine($"Total: ${sumOfPrices:F2}");
        }
    }
}
