using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RectanglePosition
{
    /* Write a program to read two rectangles {left, top, width, height} and print whether the first is inside the second.
    The input is given as two lines, each holding a rectangle, described by 4 integers: left, top, width and height. */
    class Program
    {
        static void Main(string[] args)
        {
            var rectangle1 = ReadRectangle();
            var rectangle2 = ReadRectangle();

            Console.WriteLine(rectangle1.IsInside(rectangle2) ? "Inside" : "Not inside");

        }

        static Rectangle ReadRectangle()
        {
            var coordinatesInfo = Console.ReadLine().Split().Select(int.Parse).ToArray();

            var rectangle = new Rectangle();
            rectangle.Left = coordinatesInfo[0];
            rectangle.Top = coordinatesInfo[1];
            rectangle.Width = coordinatesInfo[2];
            rectangle.Height = coordinatesInfo[3];

            return rectangle;
        }
    }
    
    class Rectangle
    {
        public int Top { get; set; }
        public int Left { get; set; }
        public int Width { get; set; }
        public int Height { get; set; }

        private int CalcArea()
        {
            return Width * Height;
        }

        private int Bottom
        {
            get
            {
                return Top + Height;
            }
        }

        private int Right
        {
            get
            {
                return Left + Width;
            }
        }

        public bool IsInside(Rectangle r)
        {
            return (r.Left <= Left) && (r.Right >= Right) && (r.Top <= Top) && (r.Bottom >= Bottom);
        }
    }
}
