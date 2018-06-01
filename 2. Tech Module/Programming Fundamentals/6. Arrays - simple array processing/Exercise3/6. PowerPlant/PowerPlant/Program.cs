using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PowerPlant
{
    /* Ever heard of Power Plants? Power Plants are a special type of plant which collectively withers and blooms in strange ways.
       You will receive an array of integers, holding the plants’ power level. If a plant’s power reaches 0, it dies.
       The plants get more and more withered each day, and so – their power decreases by 1, except for one special plant,
       which blooms instead. The special plant which blooms is the one whose index corresponds to the current day. Its power is
       increased by 1, but only if it isn’t dead (but since it has withered the same day, realistically its power stays the same).
       When a season ends, all plants which are still alive bloom. The season ends when the Nth day is reached, N being the total number of plants.
       Your task is to calculate how many days and seasons it will take for all the plants to die. Print them on the console in the following format:
       “survived {days} days ({seasons} seasons)” */
    class Program
    {
        static void Main(string[] args)
        {
            var array = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();

            var day = 0;
            var sum = 0;
            var season = 0;

            for (int i = 0; i < array.Length; i++)
            {
                sum += array[i];
            }
            
            while (sum > 0)
            {
                for (int dayIndx = 0; dayIndx < array.Length; dayIndx++)
                {
                    for (int i = 0; i < array.Length; i++)
                    {
                        if (dayIndx == i)
                        {
                            array[i] = array[i];
                        } else
                        {
                            array[i] = array[i] - 1;
                            if (array[i] < 0)
                            {
                                array[i] = 0;
                            }
                        }
                    }

                    sum = 0;

                    for (int i = 0; i < array.Length; i++)
                    {
                        sum += array[i];
                    }

                    day++;

                    if (sum == 0)
                    {
                        break;
                    }

                    if (day % array.Length == 0)
                    {
                        for (int i = 0; i < array.Length; i++)
                        {
                            if (array[i] > 0)
                            {
                                array[i]++;
                            }
                        }
                        season++;
                    }
                }
            }

            if (season == 1)
            {
                Console.WriteLine($"survived {day} days ({season} season)");
            }
            else
            {
                Console.WriteLine($"survived {day} days ({season} seasons)");
            }
        }
    }
}
