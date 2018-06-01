using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FilterBase
{
    /* You have been tasked to sort out a database full of information about employees. You will be given several input lines containing
     * information in one of the following formats:
•	{name} -> {age}
•	{name} -> {salary}
•	{name} -> {position}
    As you see you have 2 parameters. There can be only 3 cases of input:
        If the second parameter is an integer, you must store it as name and age.
        If the second parameter is a floating-point number, you must store it as name and salary.
        If the second parameter is a string, you must store it as name and position.
    You must read input lines, then parse and store the information from them, until you receive the command 
    “filter base”. When you receive that command, the input sequence of employee information should end.
    On the last line of input you will receive a string, which can either be “Age”, “Salary” or “Position”.
    Depending on the case, you must print all entries which have been stored as name and age, name and salary, or name and position.
    In case, the given last line is “Age”, you must print every employee, stored with its age in the following format:
    Name: {name1}
    Age: {age1}
    ====================
    Name: {name2}
    . . .
    In case, the given last line is “Salary”, you must print every employee, stored with its salary in the following format:
    Name: {name1}
    Salary: {salary1}
    ====================
    Name: {name2}
    . . .
    NOTE: The Salary must be formatted to 2 digits after the decimal point.
    In case, the given last line is “Position”, you must print every employee, stored with its position in the following format:
    Name: {name1}
    Position: {position1}
    ====================
    Name: {name2}
    . . .
    NOTE: Every entry is separated with the other, with a string of 20 character ‘=’.
    There is NO particular order of printing – the data must be printed in order of input. */
    class Program
    {
        static void Main(string[] args)
        {
            var ageDictionary = new Dictionary<string, int>();
            var salaryDictionary = new Dictionary<string, double>();
            var positionDictionary = new Dictionary<string, string>();
            var input = Console.ReadLine();

            while (input != "filter base")
            {
                var inputSettings = input.Split(new[] { '-', '>', ' ' }, StringSplitOptions.RemoveEmptyEntries).ToArray();
                var name = inputSettings[0];
                var age = 0;
                var salary = 0.0D;

                if (int.TryParse(inputSettings[1], out age))
                {
                    if (!ageDictionary.ContainsKey(name))
                    {
                        ageDictionary[name] = 0;
                    }
                    ageDictionary[name] = age;
                }
                else if (double.TryParse(inputSettings[1], out salary))
                {
                    if (!salaryDictionary.ContainsKey(name))
                    {
                        salaryDictionary[name] = 0;
                    }
                    salaryDictionary[name] = salary;
                }
                else
                {
                    if (!positionDictionary.ContainsKey(name))
                    {
                        positionDictionary[name] = string.Empty;
                    }
                    positionDictionary[name] = inputSettings[1];
                }

                input = Console.ReadLine();
            }

            input = Console.ReadLine();
            
            switch (input)
            {
                case "Age":
                    foreach (var entry in ageDictionary)
                    {
                        Console.WriteLine($"Name: {entry.Key}");
                        Console.WriteLine($"Age: {entry.Value}");
                        Console.WriteLine("====================");
                    }
                    break;
                case "Salary":
                    foreach (var entry in salaryDictionary)
                    {
                        Console.WriteLine($"Name: {entry.Key}");
                        Console.WriteLine($"Salary: {entry.Value:F2}");
                        Console.WriteLine("====================");
                    }
                    break;
                case "Position":
                    foreach (var entry in positionDictionary)
                    {
                        Console.WriteLine($"Name: {entry.Key}");
                        Console.WriteLine($"Position: {entry.Value}");
                        Console.WriteLine("====================");
                    }
                    break;
            }
        }
    }
}
