using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TravelCompany
{
    /* Write a program, which categorizes information about a travel company.
    Companies have various vehicles planned for different cities. Every city has prepared several types of vehicles.
    Each vehicle type has a different capacity. Until you receive the command “ready”, you will receive all the cities
    the company offers holiday packages for, and their respective vehicle types + capacities in the format:
    •	“{city}:{type}-{capacity},{type}-{capacity}…”
    An example city with its transportation options would look like this:
    •	“Athens:bus-40,airplane-300,train-150”
    If a city is entered a second time, add all transport which hasn’t already been added and replace existing transports’
    capacities with the new ones. After the “ready” command, you will start receiving groups for various cities in the format:
    “{city} {peopleCount}” until you receive “travel time!”.
    After that, calculate whether the group will have enough seats to accommodate the passengers and print the status per these conditions:
    If the group’s size is smaller than or equal to the combines seats in all the vehicles, print:
    •	 “{city} -> all {peopleCount} accommodated”
    If the group’s size is larger than the combines seats in all the vehicles, print:
    •	“{city} -> all except {peopleCount - transportCapacities} accommodated” */
    class Program
    {
        static void Main(string[] args)
        {            
            var companyDictionary = new SortedDictionary<string, Dictionary<string, int>>();
            var cityAndPeopleCount = new Dictionary<string, Dictionary<int, bool>>();
            var input = Console.ReadLine().Split(new[] { ':', ' ' }, StringSplitOptions.RemoveEmptyEntries);

            while (input[0] != "ready")
            {
                var city = input[0];
                var tokens = input[1].Split(',');

                if (!companyDictionary.ContainsKey(city))
                {
                    companyDictionary[city] = new Dictionary<string, int>();
                }

                for (int i = 0; i < tokens.Length; i++)
                {
                    var vehicleAndCapacity = tokens[i].Split('-');
                    var vehicle = vehicleAndCapacity[0];
                    var capacity = int.Parse(vehicleAndCapacity[1]);

                    if (!companyDictionary[city].ContainsKey(vehicle))
                    {
                        companyDictionary[city][vehicle] = new int();
                    }

                    companyDictionary[city][vehicle] = capacity;
                }

                input = Console.ReadLine().Split(new[] { ':', ' ' }, StringSplitOptions.RemoveEmptyEntries);
            }

            input = Console.ReadLine().Split(new[] { ':', ' ' }, StringSplitOptions.RemoveEmptyEntries);

            while (input[0] != "travel")
            {
                var city = input[0];
                var peopleCount = int.Parse(input[1]);
                var seatsSum = 0;

                if (companyDictionary.ContainsKey(city))
                {
                    foreach (var vehicle in companyDictionary[city])
                    {
                        var vehicleName = vehicle.Key;
                        var vehicleSeats = vehicle.Value;
                        seatsSum += vehicleSeats;
                    }
                }

                if (peopleCount < seatsSum)
                {
                    if (!cityAndPeopleCount.ContainsKey(city))
                    {
                        cityAndPeopleCount[city] = new Dictionary<int, bool>();
                    }

                    if (!cityAndPeopleCount[city].ContainsKey(peopleCount))
                    {
                        cityAndPeopleCount[city][peopleCount] = new bool();
                    }

                    cityAndPeopleCount[city][peopleCount] = true;
                }
                else
                {
                    var except = Math.Abs(peopleCount - seatsSum);

                    if (!cityAndPeopleCount.ContainsKey(city))
                    {
                        cityAndPeopleCount[city] = new Dictionary<int, bool>();
                    }

                    if (!cityAndPeopleCount[city].ContainsKey(except))
                    {
                        cityAndPeopleCount[city][except] = new bool();
                    }

                    cityAndPeopleCount[city][except] = false;
                }

                input = Console.ReadLine().Split(new[] { ':', ' ' }, StringSplitOptions.RemoveEmptyEntries);
            }

            foreach (var city in cityAndPeopleCount)
            {
                var cityName = city.Key;
                var peopleCount = city.Value;

                foreach (var isAccommodated in peopleCount)
                {
                    var count = isAccommodated.Key;
                    var isAcc = isAccommodated.Value;

                    if (isAcc)
                    {
                        Console.WriteLine($"{cityName} -> all {count} accommodated");
                    }
                    else
                    {
                        Console.WriteLine($"{cityName} -> all except {count} accommodated");
                    }
                }
            }
        }
    }
}
