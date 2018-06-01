using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AverageStudentGrades
{
    /* Write a program, which reads the name of a student and their grades and adds them to the student record,
     * then prints grades along with their average grade. */
    class Program
    {
        static void Main(string[] args)
        {
            var n = int.Parse(Console.ReadLine());
            var classbook = new Dictionary<string, List<double>>();

            for (int i = 0; i < n; i++)
            {
                var tokens = Console.ReadLine().Split();
                var name = tokens[0];
                var grade = double.Parse(tokens[1]);

                if (!classbook.ContainsKey(name))
                {
                    classbook[name] = new List<double>();
                }
                classbook[name].Add(grade);
            }
            
            foreach (var pair in classbook)
            {
                var name = pair.Key;
                var studentGrades = pair.Value;
                var average = studentGrades.Average();

                Console.Write($"{name} -> ");
                
                foreach (var grade in studentGrades)
                {
                    Console.Write($"{grade:F2} ");
                }

                Console.WriteLine($"(avg: {average:F2})");
            }
        }
    }
}
