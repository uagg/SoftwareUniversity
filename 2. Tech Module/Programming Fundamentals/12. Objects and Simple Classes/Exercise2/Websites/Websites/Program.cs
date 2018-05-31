using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Websites
{
    /* You have been tasked to create an ordered database of websites. For the task you will need to create a class Website,
     * which will have a Host, a Domain and Queries. The Host and the Domain are simple strings. The Queries, is Collections of strings.
    You will be given several input lines in the following format:
        {host} | {domain} | {query1,query2. . .}
    Note: There will always be a host and a domain, but there might NOT be ANY queries.
    The input sequence ends, when you receive the command “end”. Then you must print all websites in the following format:
        https://www.{host}.{domain}/query?=[{query1]&[{query2}]&[query3]. . .
    In case there are NO queries, just print:
        https://www.{host}.{domain} */
    class Program
    {
        public static void Main(string[] args)
        {
            var database = new List<Website>();
            var input = Console.ReadLine();

            while (input != "end")
            {
                var currentSite = GetWebSiteData(input);
                database.Add(currentSite);

                input = Console.ReadLine();
            }

            foreach (var website in database)
            {
                if (website.Queries.Count > 0)
                {
                    Console.WriteLine($"https://www.{website.Host}.{website.Domain}/query?=[{string.Join("]&[", website.Queries)}]");
                } else
                {
                    Console.WriteLine($"https://www.{website.Host}.{website.Domain}");
                }
            }
        }

        public static Website GetWebSiteData(string input)
        {
            var tokens = input.Split(new[] { ' ', '|', ',' }, StringSplitOptions.RemoveEmptyEntries).ToArray();

            var host = tokens[0];
            var domain = tokens[1];
            var queries = new List<string>();

            if (tokens.Length > 2)
            {
                queries = tokens.Skip(2).ToList();
            }

            return new Website
            {
                Host = host,
                Domain = domain,
                Queries = queries
            };
        }
    }

    class Website
    {
        public string Host { get; set; }
        public string Domain { get; set; }
        public List<string> Queries { get; set; }

    }
}
