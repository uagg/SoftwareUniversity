/*
Write a program that makes a copy of a .jpg file using FileInputStream, FileOutputStream, and byte[] buffer.
Set the name of the new file as picture-copy.jpg.
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inPath = "source";
        String outPath = "final destination";

        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(new File(inPath));
            os = new FileOutputStream(new File(outPath));
            byte[] buffer = new byte[1024];
            int length;

            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            is.close();
            os.close();
        }
    }
}
