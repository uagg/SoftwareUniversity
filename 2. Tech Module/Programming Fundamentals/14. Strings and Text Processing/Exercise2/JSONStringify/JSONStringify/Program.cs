using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JSONStringify
{
    /* JSON is a syntax for storing and exchanging data. It’s derived from JavaScript Object Notation. You have been tasked to create
     * a database of students, and store them in the JSON format. First, create a Student class, which will represent our data model
     * – it will hold our data. The Student should have a Name (string), an Age (integer), and Grades (Collection of integer numbers).
    This will be enough to store our data. We’ll need a collection of Students, since we will store a lot of students. And now let’s
    see the input and output formats. */
    class Program
    {
        static void Main(string[] args)
        {
            var studentsDatabase = new List<Student>();

            var input = Console.ReadLine();
            while (input != "stringify")
            {
                Student currentStudent = ReadInput(input);
                studentsDatabase.Add(currentStudent);

                input = Console.ReadLine();
            }
            List<string> register = new List<string>();

            foreach (var student in studentsDatabase)
            {
                var registerEntry = $"{{name:\"{student.Name}\",age:{student.Age},grades:[{string.Join(", ", student.Grades)}]}}";
                register.Add(registerEntry);
            }

            Console.WriteLine($"[{string.Join(",", register)}]");
        }

        public static Student ReadInput(String input)
        {
            var tokens = input.Split(new[] { ':', '-', '>' }, StringSplitOptions.RemoveEmptyEntries);
            var name = tokens[0].Trim();
            var age = int.Parse(tokens[1]);
            var grades = new List<int>();

            if (tokens.Length > 2)
            {
                grades = tokens[2].Split(new[] { ',', ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToList();
            }

            return new Student
            {
                Name = name,
                Age = age,
                Grades = grades
            };
        }
    }

    class Student
    {
        public string Name { get; set; }
        public int Age { get; set; }
        public List<int> Grades { get; set; }
    }
}
