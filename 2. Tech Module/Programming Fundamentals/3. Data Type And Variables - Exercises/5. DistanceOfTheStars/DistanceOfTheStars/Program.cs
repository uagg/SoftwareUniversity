﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DistanceOfTheStars
{
    class Program
    {
        static void Main(string[] args)
        {
            decimal proxima = 4.22M * 9460000000000M;
            decimal milkyWay = 26000M * 9450000000000M;
            decimal radiusMilkyWay = 100000M * 9450000000000M;
            decimal distanceEarth = 46500000000M * 9450000000000M;
            
            Console.WriteLine(proxima.ToString("e2"));
            Console.WriteLine(milkyWay.ToString("e2"));
            Console.WriteLine(radiusMilkyWay.ToString("e2"));
            Console.WriteLine(distanceEarth.ToString("e2"));
        }
    }
}
