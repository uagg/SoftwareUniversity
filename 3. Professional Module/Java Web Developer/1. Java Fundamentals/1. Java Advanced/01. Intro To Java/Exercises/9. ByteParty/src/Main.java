/*
You will be given an integer number N and on each of the next N lines - a positive  8-bit integer. On the next lines
you will be given a series of commands, one of the following:
•	"-1 [position]" – Upon receiving this command you should flip the bits at the specified position in all numbers
you received. Flipping a bit means turning its value from 1 to 0 or the other way around.
•	"0 [position]" – upon receiving this command you should unset the bits at the specified position for all numbers,
i.e. turn all bits to 0 regardless of their current value.
•	"1 [position]" – upon receiving this command you should set the bits at the specified position for all numbers,
i.e. turn all bits to 1 regardless of their current value.
•	"party over" – when you receive this command print back the numbers after all changes have been made; each number
stays on a separate line.
Input
•	The input data should be read from the console.
•	The first input line holds the number N – the count of integers you'll receive.
•	On each of the next N lines you'll receive a positive 8-bit integer number. Input ends with the string "party over".
•	The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
•	You should print N lines, each containing a number – the numbers after all manipulations.
Constraints
•	All input numbers are in the range [0 … 255].
•	[position] will be between [0 … 7].
•	Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Byte> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            byte number = input.nextByte();
            result.add(number);
        }

        Scanner input2 = new Scanner(System.in);
        String commandString = input2.nextLine();
        String[] command = commandString.split(" ");

        while (!command[0].equals("party") && !command[1].equals("over")) {
            if (command[0].equals("-1")) {
                int position = Integer.parseInt(command[1]);
                for (int i = 0; i < result.size(); i++) {
                    byte num = result.get(i);
                    int mask = num >> position;
                    int bit = mask & 1;
                    if (bit == 1) {
                        int mask2 = ~(1 << position);
                        byte changedNum = (byte) (num & mask2);
                        //System.out.printf("%010d\n", Integer.parseInt(Integer.toBinaryString(changedNum)));
                        result.set(i, changedNum);
                    } else if (bit == 0) {
                        int mask2 = 1 << position;
                        byte changedNum = (byte) (num | mask2);
                        //System.out.printf("%010d\n", Integer.parseInt(Integer.toBinaryString(changedNum)));
                        result.set(i, changedNum);
                    }
                }
            } else if (command[0].equals("0")) {
                int position = Integer.parseInt(command[1]);
                for (int i = 0; i < result.size(); i++) {
                    byte num = result.get(i);
                    int mask = ~(1 << position);
                    byte changedNum = (byte) (num & mask);
                    //System.out.printf("%010d\n", Integer.parseInt(Integer.toBinaryString(changedNum)));
                    result.set(i, changedNum);
                }
            } else if (command[0].equals("1")) {
                int position = Integer.parseInt(command[1]);
                for (int i = 0; i < result.size(); i++) {
                    byte num = result.get(i);
                    int mask = (1 << position);
                    byte changedNum = (byte) (num | mask);
                    //System.out.printf("%010d\n", Integer.parseInt(Integer.toBinaryString(changedNum)));
                    result.set(i, changedNum);
                }
            }

            commandString = input2.nextLine();
            command = commandString.split(" ");
        }

        for (byte entry : result) {
            System.out.println(entry);
        }
    }
}
