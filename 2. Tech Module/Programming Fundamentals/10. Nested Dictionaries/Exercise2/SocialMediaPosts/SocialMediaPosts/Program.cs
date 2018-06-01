using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SocialMediaPosts
{
    /* You have been tasked to create a Console Social Media Database. You will receive several input lines in one of the following formats:
•	post {postName}
•	like {postName}
•	dislike {postName}
•	comment {postName} {commentatorName} {content}
    If you receive the post command, you must create a post with the given name.
    If you receive the like command you must add a like to the given post.
    If you receive the dislike command you must add a dislike to the given post.
    If you receive the comment command, you must add a comment to the given post. The comment’s writer must be the given commentator name,
    and the content of the comment must be the given content. By default the posts have 0 likes, 0 dislikes and 0 comments, when created.
    When you receive the command “drop the media” you must end the input sequence, and you must print every post with its likes,
    disliked and comments in the following format: Post: {postName} | Likes: {likes} | Dislikes {dislikes}
    Comments:
*  {commentator1}: {comment1}
*  {commentator2}: {comment2}
    . . .  
    If a certain post does NOT have ANY comments, you should just print “None”.
    The comments have a prefix of a single asterisk (‘*’) and 2 spaces.
    There is NO space between the commentator’s name and the colon. */
    class Program
    {
        static void Main(string[] args)
        {            
            var socialMedia = new Dictionary<string, Dictionary<string, List<string>>>();
            var input = Console.ReadLine();

            while (input != "drop the media")
            {
                var tokens = input.Split(' ');
                var command = tokens[0];
                var postName = tokens[1];

                if (!socialMedia.ContainsKey(postName))
                {
                    socialMedia[postName] = new Dictionary<string, List<string>>();
                }

                switch (command)
                {
                    case "like":
                        if (!socialMedia[postName].ContainsKey("Like"))
                        {
                            socialMedia[postName]["Like"] = new List<string>();
                        }
                        socialMedia[postName]["Like"].Add(command);
                        break;
                    case "dislike":
                        if (!socialMedia[postName].ContainsKey("Dislike"))
                        {
                            socialMedia[postName]["Dislike"] = new List<string>();
                        }
                        socialMedia[postName]["Dislike"].Add(command);
                        break;
                    case "comment":
                        var author = tokens[2];
                        var length = command.Length + postName.Length + author.Length + 3;
                        var comment = input.Substring(length);

                        if (!socialMedia[postName].ContainsKey(author))
                        {
                            socialMedia[postName][author] = new List<string>();
                        }
                        socialMedia[postName][author].Add(comment);
                        break;
                }

                input = Console.ReadLine();
            }
            foreach (var post in socialMedia)
            {
                var likes = 0;
                var dislikes = 0;
                var authors = post.Value;

                foreach (var author in authors)
                {
                    if (author.Key == "Like")
                    {
                        likes = author.Value.Count;
                    }
                    if (author.Key == "Dislike")
                    {
                        dislikes = author.Value.Count;
                    }
                }
                Console.WriteLine($"Post: {post.Key} | Likes: {likes} | Dislikes: {dislikes}");
                Console.WriteLine("Comments:");

                var hasComment = true;

                foreach (var comment in authors)
                {
                    if (comment.Key != "Like" && comment.Key != "Dislike")
                    {
                        hasComment = false;
                        foreach (var currentComment in comment.Value)
                        {
                            Console.WriteLine($"*  {comment.Key}: {currentComment}");
                        }
                    }
                }
                if (hasComment)
                {
                    Console.WriteLine("None");
                }
            }
        }
    }
}
