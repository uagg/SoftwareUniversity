using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Camping
{
    /* As a young and ambitious manager of a camping ground you want to invent a new system, which will keep track of the
     * registered camper vans (RVs). Until you receive the command “end”, you will receive commands in the format:
    •	{nameOfThePerson} {camperModel} {timeToStay}
    If you receive already existing name of a person  add the camper (only if it is new) to the already owned by the
    person campers and add the days to the already accumulated days. Your task is to print all people in the following format:
    *{nameOfThePerson}: {countOfCampers}
    ***{1st camperModel}
    ***{2nd camperModel}
    …	
    ***{nth camperModel}
    Total stay: {countOfNights} nights 
    Print all the people, ordered by the count of their campers. If two people have an equal count of campers, order them
    by the length of their names in ascending order. Print the campers for each person in order of receiving. */
    class Program
    {
        static void Main(string[] args)
        {
            var commands = Console.ReadLine();
            var register = new Dictionary<string, Dictionary<string, byte>>();

            while (commands != "end")
            {
                var tokens = commands.Split(' ');
                var name = tokens[0];
                var model = tokens[1];
                var time = byte.Parse(tokens[2]);

                if (!register.ContainsKey(name))
                {
                    register[name] = new Dictionary<string, byte>();
                }

                if (!register[name].ContainsKey(model))
                {
                    register[name][model] = new byte();
                }

                if (time >= 0 && time <= 255)
                {
                    register[name][model] = time;
                }
                

                commands = Console.ReadLine();
            }

            foreach (var person in register.OrderByDescending(c => c.Value.Count()).ThenBy(p => p.Key.Length))
            {
                string personName = person.Key;
                int countOfRvs = person.Value.Count();
                int totalNights = 0;

                Console.WriteLine($"{personName}: {countOfRvs}");
                foreach (var item in person.Value)
                {
                    string nameOfRv = item.Key;
                    int nights = item.Value;
                    Console.WriteLine($"***{nameOfRv}");
                    totalNights += nights;
                }
                Console.WriteLine($"Total stay: {totalNights} nights");

            }
        }
    }
}
