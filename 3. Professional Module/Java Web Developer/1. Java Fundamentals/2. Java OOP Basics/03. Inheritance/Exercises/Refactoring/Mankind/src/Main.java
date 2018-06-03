import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static boolean isThrown = false;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = reader.readLine().split("\\s+");
        String[] input2 = reader.readLine().split("\\s+");
        int a = 5;
        chooseTypeOfHuman(input1);
        if(!isThrown) {
            chooseTypeOfHuman(input2);
        }
    }

    private static void chooseTypeOfHuman(String[] input) {
        switch (input.length) {
            case 3:
                String studentFirstName = input[0];
                String studentLastName = input[1];
                String fn = input[2];
                try {
                    Student student = new Student(studentFirstName, studentLastName, fn);
                    System.out.println(student.toString());
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                    isThrown = true;
                }
                break;
            case 4:
                String workerFirstName = input[0];
                String workerLastName = input[1];
                double salary = Double.parseDouble(input[2]);
                double wh = Double.parseDouble(input[3]);
                try {
                    Worker worker = new Worker(workerFirstName, workerLastName, salary, wh);
                    System.out.println(worker.toString());
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                    isThrown = true;
                }
                break;
        }
    }
}
