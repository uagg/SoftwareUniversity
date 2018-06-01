using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CharityMarathon
{
    class Program
    {
        static void Main(string[] args)
        {
            var days = int.Parse(Console.ReadLine());
            long runners = long.Parse(Console.ReadLine());
            var avgNumberOfLapsForRunner = int.Parse(Console.ReadLine());
            var trackLength = int.Parse(Console.ReadLine());
            var trackCapacity = int.Parse(Console.ReadLine());
            var moneyPerKm = double.Parse(Console.ReadLine());

            trackCapacity = trackCapacity * days;
            runners = Math.Min(trackCapacity, runners);
            long totalMeters = runners * trackLength * avgNumberOfLapsForRunner;
            long totalKm = totalMeters / 1000;
            double totalMoney = totalKm * moneyPerKm;

            Console.WriteLine($"Money raised: {totalMoney:F2}");
        }
    }
}
