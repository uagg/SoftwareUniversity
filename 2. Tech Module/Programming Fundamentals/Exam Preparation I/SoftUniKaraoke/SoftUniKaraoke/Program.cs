using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoftUniKaraoke
{
    class Program
    {
        static void Main(string[] args)
        {
            var participants = Console.ReadLine().Split(',').Select(x => x.Trim()).ToArray();
            var songs = Console.ReadLine().Split(',').Select(x => x.Trim()).ToArray();

            var awards = new Dictionary<string, SortedSet<string>>();

            var input = Console.ReadLine();

            while (input != "dawn")
            {
                var performance = input.Split(new[] { ", " }, StringSplitOptions.RemoveEmptyEntries).Select(x => x.Trim()).ToArray();
                var participant = performance[0];
                var song = performance[1];
                var award = performance[2];

                if (participants.Contains(participant) && songs.Contains(song))
                {
                    if (!awards.ContainsKey(participant))
                    {
                        awards[participant] = new SortedSet<string>();
                    }

                    awards[participant].Add(award);
                }

                input = Console.ReadLine();
            }

            if (!awards.Any())
            {
                Console.WriteLine("No awards");
            }
            else
            {
                var sortedAwards = awards
                    .OrderByDescending(x => x.Value.Count())
                    .ThenBy(x => x.Key)
                    .ToDictionary(x => x.Key, x => x.Value);

                foreach (var participant in sortedAwards)
                {
                    Console.WriteLine($"{participant.Key}: {participant.Value.Count} awards");
                    var currentParticipantAwards = participant.Value;

                    foreach (var award in currentParticipantAwards)
                    {
                        Console.WriteLine($"--{award}");
                    }
                }
            }
        }
    }
}
