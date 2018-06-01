using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DistanceBetweenPoints
{
    /*  */
    class Program
    {
        static void Main(string[] args)
        {
            var pointInput1 = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            var point2 = SetPoints(pointInput1);
            var pointInput2 = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            var point1 = SetPoints(pointInput2);

            var result = CalcDistance(point1, point2);
            Console.WriteLine($"{result:F3}");
        }

        public static Point SetPoints(int[] pointInput)
        {
            return new Point
            {
                X = pointInput[0],
                Y = pointInput[1]
            };
        }

        public static double CalcDistance(Point p1, Point p2)
        {
            var deltaX = p2.X - p1.X;
            var deltaY = p2.Y - p1.Y;
            var result = Math.Sqrt(deltaX * deltaX + deltaY * deltaY);

            return result;
        }
    }

    class Point
    {
        public int X { get; set; }
        public int Y { get; set; }
    }
}
