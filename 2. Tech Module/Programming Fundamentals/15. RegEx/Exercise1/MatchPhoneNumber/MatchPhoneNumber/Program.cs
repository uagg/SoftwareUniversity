﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace MatchPhoneNumber
{
    /* Write a regular expression to match a valid phone number from Sofia. A valid number will start with "+359" followed by the area code (2) and then
     * the number itself, consisting of 7 digits (separated in two group of 3 and 4 digits respectively). The different parts of the number are separated
     * by either a space or a hyphen ('-'). Refer to the examples to get the idea. 
    • Use quantifiers to match a specific number of digits
    • Use a capturing group to make sure the delimiter is only one of the allowed characters (space or hyphen) and not a combination of both. Use the group
    number to achieve this
    • Add a word boundary at the end of the match to avoid partial matches (the last example on the right-hand side)
    • Ensure that before the '+' sign there is either a space or the beginning of the string */
    class Program
    {
        static void Main(string[] args) 
        {
            var input = Console.ReadLine();
            var pattern = @"\+359( |-)2\1\d{3}\1\d{4}\b";
            var regex = new Regex(pattern);
            var matches = regex
                .Matches(input)
                .Cast<Match>()
                .Select(m => m.Value)
                .ToArray();

            Console.WriteLine(string.Join(", ", matches));
        }
    }
}
