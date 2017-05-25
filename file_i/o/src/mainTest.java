import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class mainTest {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ArrayList<String> phones = new ArrayList<>();


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
        displayMenu();
        switch (options(input)){
            case 1:
                List<String> lines = Files.readAllLines(dataFile);
                for(String line : lines){
                    System.out.println(line);
                }
                break;
            case 2:
                    // what's the name
                // enter the number
                // contacts.add( name + "|" + number)
                System.out.println("What is the name of the contact?");
                String contactName = input.next();
                System.out.println("What is the contact number?");
                String contactNumber = input.next();
                phones.add((contactName + " | " + contactNumber));
                Files.write(dataFile, phones, StandardOpenOption.APPEND);
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                // write the contacts array to the file
                System.out.println("Good Bye :)");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Option; Please Choose Another");
        }
    }

    public static void displayMenu(){
        System.out.println("+*+*+*+*+*PLEASE CHOOSE AN OPTION+*+*+*+*+*");
        System.out.println("1) View contacts");
        System.out.println("2) Add a new contact");
        System.out.println("3) Search a contact by name");
        System.out.println("4) Delete an existing contact");
        System.out.println("5) Exit");
    }

    public static int options(Scanner input){
        int option = input.nextInt();
        return option;
    }

//    public static String entry(Scanner input){
//        String name = input.nextLine();
//        input.nextLine();
//        return name;
//    }





}
