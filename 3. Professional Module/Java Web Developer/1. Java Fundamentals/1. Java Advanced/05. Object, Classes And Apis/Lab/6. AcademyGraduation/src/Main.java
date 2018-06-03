/*
Write a program that reads students with their names and scores for different courses. Afterwards print the average
score of every student in the following format:  “{Students name} is graduated with {average score)”
The order of the output does not matter.
 */
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<String, Double[]> graduationList = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numberOfStudents; i++) {
            String name = sc.nextLine();
            String[] scoresString = sc.nextLine().split(" ");
            Double[] scores = new Double[scoresString.length];

            for (int j = 0; j < scoresString.length; j++) {
                scores[j] = Double.parseDouble(scoresString[j]);
            }

            graduationList.put(name, scores);
        }

        for (String name : graduationList.keySet()) {
            double sumOfGrades = 0.0;
            int countOfGrades = 0;

            for (Double grade : graduationList.get(name)) {
                sumOfGrades += grade;
                countOfGrades++;
            }

            double result = sumOfGrades / countOfGrades;
            System.out.println(name + " is graduated with " + result);
        }
    }
}
