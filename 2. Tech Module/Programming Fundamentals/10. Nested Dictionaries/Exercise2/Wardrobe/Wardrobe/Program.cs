using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Wardrobe
{
    /* You just bought a new wardrobe. The weird thing about it is that it came prepackaged with a big box of clothes
     * (just like those refrigerators, which ship with free beer inside them)! So, you’ll need to find something to wear.
     *On the first line of the input, you will receive n –  the number of lines of clothes, which came prepackaged for the wardrobe.
     * On the next n lines, you will receive the clothes for each color in the format: “{color} -> {item1},{item2},{item3}…”
     * If a color is added a second time, add all items from it and count the duplicates. Finally, you will receive the color and item of
     * the clothing, that you need to look for.
     * Go through all the colors of the clothes and print them in the following format:
    {color} clothes:
*   {item1} - {count}
*   {item2} - {count}
*   {item3} - {count}
    …
*   {itemN} - {count}
    If the color lines up with the clothing item, print “(found!)” alongside the item. See the examples to better understand the output. */
    class Program
    {
        static void Main(string[] args)
        {
            var n = int.Parse(Console.ReadLine());
            var wardrobe = new Dictionary<string, Dictionary<string, int>>();

            for (int i = 0; i < n; i++)
            {
                var tokens = Console.ReadLine().Split(new string[] { " -> " }, StringSplitOptions.RemoveEmptyEntries).ToList();
                var colors = tokens[0];
                var clot = tokens[1].Split(',').ToList();

                if (!wardrobe.ContainsKey(colors))
                {
                    wardrobe[colors] = new Dictionary<string, int>();
                }

                
                for (int j = 0; j < clot.Count; j++)
                {
                    if (!wardrobe[colors].ContainsKey(clot[j]))
                    {
                        wardrobe[colors][clot[j]] = new int();
                        wardrobe[colors][clot[j]] = 1;
                    }
                    else
                    {
                        wardrobe[colors][clot[j]]++;
                    }
                }
            }

            var search = Console.ReadLine().Split(' ');
            var color = search[0];
            var clothing = search[1];

            foreach (var col in wardrobe)
            {
                var colorName = col.Key;
                var clothType = col.Value;

                Console.WriteLine($"{colorName} clothes:");

                foreach (var cl in clothType)
                {
                    var clothName = cl.Key;
                    var count = cl.Value;

                    if (clothing == clothName && color == colorName)
                    {
                        Console.WriteLine($"* {clothName} - {count} (found!)");
                    }
                    else
                    {
                        Console.WriteLine($"* {clothName} - {count}");
                    }                    
                }
            }
        }
    }
}
