﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NoteStatistics
{
    class Program
    {
        static void Main(string[] args)
        {
            var freq = Console.ReadLine().Split(' ').Select(double.Parse).ToList();

        }
    }
}