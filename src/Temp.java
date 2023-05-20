import java.util.Scanner;

// Sololearn  Conditionals Tutorials
public class Temp {
    public static void main(String[] args) {
        // your code goes here
        double temp = new Scanner(System.in).nextDouble();
        if (temp >= 100) {
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
        }

        // Fill in the blanks to create a program that checks the temp value and outputs
        // "Alert", in case it's over 38. Also, output "Error" in case the value is
        // lower than 34.
        double tempe = 36.6;
        if (tempe > 38) {
            System.out.println("Alert");
        } else if (tempe < 34) {
            System.out.println("Error");
        } else {
            System.out.println("OK");
        }

        // Days Program
        int day = 2;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        }

    }
}
