using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercises
{
    /* Exercises are fun … Especially when they represent a problem from your exercises. Implement a class Exercise,
     * which has a Topic (string), a CourseName (string), a JudgeContestLink (string), and a Problems (collection of strings).
    You will receive several input lines containing information about a single exercise in the following format:
        {topic} -> {courseName} -> {judgeContestLink} -> {problem1}, {problem2}. . .
    You need to store every exercise in a Collection of Exercises. When you receive the command “go go go”, you end the input sequence.
    You must print every exercise, in the following format: 
        “Exercises: {topic}
         Problems for exercises and homework for the “{courseName}” course @ SoftUni.
         Check your solutions here: {judgeContestLink}.
         1. {problem1}
         2. {problem2}
         . . .” */
    class Program
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine();
            var exercises = new List<Exercise>();

            while (input != "go go go")
            {
                var currentExercise = ReadExercise(input);
                exercises.Add(currentExercise);

                input = Console.ReadLine();
            }

            foreach (var exercise in exercises)
            {
                Console.WriteLine($"Exercises: {exercise.Topic}");
                Console.WriteLine($"Problems for exercises and homework for the \"{exercise.CourseName}\" course @ SoftUni.");
                Console.WriteLine($"Check your solutions here: {exercise.JudgeContestLink}");

                for (int i = 0; i < exercise.Problems.Count; i++)
                {
                    Console.WriteLine($"{i + 1}. {exercise.Problems[i]}");
                }
            }
        }

        static Exercise ReadExercise(string input)
        {
            var tokens = input.Split(new[] { ' ', '-', '>', ',' }, StringSplitOptions.RemoveEmptyEntries).ToArray();

            return new Exercise
            {
                Topic = tokens[0],
                CourseName = tokens[1],
                JudgeContestLink = tokens[2],
                Problems = tokens.Skip(3).ToList()
            };
        }
    }

    class Exercise
    {
        public string Topic { get; set; }
        public string CourseName { get; set; }
        public string JudgeContestLink { get; set; }
        public List<string> Problems { get; set; }
    }
}
