using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RabbitHole
{
    /* Rabbit hole is a term for a portal for time travel. 
     * You are trying to go back in the past to prevent Kennedy’s assassination. But first you should find the rabbit hole.
     * Your energy is limited and if you exhaust it, you will be tired and can’t continue the mission.
     * You will be given an array of strings representing different obstacles you should overcome. 
     * “Left|[integer value]”-you should jump to the left with [integer value] positions and decrease your energy with [integer value];
     * “Right|[integer value]”-you should jump to the right with [integer value] positions and decrease your energy with [integer value];
     * “Bomb|[integer value]”-the bomb explodes and this element of the array should be removed,
     * your energy should be decreased be the [integer value], you should start from the beginning (index 0);
     * “RabbitHole” – you have found the rabbit hole, the program should stop here, print on the console – “You have 5 years to save Kennedy!”
     * Your mission begins at the first element of the array. The rabbit hole will be only one.
     * The program ends when you find the rabbit hole or when your energy is gone. And if it is gone due to bomb explosion
     * you should print “You are dead due to bomb explosion!” on the console or if it is due jumps print “You are tired.
     * You can't continue the mission.”.
     * After every move someone puts a bomb at the end of the array with [integer value] of your current energy
     * (the last element is removed and the bomb is placed there, but when the last element is the “RabbitHole”,
     * it can’t be removed and the bomb is placed after it). */
    class Program
    {
        static void Main(string[] args)
        {
            var obstacles = Console.ReadLine().Split(' ').ToList();
            var energy = int.Parse(Console.ReadLine());
            var index = 0;

            while (energy > 0)
            {
                var commandsAndValues = obstacles[index].Split('|').ToArray();
                var command = commandsAndValues[0];
                var bombed = false;

                if ("RabbitHole".Equals(command))
                {
                    Console.WriteLine("You have 5 years to save Kennedy!");
                    break;
                }

                var commandValue = int.Parse(commandsAndValues[1]);

                switch (command)
                {
                    case "Left":
                        index = Math.Abs(index - commandValue) % obstacles.Count;
                        energy -= commandValue;
                        break;
                    case "Right":
                        index = (index + commandValue) % obstacles.Count;
                        energy -= commandValue;
                        break;
                    case "Bomb":
                        obstacles.RemoveAt(index);
                        index = 0;
                        energy -= commandValue;
                        bombed = true;
                        break;
                }

                if (obstacles[obstacles.Count - 1] != "RabbitHole")
                {
                    obstacles.RemoveAt(obstacles.Count - 1);
                }

                obstacles.Add("Bomb|" + energy);

                if (energy <= 0 && bombed)
                {
                    Console.WriteLine("You are dead due to bomb explosion!");
                }
                else if (energy <= 0 && !bombed)
                {
                    Console.WriteLine("You are tired. You can't continue the mission.");
                }
            }
        }
    }
}
