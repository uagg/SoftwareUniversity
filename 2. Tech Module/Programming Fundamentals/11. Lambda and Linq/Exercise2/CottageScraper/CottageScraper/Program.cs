using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CottageScraper
{
    /* You’re a carpenter at the local woodworking shop. Your client wants you to build a wooden skyscraper/cottage.
     * A CottageScraper, he calls it. But in order to accomplish this task, he needs the trees to be taller than a certain height.
     * The problem is that he doesn’t know what type of tree he’ll use yet, and doesn’t know how tall he wants the CottageScraper to be
     * . You’ve obviously got nothing better to do, so you go to work chopping down logs until he calls you with the details.
    Write a program which receives tree types and their lengths in the format “{type} -> {height}”. When you receive the command
    “chop chop”, it’s time to get paid. On the next line, you will receive the type of tree that needs to be used to build the
    CottageScraper. On the final input line, you will receive the minimum length per tree, needed to accomplish the task.
    Filter the trees based on type and minimum length, making sure that you’ll only use the trees of the specified type and minimum length.
    After which, calculate the total price of the CottageScraper, which includes the price of all the trees you collected up to that point.
    The price is calculated as being the average meters of all logs you collected, per meter of log, rounded to the second decimal place.
    You’re going to charge the client 100% of the price per log for logs you’ll use in the skyscraper, and 25% of the price per log
    for logs you won’t use for the CottageScraper. Both fees are rounded to the second decimal place.
    After you make the calculations, print them on the console in the following format:
    •	On the first line of the console, print “Price per meter: ${pricePerMeter:F2}”.
    •	On the second, print “Used logs price: ${usedLogsPrice:F2}”.
    •	On the third line, print “Unused logs price: ${unusedLogsPrice:F2}”.
    •	On the final line of the output, print “CottageScraper subtotal: ${subTotal:F2}”. */
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            var Trees = new Dictionary<string, List<double>>();
            var Used = new List<double>();
            var unUsed = new List<double>();

            while (input != "chop chop")
            {
                string[] inputTokens = 
                    input
                    .Split(new string[] { " -> " }, StringSplitOptions.RemoveEmptyEntries);

                if (!Trees.ContainsKey(inputTokens[0]))
                {
                    Trees.Add(inputTokens[0], new List<double>());
                }

                Trees[inputTokens[0]].Add(double.Parse(inputTokens[1]));

                input = Console.ReadLine();

            }

            string NeededType = Console.ReadLine();
            double NeededHeight = double.Parse(Console.ReadLine());
            double count = Trees.Values.Sum(x => x.Count);
            double pplm = Math.Round(Trees.Values.Sum(x => x.Sum()) / count, 2);

            var used = Math.Round(Trees[NeededType].Where(x => x >= NeededHeight).Sum() * pplm, 2);

            var unused = Math.Round((Trees.Values.Sum(x => x.Sum())
                - Trees[NeededType].Where(x => x >= NeededHeight).Sum()) * pplm * 0.25, 2);

            Console.WriteLine("Price per meter: ${0:0.00}", pplm);
            Console.WriteLine("Used logs price: ${0:0.00}", used);
            Console.WriteLine("Unused logs price: ${0:0.00}", unused);
            Console.WriteLine("CottageScraper subtotal: ${0:0.00}", used + unused);
        }
    }
}
