import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern2 {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        //System.out.print("Enter your name: ");

        // Read in line from standard input
        //String name = in.nextLine();

        //System.out.println("Hi " + name + "!");


       int size;

        // Input validation loop
        while (true) {
            System.out.print("Enter the size: ");
            size = in.nextInt();

            if (size < 1) {
                System.out.println("too small!");
            } else if (size > 5) {
                System.out.println("too big!");
            } else {
                break;
            }
        }

        int totalRows = 2 * size;

        for (int row = 0; row < totalRows; row++) {
            int offset = Math.min(row, totalRows - 1 - row);

            for (int i = 1 + offset; i <= size + offset; i++) {
                System.out.print(i);
            }

            for (int i = size + offset; i >= 1 + offset; i--) {
                System.out.print(i);
            }


            System.out.println();
        }
    } 
}