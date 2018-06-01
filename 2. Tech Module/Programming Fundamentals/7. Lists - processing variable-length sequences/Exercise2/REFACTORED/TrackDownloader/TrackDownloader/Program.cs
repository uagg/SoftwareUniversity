using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TrackDownloader
{
    /* You will receive a list of blacklisted words (on the same line, separated by one space).
     * On the next lines, you will start receiving a list of filenames (as strings) until you receive the string “end”.
     * Your task is to add the filenames to a list and sort them. Ignore the tracks which contain the text in the blacklist. */
    class Program
    {
        static void Main(string[] args)
        {
            var blackList = Console.ReadLine().Split(' ').ToList();
            var playList = new List<string>();
            var command = string.Empty;
            
            while (!command.Contains("end"))
            {
                command = Console.ReadLine();
                var isInBlackList = false;
                if (command == "end")
                {
                    isInBlackList = true;
                }

                foreach (var word in blackList)
                {
                    if (command.Contains(word))
                    {
                        isInBlackList = true;
                        break;
                    }
                }

                if (!isInBlackList)
                {
                    playList.Add(command);
                }
            }
            playList.Sort();

            foreach (var song in playList)
            {
                Console.WriteLine(song);
            }
        }
    }
}
