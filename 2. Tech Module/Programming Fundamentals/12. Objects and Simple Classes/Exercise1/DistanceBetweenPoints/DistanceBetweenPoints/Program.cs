using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DistanceBetweenPoints
{
    /* Write a method to calculate the distance between two points p1 {x1, y1} and p2 {x2, y2}. Write a
     * program to read two points (given as two integers) and print the Euclidean distance between them. */
    class Program
    {
        static void Main(string[] args)
        {
            Point p1 = ReadPoint();
            Point p2 = ReadPoint();

            var distance = CalcDistance(p1, p2);

            Console.WriteLine($"{distance:F3}");
        }

        static double CalcDistance(Point p1, Point p2)
        {
            var deltaX = p2.X - p1.X;
            var deltaY = p2.Y - p1.Y;

            return Math.Sqrt(deltaX * deltaX + deltaY * deltaY);
        }

        static Point ReadPoint()
        {
            var pointInfo = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            var point = new Point();
            point.X = pointInfo[0];
            point.Y = pointInfo[1];

            return point;
        }
    }

    class Point
    {
        public int X { get; set; }
        public int Y { get; set; }
    }
}
