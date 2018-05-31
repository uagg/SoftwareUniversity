using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Messages
{
    /* Create a class User, which has a Username (string), and ReceivedMessages (Collection of Messages). 
    Create a class Message, which has a Content (string) and a Sender (User).
    You will have to store a messaging history for every user. The input consists of 2 commands:
        “register {username}”
        “{senderUsername} send {recipientUsername} {content}”
    The register command, registers a user with the given username. The send command, sends a message, from the given sender,
    to the given recipient, with the given content. That means that you must add the message to the recipient’s ReceivedMessages.
    If even one of the given names does NOT exist, ignore the command. When you receive the command “exit” you must end the input
    sequence. After that you will receive 2 usernames, separated by a space. You must print all messages, sent, between the two users,
    corresponding to the given usernames. The messages should be printed in a specified way. You should print first a message SENT
    from the first user, then a message SENT from the second user, then a message from the first user, and so on. If one of the collections
    of messages has more elements than the other, just print the remaining elements from it. The first user’s messages must be printed in the following way:
        “{firstUser}: {content}”
    The second user’s message must be printed in the following way:
        “{content} :{secondUser}”
    When you print the whole output, it should look like this:
        {firstUser}: {content1}
        {content1} :{secondUser}
        {firstUser}: {content2}
        {content2} :{secondUser}
        . . . 
        In case there are NO messages between the two users, print “No messages”. */
    class Program
    {
        static void Main(string[] args)
        {
            var inputCommands = Console.ReadLine();
            var users = new List<string>();
            var messageHistory = new Dictionary<string, Message>();

            while (inputCommands != "exit")
            {
                var tokens = inputCommands.Split(' ');

                if (tokens[0] == "register")
                {
                    users.Add(tokens[1]);
                }
                else
                {
                    var sender = tokens[0];
                    var recipient = tokens[2];
                    var content = tokens[3];
                    var currentUser = new User();
                    var currentMessage = new Message();

                    if (users.Contains(sender) && users.Contains(recipient))
                    {
                        if (!messageHistory.ContainsKey(sender))
                        {
                            currentMessage.Sender = sender;
                            currentMessage.Content = new List<string>();
                            messageHistory.Add(currentMessage.Sender, currentMessage);
                        }

                        if (!messageHistory.ContainsKey(recipient))
                        {
                            var newMessage = new Message
                            {
                                Sender = recipient,
                                Content = new List<string>()
                            };

                            messageHistory.Add(newMessage.Sender, newMessage);
                        }

                        messageHistory[sender].Content.Add(content);
                    }
                }

                inputCommands = Console.ReadLine();
            }
            //
            var newInput = Console.ReadLine().Split(' ');
            var firstUser = newInput[0];
            var secondUser = newInput[1];
            var hasMessages = false;

            if (messageHistory.ContainsKey(firstUser) && messageHistory.ContainsKey(secondUser))
            {
                var max = Math.Max(messageHistory[firstUser].Content.Count, messageHistory[secondUser].Content.Count);
                var firstCount = messageHistory[firstUser].Content.Count;
                var secondCount = messageHistory[secondUser].Content.Count;

                for (int i = 0; i < max; i++)
                {
                    if (messageHistory.ContainsKey(firstUser) && firstCount > 0)
                    {
                        Console.WriteLine($"{messageHistory[firstUser].Sender}: {messageHistory[firstUser].Content[i]}");
                        hasMessages = true;
                    }
                    if (messageHistory.ContainsKey(secondUser) && secondCount > 0)
                    {
                        Console.WriteLine($"{messageHistory[secondUser].Content[i]} :{messageHistory[secondUser].Sender}");
                        hasMessages = true;
                    }

                    firstCount--;
                    secondCount--;
                }
            }
            if (!hasMessages)
            {
                Console.WriteLine("No messages");
            } //
        }
    }

    class User
    {
        public string Username { get; set; }
        public List<string> ReceivedMessages { get; set; }
    }

    class Message
    {
        public List<string> Content { get; set; }
        public string Sender { get; set; }
    }
}
