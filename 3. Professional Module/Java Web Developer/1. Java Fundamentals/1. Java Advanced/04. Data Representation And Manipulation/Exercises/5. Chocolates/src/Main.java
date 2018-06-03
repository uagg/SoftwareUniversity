/*
You are given an array of n integers where each value represents number of chocolates in a packet.
Each packet can have variable number of chocolates. There are m students. Your task is to distribute chocolate packets
such that:
1.	Each student gets one packet.
2.	The difference between the number of chocolates in packet with maximum chocolates and packet with minimum
chocolates given to the students is minimum.
On the first line you will get the number of packets n. On the next line you will get all packets, separated by a space
and a comma. On the last line you will get the number of students  m.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer barSize = Integer.parseInt(scan.nextLine());

        List<Integer> list = new ArrayList<>();
        String[] input = scan.nextLine().split(", ");

        for (String anInput : input) {
            list.add(Integer.parseInt(anInput));
        }

        Integer minStudents = Integer.parseInt(scan.nextLine());
        Collections.sort(list);

        Integer min = 0;
        Integer max = 0;

        Integer MinDiffernce = Integer.MAX_VALUE;

        for (int i = 0; i < barSize; i++) {

            if (i + minStudents - 1 < list.size()) {
                min = list.get(i);
                max = list.get(i + minStudents - 1);

                if (max - min < MinDiffernce) {
                    MinDiffernce = max - min;
                }
            }
        }
        System.out.printf("Min Difference is %s.", MinDiffernce);
    }
}