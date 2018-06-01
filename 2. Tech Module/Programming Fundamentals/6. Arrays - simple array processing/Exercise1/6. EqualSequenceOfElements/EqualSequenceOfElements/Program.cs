using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EqualSequenceOfElements
{
    class Program
    {
        static void Main(string[] args)
        {
            var arrayOfIntegers = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int saveElementToCheck = arrayOfIntegers[0];
            bool isEqual = true;
            for (int i = 0; i < arrayOfIntegers.Length; i++)
            {
                if(saveElementToCheck != arrayOfIntegers[i])
                {
                    isEqual = false;
                }
                saveElementToCheck = arrayOfIntegers[i];
            }
            if(isEqual)
            {
                Console.WriteLine("Yes");
            } else
            {
                Console.WriteLine("No");
            }
            
        }
    }
}
