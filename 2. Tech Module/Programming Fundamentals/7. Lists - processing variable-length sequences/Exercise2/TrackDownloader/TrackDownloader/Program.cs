using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TrackDownloader
{
    class Program
    {
        static void Main(string[] args)
        {
            var blackList = Console.ReadLine().Split(' ').ToList();
            var fileNames = Console.ReadLine();
            var sortedList = new List<string>();

            while (fileNames != "end")
            {
                bool isBlackListed = false;
                foreach (var keyWord in blackList)
                {
                    if (fileNames.Contains(keyWord))
                    {
                        isBlackListed = true;
                        break;
                    }
                }

                if (!isBlackListed)
                {
                    sortedList.Add(fileNames);
                }

                fileNames = Console.ReadLine();
            }

            sortedList.Sort();
            foreach (var song in sortedList)
            {
                Console.WriteLine(song);
            }

        }
    }
}
