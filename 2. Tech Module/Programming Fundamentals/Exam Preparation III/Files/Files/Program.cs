using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Files
{
    class Program
    {
        static void Main(string[] args)
        {
            var n = int.Parse(Console.ReadLine());
            var filesByRoot = new Dictionary<string, Dictionary<string, long>>();
            var filesWithExtension = new Dictionary<string, string>();

            for (int i = 0; i < n; i++)
            {
                var input = Console.ReadLine().Split('\\');
                var root = input[0];
                var fileParams = input[input.Length - 1].Split(';');
                var fileNameWithExtension = fileParams[0];
                var fileSize = long.Parse(fileParams[1]);

                var fileName = fileNameWithExtension;
                var fileExtension = fileNameWithExtension.Split('.')[fileNameWithExtension.Split('.').Length - 1];

                if (!filesByRoot.ContainsKey(root))
                {
                    filesByRoot[root] = new Dictionary<string, long>();
                }

                filesByRoot[root][fileName] = fileSize;
                filesWithExtension[fileName] = fileExtension;
            }

            var queryParams = Console.ReadLine().Split(' ');

            var queryExtension = queryParams[0];
            var queryRoot = queryParams[2];

            var extractedFiles = new Dictionary<string, long>();

            if (filesByRoot.ContainsKey(queryRoot))
            {
                foreach (var file in filesByRoot[queryRoot])
                {
                    if (filesWithExtension[file.Key] == queryExtension)
                    {
                        extractedFiles.Add(file.Key, file.Value);
                    }
                }
            }

            if (extractedFiles.Count > 0)
            {
                foreach (var file in extractedFiles.OrderByDescending(x => x.Value).ThenBy(x => x.Key))
                {
                    Console.WriteLine($"{file.Key} - {file.Value} KB");
                }
            }
            else
            {
                Console.WriteLine("No");
            }
        }
    }
}
