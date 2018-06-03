/*
Create a task that prints the numbers from 1 to 10. Start a thread executing the task.
Optional: Add System.exit(1) at the end of your program.
Optional: Experiment with thread.join()
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.print(i + " ");
            }
        };

        Thread thread = new Thread(task);

        thread.start();
        thread.join();
        System.exit(1);
    }
}
