/*
Write a program that traverses a folder and calculates its size in bytes.
 */
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("path");

        System.out.println(folderSize(file));
    }

    public static long folderSize(File directory) {
        long length = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile())
                length += file.length();
            else
                length += folderSize(file);
        }
        return length;
    }
}
