using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ContinentsCountriesCities
{
    /* Write a program, which receives continents, countries and city names and prints them, grouped by continent,
     * country and city, all in alphabetical order. No duplicates are allowed. */
    class Program
    {
        static void Main(string[] args)
        {
            var n = int.Parse(Console.ReadLine());
            var dictionary = new SortedDictionary<string, SortedDictionary<string, SortedSet<string>>>();

            for (int i = 0; i < n; i++)
            {
                var tokens = Console.ReadLine().Split();
                var continent = tokens[0];
                var country = tokens[1];
                var city = tokens[2];

                if (!dictionary.ContainsKey(continent))
                {
                    dictionary[continent] = new SortedDictionary<string, SortedSet<string>>();
                }
                
                if (!dictionary[continent].ContainsKey(country))
                {
                    dictionary[continent][country] = new SortedSet<string>();
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

                    Console.WriteLine("  {0} -> {1}", countryName, string.Join(", ", cities));
                }
            }
        }
    }
}
