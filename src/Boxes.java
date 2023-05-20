import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {
        /*
         * You are making a robot that should categorize items by their color.
         * Each color corresponds to a box with a specific number.
         * Your program needs to take a color as input and output the corresponding box
         * number.
         */

        try (Scanner take = new Scanner(System.in)) {
            String color = take.nextLine();
            switch (color) {
                case "green":
                    System.out.println("2");
                    break;
                case "red":
                    System.out.println("1");
                    break;

                case "black":
                    System.out.println("3");
                    break;
            }
        }

    }
}
