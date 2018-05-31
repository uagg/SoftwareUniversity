/*
Напишете програма, която отпечатва числата в диапазона [1…1000], които завършват на 7.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 7; i <= 1000; i += 10) {
            System.out.println(i);
        }
    }
}