using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animals
{
    /* You have been given the task to create classes for several sophisticated animals.
    Create a class Dog which has a Name (string), Age (int) and NumberOfLegs (int).
    Create a class Cat which has a Name (string), Age (int) and IntelligenceQuotient (int).
    Create a class Snake which has a Name (string), Age(int) and CrueltyCoefficient (int).
    Create a method in each class which is called public void ProduceSound(). The method should print on the console a string depending on the class:
        • If it’s a Dog, you should print “I’m a Distinguishedog, and I will now produce a distinguished sound! Bau Bau.”
        • It it’s a Cat, you should print “I’m an Aristocat, and I will now produce an aristocratic sound! Myau Myau.”
        • If it’s a Snake, you should print “I’m a Sophistisnake, and I will now produce a sophisticated sound! Honey, I’m home.”
    Now for the real deal. You will receive several input commands, which will register animals or make them produce sounds,
    until you receive the command “I’m your Huckleberry”. The commands will be in the following format:
        {class} {name} {age} {parameter}
    The class will be either “Dog”, “Cat” or “Snake”. The name will be a simple string, which can contain any ASCII character BUT space.
    The age will be an integer. The parameter, will be an integer. Depending on the class it would either be number of legs, IQ, or cruelty coefficient.
    Register each animal, and keep them in collections, by your choice, so that you can ACCESS THEM BY NAME. You will most likely need 3 collections,
    to store the different animals inside them. Between the register commands you might receive a command in the following format:
        talk {name}
    You must then make the animal with the given name, produce a sound.
    When you receive the ending command, you should print every animal in the following format:
        • If it’s a Dog, you should print “Dog: {name}, Age: {age}, Number Of Legs: {numberOfLegs}”
        • It it’s a Cat, you should print “Cat: {name}, Age: {age}, IQ: {intelligenceQontient}”
        • If it’s a Snake, you should print “Snake: {name}, Age: {age}, Cruelty: {crueltyCoefficient}”
    Print first the Dogs, then the Cats, and lastly – The Snakes. */
    class Program
    {
        static void Main(string[] args)
        {
            var dogs = new Dictionary<string, Dog>();
            var cats = new Dictionary<string, Cat>();
            var snakes = new Dictionary<string, Snake>();

            var input = Console.ReadLine();

            while (input != "I'm your Huckleberry")
            {
                var inputArray = input.Split(' ').ToArray();
                var Class = inputArray[0];
                var Name = inputArray[1];
                switch (Class)
                {
                    case "Dog":
                        var currentDog = new Dog
                        {
                            Name = inputArray[1],
                            Age = int.Parse(inputArray[2]),
                            NumberOfLegs = int.Parse(inputArray[3])
                        };
                        dogs.Add(Name, currentDog);
                        break;
                    case "Cat":
                        var currentCat = new Cat
                        {
                            Name = inputArray[1],
                            Age = int.Parse(inputArray[2]),
                            IntelligenceQuotient = int.Parse(inputArray[3])
                        };
                        cats.Add(Name, currentCat);
                        break;
                    case "Snake":
                        var currentSnake = new Snake
                        {
                            Name = inputArray[1],
                            Age = int.Parse(inputArray[2]),
                            CrueltyCoefficient = int.Parse(inputArray[3])
                        };
                        snakes.Add(Name, currentSnake);
                        break;
                    case "talk":
                        if (dogs.ContainsKey(Name))
                        {
                            dogs[Name].ProduceSound();
                        }

                        if (cats.ContainsKey(Name))
                        {
                            cats[Name].ProduceSound();
                        }

                        if (snakes.ContainsKey(Name))
                        {
                            snakes[Name].ProduceSound();
                        }
                        break;
                }

                input = Console.ReadLine();
            }

            foreach (var dog in dogs.Values)
            {
                Console.WriteLine($"Dog: {dog.Name}, Age: {dog.Age}, Number Of Legs: {dog.NumberOfLegs}");
            }

            foreach (var cat in cats.Values)
            {
                Console.WriteLine($"Cat: {cat.Name}, Age: {cat.Age}, IQ: {cat.IntelligenceQuotient}");
            }

            foreach (var snake in snakes.Values)
            {
                Console.WriteLine($"Snake: {snake.Name}, Age: {snake.Age}, Cruelty: {snake.CrueltyCoefficient}");
            }
        }
    }

    class Dog
    {
        public string Name { get; set; }
        public int Age { get; set; }
        public int NumberOfLegs { get; set; }

        public void ProduceSound()
        {
            Console.WriteLine("I'm a Distinguishedog, and I will now produce a distinguished sound! Bau Bau.");
        }
    }

    class Cat
    {
        public string Name { get; set; }
        public int Age { get; set; }
        public int IntelligenceQuotient { get; set; }

        public void ProduceSound()
        {
            Console.WriteLine("I'm an Aristocat, and I will now produce an aristocratic sound! Myau Myau.");
        }
    }

    class Snake
    {
        public string Name { get; set; }
        public int Age { get; set; }
        public int CrueltyCoefficient { get; set; }

        public void ProduceSound()
        {
            Console.WriteLine("I'm a Sophistisnake, and I will now produce a sophisticated sound! Honey, I'm home.");
        }
    }
}
