using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ForumTopics
{
    /* You have been tasked to store a few forum topics, and filter them by several given tags.You will be given several input lines,
     * containing data about topics in the following format: {topic} -> {tag1, tag2, tag3. . .} The topic and tags will be strings.
     * They will NOT contain spaces or ‘-’, ‘>’ symbols. If you receive an existent topic, you must add the new tags to it.
     * There should be NO duplicate tags. When you receive the command “filter”, you must end the input sequence.
     * On the next line (after “filter”), you will receive a sequence of tags, separated by a comma and a space.
     * You must print ONLY those topics, which CONTAIN ALL tags in the given sequence. The topics must be printed in the following format:
     * {topic} | {#tag1, #tag2, #tag3. . .} NOTE: The tags have a hashtag (‘#’) as a prefix. */
    class Program
    {
        static void Main(string[] args)
        {
            var dataInput = Console.ReadLine();
            var storage = new Dictionary<string, List<string>>();

            while (dataInput != "filter")
            {
                var tokens = dataInput.Split(new[] { ' ', '-', '>', ',' }, StringSplitOptions.RemoveEmptyEntries);
                var topic = tokens[0];

                if (!storage.ContainsKey(topic))
                {
                    storage[topic] = new List<string>();
                }

                for (int i = 1; i < tokens.Length; i++)
                {
                    if (!storage[topic].Contains(tokens[i]))
                    {
                        storage[topic].Add(tokens[i]);
                    }
                }

                dataInput = Console.ReadLine();
            }
            dataInput = Console.ReadLine();
            var tokens2 = dataInput.Split(new[] { ' ', ',' }, StringSplitOptions.RemoveEmptyEntries).ToArray();

            foreach (var entry in storage)
            {
                bool containsTag = false;
                for (int i = 0; i < tokens2.Length; i++)
                {
                    if (entry.Value.Contains(tokens2[i]))
                    {
                        containsTag = true;
                    }
                    else
                    {
                        containsTag = false;
                        break;
                    }
                }

                var topic = entry.Key;
                var tags = entry.Value;

                if (containsTag)
                {
                    Console.WriteLine($"{topic} | #{string.Join(", #", tags)}");
                }

            }
        }
    }
}
