/*
An interval is represented as a combination of start time and end time. Given a set of n intervals, check if any two
intervals overlap.
On the first line you will get the number of packets n. On the next  line you will get each interval.
Its start and end time will be separated by a comma.
Print “true” if any two intervals overlap, otherwise print “false”.
 */
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer n = Integer.parseInt(scan.nextLine());

        TreeMap<Integer, Integer> tm = new TreeMap<>();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            String[] start = scan.nextLine().split(",");
            Integer key = Integer.parseInt(start[0]);
            Integer value = Integer.parseInt(start[1]);

            tm.put(key, value);
        }

        for (int i = 0; i < tm.size() - 1; i++) {

            Integer curentKey = (Integer) tm.keySet().toArray()[i];
            Integer currentValue = tm.get(curentKey);
            Integer nextKey = (Integer) tm.keySet().toArray()[i + 1];

            if (curentKey <= nextKey && nextKey <= currentValue) {
                found = true;
                break;
            }
        }
        System.out.print(found);
    }
}