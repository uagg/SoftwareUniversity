using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CitiesByContinentAndCountry
{
    /* Write a program to read continents, countries and their cities, put them in a nested dictionary and print them. */
    class Program
    {
        static void Main(string[] args)
        {
            var dictionary = new Dictionary<string, Dictionary<string, List<string>>>();
            var n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                var tokens = Console.ReadLine().Split();
                var continent = tokens[0];
                var country = tokens[1];
                var city = tokens[2];

                if (!dictionary.ContainsKey(continent))
                {
                    dictionary[continent] = new Dictionary<string, List<string>>();
                }

                if (!dictionary[continent].ContainsKey(country))
                {
                    dictionary[continent][country] = new List<string>();
                }

                dictionary[continent][country].Add(city);
            }

            foreach (var continentCountries in dictionary)
            {
                var continentName = continentCountries.Key;
                var countries = continentCountries.Value;

                Console.WriteLine($"{continentName}:");
                foreach (var countryCities in countries)
                {
                    var countryName = countryCities.Key;
                    var cities = countryCities.Value;
                    Console.WriteLine("  {0} -> {1}",
                      countryName, string.Join(", ", cities));
                }
            }
        }
    }
}
