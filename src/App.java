import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

            // User Input
            System.out.println("Your Programming Language of Interest:");
            String prog_lang = scanner.nextLine();

            // Output
            System.out.println(prog_lang + " Dev Loading...");          
        }              
    }
}


