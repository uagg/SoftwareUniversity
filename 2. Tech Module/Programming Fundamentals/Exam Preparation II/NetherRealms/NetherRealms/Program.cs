using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace NetherRealms
{
    class Program
    {
        static void Main(string[] args)
        {
            var demons = Console.ReadLine().Split(new[] { ' ', ',' }, StringSplitOptions.RemoveEmptyEntries);
            var result = new SortedDictionary<string, Demon>();

            foreach (var demon in demons)
            {
                var healthSymbols = demon
                    .Where(s => !char.IsDigit(s) && s != '+' && s != '-' && s != '*' && s != '/' && s != '.');

                var health = 0;
                foreach (var symbol in healthSymbols)
                {
                    health += symbol;
                }

                var regex = new Regex(@"-?\d+\.?\d*");

                var matches = regex.Matches(demon);
                double damage = 0.0;
                foreach (Match match in matches)
                {
                    var damageNumber = double.Parse(match.Value);
                    damage += damageNumber;
                }

                var modifiers = demon.Where(s => s == '*' || s == '/');
                foreach (var modifier in modifiers)
                {
                    if (modifier == '*')
                    {
                        damage *= 2;
                    }
                    else if (modifier == '/')
                    {
                        damage /= 2;
                    }
                }

                result.Add(demon, new Demon
                {
                    Name = demon,
                    Health = health,
                    Damage = damage
                });
            }
            foreach (var entry in result)
            {
                var demon = entry.Value;

                Console.WriteLine($"{demon.Name} - {demon.Health} health, {demon.Damage:F2} damage");
            }
        }
    }

    public class Demon
    {
        public string Name { get; set; }
        public int Health { get; set; }
        public double Damage { get; set; }
    }

}