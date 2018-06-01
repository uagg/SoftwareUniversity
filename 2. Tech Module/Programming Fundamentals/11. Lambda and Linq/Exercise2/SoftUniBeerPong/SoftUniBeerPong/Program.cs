using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoftUniBeerPong
{
    /* In SoftUni it is time for the annual beer pong tournament. Last year the competition was a total disaster,
     * because nobody was in “condition” to keep track of the scores. Now it is your job to write a program, which
     * will keep track of the total results. The competition’s rules are simple:
    •	All contestants are divided into teams
    •	Every team should have exactly 3 participants
    •	After a team has a total of 3 participants, any further attempt to add a participant should be ignored.
    •	If a team has less than 3 participants – it gets disqualified and should not be printed.
    Until you receive the command “stop the game” you will receive lines of input in the following format: “team|player|pointsMade”
    The total score of the team is the sum of the points made from every player. 
    Print every team, which has enough players in the following format:
    {teamPosition}. {teamName}; Players:
    ###{firstPlayerName}: {points}
    ###{secondPlayerName}: {points}
    ###{thirdPlayerName}: {points}
    Order the teams by total points in descending order and order each team’s players by the amount of points made,
    again in descending order. */
    class Program
    {
        static void Main(string[] args)
        {
            var scores = new Dictionary<string, Dictionary<string, int>>();
            var input = Console.ReadLine();

            while (input != "stop the game")
            {
                var tokens = input.Split('|');
                var name = tokens[0];
                var team = tokens[1];
                var points = int.Parse(tokens[2]);

                if (!scores.ContainsKey(team))
                {
                    scores[team] = new Dictionary<string, int>();
                }

                if (scores[team].Values.Count == 3)
                {
                    input = Console.ReadLine();
                    continue;
                }

                scores[team][name] = points;

                input = Console.ReadLine();
            }

            var counter = 0;

            foreach (var item in scores.Where(x => x.Value.Count >= 3).OrderByDescending(x => x.Value.Values.Sum()))
            {
                counter++;
                Console.WriteLine($"{counter}. {item.Key}; Players: ");

                foreach (var player in item.Value.OrderByDescending(x => x.Value))
                {
                    Console.WriteLine($"###{player.Key}: {player.Value}");
                }
            }
        }
    }
}
