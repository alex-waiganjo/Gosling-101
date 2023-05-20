// Using Case Statements
public class Day {
    public static void main(String[] args) {
        // int day = 2;

        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday"); /*Output*/
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        // }

        // No Break Points
        int x = 2;
        switch (x) {
            case 1:
                System.out.println(x = 2);
            case 2:
                System.out.println(x = 3);
            case 3:
                System.out.println(x = 4);
        }

        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            default:
                System.out.println("Another day"); //Output
        }

    }

}
