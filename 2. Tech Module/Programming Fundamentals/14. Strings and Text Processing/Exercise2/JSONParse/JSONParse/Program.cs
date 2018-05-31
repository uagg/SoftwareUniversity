using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JSONParse
{
    /*Stringifying a JSON was easy? You want something harder? Well … JSON parse is your problem. You will receive a JSON collection of students. 
    You need to parse it to Student objects. The input will consist of a single line containing the students’ info. 
    The students will be given in the following way:
    [{student1},{student2}. . .]
    Each student will be given in the following format:
    {name:”{name}”,age:{age},grades:[{grade1}, {grade2}. . .]}
    Parse the input data, and print each student in the following way.
    {name} : {age} -> {grade1}, {grade2}, {grade3}. . .
    In case there are NO grades, print “None”.  */
    class Program
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine();
            var start = "{";
            var end = "}";

            var indexOfStart = input.IndexOf(start);
            var indexOfEnd = input.IndexOf(end);
            var currentStudent = string.Empty;
            var students = new List<Student>();
            var student = new Student();
            
            while (indexOfStart != -1)
            {
                currentStudent = input.Substring(indexOfStart, indexOfEnd - indexOfStart);
                var tokens = currentStudent.Split(new[] { '{', '}', ':', '\"', ',', '[', ']' }, StringSplitOptions.RemoveEmptyEntries);

                student.Name = tokens[1];
                student.Age = int.Parse(tokens[3]);
                student.Grades = tokens.Skip(5).Select(int.Parse).ToList();

                if (student.Grades.Count == 0)
                {
                    Console.WriteLine($"{student.Name} : {student.Age} -> None");
                }
                else
                {
                    Console.WriteLine($"{student.Name} : {student.Age} -> {string.Join(", ", student.Grades)}");
                }

                indexOfStart = input.IndexOf(start, indexOfStart + 1);
                indexOfEnd = input.IndexOf(end, indexOfStart + 1);
                currentStudent = string.Empty;
            }
        }
    }

    class Student
    {
        public string Name { get; set; }
        public int Age { get; set; }
        public List<int> Grades { get; set; }
    }
}
