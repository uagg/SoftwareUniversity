/*
Write a program to calculate points for all players and find who the winner is. You will be given the count of the
players, their names and initial scores. Score for every player depends on their name. To the player score add or
subtract the ASCII code of each letter. If ASCII code is even, add it to the score. If is odd – subtract it from the score.
Find the one with highest score and print his name and score on the console. If two or more players are with same
points – the winner is the first one.
Input
On the first input line, you will be given number N - the count of players.
On the next 2*N lines you will be given player name and his initial score.
Output
The output should be printed on the console and consists of the name of the winner and his score in the following format:
“The winner is {name} - {points} points”
Constraints
•	N – the count of players will be a positive integer in the range [1...100]
•	Names will be strings with length between 3 and 30
•	The score for each player will be an integer in the range [-100,000...100,000]
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int n = input.nextInt();
        List<String> listOfNames = new ArrayList<String>();
        List<Integer> listOfPoints = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            String player = input2.nextLine();
            char[] nameCharArray = player.toCharArray();
            int points = input.nextInt();
            int pointsSum = points;

            for (char ch : nameCharArray) {
                if (Character.valueOf(ch) % 2 != 0) {
                    pointsSum -= Character.valueOf(ch);
                } else if (Character.valueOf(ch) % 2 == 0) {
                    pointsSum += Character.valueOf(ch);
                }
            }

            listOfNames.add(player);
            listOfPoints.add(pointsSum);
        }

        int maxPoints = Integer.MIN_VALUE;
        int index = 0;
        String champName = null;

        for (int i = 0; i < listOfPoints.size(); i++) {
            if (listOfPoints.get(i) > maxPoints) {
                maxPoints = listOfPoints.get(i);
                index = i;
            }
        }

        for (int i = index; i < listOfNames.size();) {
            champName = listOfNames.get(i);
            i = listOfNames.size();
        }

        System.out.printf("The winner is %s - %d", champName, maxPoints);
    }
}
