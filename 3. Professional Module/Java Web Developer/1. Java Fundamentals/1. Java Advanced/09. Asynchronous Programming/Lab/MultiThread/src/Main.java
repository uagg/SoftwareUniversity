/*
Create a task that prints the numbers from 1 to 10. Start 5 threads executing the same task.
After each printing, add Thread.yield() statement. Join all threads.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.print(i + " ");
                Thread.yield();
            }
        };

        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
