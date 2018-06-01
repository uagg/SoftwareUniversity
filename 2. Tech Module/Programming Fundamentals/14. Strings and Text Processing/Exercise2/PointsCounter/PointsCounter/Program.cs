using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//namespace PointsCounter
//{
    /* Write a program, which receives data about a team, player and points. 
    Input
    You can have two types of input:
        • {TEAM}|{Player}|{points}
        • {Player}|{TEAM}|{points}
    The team name will always consist of uppercase Latin letters and the player name will always start with uppercase Latin letter and all
    other letters will be lowercase. The team and player names might be polluted with some prohibited symbols (‘@’, ‘%’, ‘$’ and ‘*’).
    You have to delete every occurrence of these symbols in every team and player name. Then, calculate every team’s total score. Every
    team’s total score equals to the total sum of the points made by every player in the team.
    Output
    When you receive the command “Result”, print all teams, ordered in descending order by the points they made and the player with most
    points in the team in the following format:
    {teamName} => {totalSumOfPoints}
    Most points scored by: {nameOfThePlayer}
    In case of repeating player names for one team, save the value, which is received last.
    Constraints
        • The team names will be at least 2 characters long
        • The points for each player will be in the interval [1…100] */
//    class Program
//    {
//        static void Main(string[] args)
//        {
//            var input = Console.ReadLine();
//            var notes = new Dictionary<string, Dictionary<string, int>>();
//            var scores = new Dictionary<string, int>();

//            while (input != "Result")
//            {
//                var tokens = input.Split('|').ToArray();
//                var firstWord = tokens[0].Split(new[] { '@', '%', '$', '*' }, StringSplitOptions.RemoveEmptyEntries);
//                var completeFirstWord = string.Concat(firstWord);
//                var testChars = completeFirstWord.ToCharArray();
//                var secondWord = tokens[1].Split(new[] { '@', '%', '$', '*' }, StringSplitOptions.RemoveEmptyEntries);
//                var completeSecondWord = string.Concat(secondWord);
//                var player = string.Empty;
//                var team = string.Empty;

//                if (char.IsUpper(testChars[1]))
//                {
//                    team = string.Concat(firstWord);
//                    player = string.Concat(secondWord);
//                }
//                else
//                {
//                    team = string.Concat(secondWord);
//                    player = string.Concat(firstWord);
//                }
                
//                var score = int.Parse(tokens[2]);

//                if (!notes.ContainsKey(team))
//                {
//                    notes[team] = new Dictionary<string, int>();
//                }

//                if (!notes[team].ContainsKey(player))
//                {
//                    notes[team][player] = new int();
//                }

//                notes[team][player] = (score);

//                if (!scores.ContainsKey(team))
//                {
//                    scores[team] = new int();
//                }

//                scores[team] += score;

//                input = Console.ReadLine();
//            }

//            var orderedScores = scores.OrderByDescending(x => x.Value);

//            var maxPoints = int.MinValue;
//            var nameOfChampion = string.Empty;
//            var teamName = string.Empty;

//            foreach (var team in orderedScores)
//            {
//                teamName = team.Key;
//                var sc = team.Value;

//                foreach (var entry1 in notes)
//                {
//                    var tmName = entry1.Key;
//                    var plrs = entry1.Value;

//                    if (tmName == teamName)
//                    {
//                        foreach (var entry2 in plrs)
//                        {
//                            var plrName = entry2.Key;
//                            var score = entry2.Value;

//                            if (score > maxPoints)
//                            {
//                                maxPoints = score;
//                                nameOfChampion = plrName;
//                            }
//                        }

//                        Console.WriteLine($"{tmName} => {scores[teamName]}");
//                        Console.WriteLine($"Most points scored by {nameOfChampion}");

//                        maxPoints = int.MinValue;
//                        nameOfChampion = string.Empty;
//                        teamName = string.Empty;
//                    }
//                }
//            }
//        }
//    }
//}


// Variant 2

namespace PointsCounter
{
    using System;
    using System.Collections.Generic;
    using System.Linq;

    public class Program
    {
        public static void Main()
        {
            string inputData = Console.ReadLine();
            var teams = new Dictionary<string, Dictionary<string, int>>();
            string teamName = string.Empty;
            string playerName = string.Empty;


            while (inputData != "Result")
            {
                inputData = inputData
                    .Replace("@", string.Empty)
                    .Replace("%", string.Empty)
                    .Replace("$", string.Empty)
                    .Replace("*", string.Empty);

                string[] tokens = inputData.Split('|');

                if (tokens[0].Last() > 96)
                {
                    teamName = tokens[1];
                    playerName = tokens[0];
                }
                else
                {
                    teamName = tokens[0];
                    playerName = tokens[1];
                }
                int points = int.Parse(tokens[2]);

                if (!teams.ContainsKey(teamName))
                {
                    teams.Add(teamName, new Dictionary<string, int>());
                }

                teams[teamName][playerName] = points;

                inputData = Console.ReadLine();
            }

            foreach (var team in teams.OrderByDescending(x => x.Value.Values.Sum()))
            {
                Console.WriteLine($"{team.Key} => {team.Value.Values.Sum()}");

                foreach (var player in team.Value.OrderByDescending(x => x.Value).Take(1))
                {
                    Console.WriteLine($"Most points scored by {player.Key}");
                }
            }
        }
    }
}