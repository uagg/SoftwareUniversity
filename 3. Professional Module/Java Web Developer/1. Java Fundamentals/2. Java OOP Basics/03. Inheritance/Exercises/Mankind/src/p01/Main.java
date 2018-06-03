package p01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] line1 = reader.readLine().split("\\s+");
            String firstname = line1[0];
            String lastName = line1[1];
            String facNum = line1[2];


            Student student = new Student(firstname,lastName,facNum);
            System.out.println(student);

            String[] line2 = reader.readLine().split("\\s+");
            String fName = line2[0];
            String lName = line2[1];
            Double salary = Double.parseDouble(line2[2]);
            Double hoursPerDay = Double.parseDouble(line2[3]);

            Worker worker = new Worker(fName,lName,salary,hoursPerDay);
            System.out.println(worker);



        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}

//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String[] line1 = reader.readLine().split("\\s+");
//            String firstname = line1[0];
//            String lastName = line1[1];
//            String facNum = line1[2];
//
//
//            Student student = new Student(firstname,lastName,facNum);
//            System.out.println(student);
//
//            String[] line2 = reader.readLine().split("\\s+");
//            String fName = line2[0];
//            String lName = line2[1];
//            Double salary = Double.parseDouble(line2[2]);
//            Double hoursPerDay = Double.parseDouble(line2[3]);
//
//            Worker worker = new Worker(fName,lName,salary,hoursPerDay);
//            System.out.println(worker);
//
//
//
//        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}
