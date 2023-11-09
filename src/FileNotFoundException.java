//Java program to demonstrate FileNotFoundException
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileNotFoundExceptionDemo {
    public static void main(String args[]) throws IOException {
        FileReader readFile = null;
        try {
            // Following file does not exist
            File file = new File("E://file.txt");
            readFile = new FileReader(file);

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist : "+e.getMessage());
        } finally {
            System.out.println("finally block executed");
            readFile.close();
        }
    }
}
