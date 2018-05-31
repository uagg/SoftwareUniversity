using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserLogins
{
    /* Write a program that receives a list of username-password pairs in the format “{username} -> {password}”.
     * If there’s already a user with that username, replace their password. After you receive the command “login”,
     * login requests start coming in, using the same format. Your task is to print the status of user login,
     * using different messages as per the conditions below:
     * If the password matches with the user’s password, print “{username}: logged in successfully”.
     * If the user doesn’t exist, or the password doesn’t match the user, print “{username}: login failed”. 
     * When you receive the command “end”, print the count of unsuccessful login attempts, using the format “unsuccessful login attempts: {count}”. */
    class Program
    {
        static void Main(string[] args)
        {
            var database = new Dictionary<string, string>();
            var registerAndLogin = Console.ReadLine().Split(' ').ToArray();
            var hasUsername = false;
            var isSamePassword = false;
            var unsuccessfulLogins = 0;

            while (registerAndLogin[0] != "login")
            {
                database[registerAndLogin[0]] = registerAndLogin[2];
                registerAndLogin = Console.ReadLine().Split(' ').ToArray();
            }

            registerAndLogin = Console.ReadLine().Split(' ').ToArray();

            while (registerAndLogin[0] != "end")
            {
                if (database.ContainsKey(registerAndLogin[0]))
                {
                    hasUsername = true;

                    if (database[registerAndLogin[0]] == registerAndLogin[2])
                    {
                        isSamePassword = true;
                    }
                }

                if (hasUsername && isSamePassword)
                {
                    Console.WriteLine($"{registerAndLogin[0]}: logged in successfully");
                }
                else
                {
                    Console.WriteLine($"{registerAndLogin[0]}: login failed");
                    unsuccessfulLogins++;
                }

                hasUsername = false;
                isSamePassword = false;

                registerAndLogin = Console.ReadLine().Split(' ').ToArray();
            }

            Console.WriteLine($"unsuccessful login attempts: {unsuccessfulLogins}");
        }
    }
}
