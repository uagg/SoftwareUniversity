/*
You are provided a folder named "Files-and-Streams". Create a program that lists the names and file sizes (in bytes) of
all files that are placed directly in it (do not include files in nested folders).
Submit in Judge only the output of the program.
*/
import java.io.File;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Files-and-Streams");
        File[] folder = file.listFiles();
        Stream.of(folder).filter(File::exists)
                .filter(f -> !f.isDirectory())
                .forEach(f -> System.out.printf("%s: %s%n",
                        f.toString().substring(f.toString().lastIndexOf("\\")).replace("\\", ""),
                        f.length()
                ));
    }
}