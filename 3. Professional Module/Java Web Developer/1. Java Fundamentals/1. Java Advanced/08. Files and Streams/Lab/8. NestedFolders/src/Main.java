/*
You are provided a folder named "Files-and-Streams". Create a program that lists the names of all directories in it
(including all nested directories).
On the last line, print the count of all folders, including the root folder.
Submit in Judge only the output of the program.
 */
import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\Files-and-Streams";
        File root = new File(path);

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);

        int count = 0;

        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            System.out.println(current.getName());
            count++;

            for (File dir : current.listFiles()) {
                if (dir.isDirectory()) {
                    dirs.offer(dir);
                }
            }
        }
    }
}