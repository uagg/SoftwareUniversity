using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FoldAndSum
{
    /* Read an array of 4*k integers, fold it like shown below, and print the sum of the upper and lower rows (2*k integers):
     * 12345678
     * 
     * ^-12 - 3456 - 78--^
     * 2187
     * 3456 */
    class Program
    {
        static void Main(string[] args)
        {
            var intArr = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            var k = intArr.Length / 4;
            var upLeft = intArr.Take(k).Reverse().ToArray();
            var upRight = intArr.Reverse().Take(k).ToArray();
            var up = upLeft.Concat(upRight).ToArray();
            var down = intArr.Skip(k).Take(k * 2).ToArray();
            var colSum = up.Select((x, index) => x + down[index]);
            
            Console.WriteLine(string.Join(" ", colSum));
        }
    }
}
