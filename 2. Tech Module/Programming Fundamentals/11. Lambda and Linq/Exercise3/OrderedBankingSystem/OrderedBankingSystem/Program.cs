using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OrderedBankingSystem
{
    /* You have been given the task to write software for banking – in particular, an optimized program, which stores only the bank account’s name,
     * the bank account’s balance and the bank it is stored at.
    Input
    You will be given several input lines in the following format:
    {bank} -> {account} -> {balance}
    The bank and the account are strings, and the balance is a VARIABLE TYPE which is SUITABLE for storing MONEY.
    You should store every bank, each of its accounts, and their balances. 
    If you are given a bank which already exists, you must ADD the new account to it.
    If EVEN the account which already exists, you must INCREASE the old balance, with the new given one.
    When you receive the command “end”, you must end the input sequence. Then you must print the data in a specified ordered format.
    Output
    You must print each bank’s accounts and balances, ordering the BANKS by the sum of all account balances, in descending order. If 2 banks have the same sum,
    you should print the one with the highest maximum balance in its accounts, first. 
    The bank’s accounts must be ordered in descending order, by their balance.
    The balances, must be printed, as they are given. “500” = “500” … “500.00” = “500.00”. */
    class Program
    {
        static void Main(string[] args)
        {
            var onlineBanking = new Dictionary<string, Dictionary<string, decimal>>();
            var enterData = Console.ReadLine().Split(" ->".ToCharArray(), StringSplitOptions.RemoveEmptyEntries).ToList();

            while (enterData[0] != "end")
            {

                if (!onlineBanking.ContainsKey(enterData[0]))
                {
                    onlineBanking[enterData[0]] = new Dictionary<string, decimal>();
                }
                if (!onlineBanking[enterData[0]].ContainsKey(enterData[1]))
                {
                    onlineBanking[enterData[0]][enterData[1]] = decimal.Parse(enterData[2]);
                }
                else
                {
                    onlineBanking[enterData[0]][enterData[1]] += decimal.Parse(enterData[2]);
                }

                enterData = Console.ReadLine().Split(" ->".ToCharArray(), StringSplitOptions.RemoveEmptyEntries).ToList();
            }

            onlineBanking.OrderByDescending(bank => bank.Value.Sum(acount => acount.Value))
                .ThenByDescending(bank => bank.Value.Max(acount => acount.Value)).ToList()
                .ForEach(bank => bank.Value.OrderByDescending(acount => acount.Value).ToList()
                .ForEach(acount => Console.WriteLine($"{acount.Key} -> {acount.Value} ({bank.Key})")));
        }
    }
}
