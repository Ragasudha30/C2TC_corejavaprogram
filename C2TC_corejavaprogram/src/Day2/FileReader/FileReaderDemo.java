package Day2.FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            // Locate the file 'k.txt' in the same package as this class
            URL resource = FileReaderDemo.class.getResource("Kin.txt");

            if (resource == null) {
                System.out.println("File not found!");
                return;
            }

            File file = new File(resource.getFile());
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close(); // It's good practice to close resources
        } catch (IOException e) {
            e.printStackTrace(); // Better error visibility
        }
    }
}
