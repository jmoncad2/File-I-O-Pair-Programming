import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class mainTest {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String directory = "data";
        String filename = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)){
            Files.createDirectories(dataDirectory);
        }
        if (! Files.exists(dataFile)){
            Files.createFile(dataFile);
        }


    }
}
