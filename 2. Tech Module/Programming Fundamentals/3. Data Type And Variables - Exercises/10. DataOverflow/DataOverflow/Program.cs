using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataOverflow
{
    class Program
    {
        static void Main(string[] args)
        {
            ulong number1 = ulong.Parse(Console.ReadLine());
            ulong number2 = ulong.Parse(Console.ReadLine());

            ulong bigger = Math.Max(number1, number2);
            ulong smaller = Math.Min(number1, number2);

            string biggerType = "";
            string smallerType = "";
            ulong smallTypeSize = 0;
            if (bigger > byte.MinValue && bigger <= byte.MaxValue)
            {
                biggerType = "byte";
            }
            else if (bigger > ushort.MinValue && bigger <= ushort.MaxValue)
            {
                biggerType = "ushort";
            }
            else if (bigger > uint.MinValue && bigger <= uint.MaxValue)
            {
                biggerType = "uint";
            }
            else if (bigger > ulong.MinValue && bigger <= ulong.MaxValue)
            {
                biggerType = "ulong";
            }

            if (smaller > byte.MinValue && smaller <= byte.MaxValue)
            {
                smallerType = "byte";
                smallTypeSize = byte.MaxValue;
            }
            else if (smaller > ushort.MinValue && smaller <= ushort.MaxValue)
            {
                smallerType = "ushort";
                smallTypeSize = ushort.MaxValue;
            }
            else if (smaller > uint.MinValue && smaller <= uint.MaxValue)
            {
                smallerType = "uint";
                smallTypeSize = uint.MaxValue;
            }
            else if (smaller > ulong.MinValue && smaller <= ulong.MaxValue)
            {
                smallerType = "ulong";
                smallTypeSize = ulong.MaxValue;
            }

            Console.WriteLine("bigger type: {0}", biggerType);
            Console.WriteLine("smaller type: {0}", smallerType);
            Console.WriteLine("{0} can overflow {1} {2} times", bigger, smallerType, Math.Round((double)bigger / smallTypeSize));
        }
    }
}
