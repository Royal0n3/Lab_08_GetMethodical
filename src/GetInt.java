import java.util.Scanner;

public class GetInt { /**
 * Prompts the user for an integer input
 *
 * @param pipe   a Scanner object opened to read from System.in
 * @param prompt the prompt to display for the input
 * @return an integer value
 */

public static int getInt(Scanner pipe, String prompt) {
    int retInt;
    while (true) {
        System.out.print(prompt + ": ");
        if (pipe.hasNextInt()) {
            retInt = pipe.nextInt();
            pipe.nextLine(); // clear the newline character from input
            return retInt;
        } else {
            pipe.nextLine(); // clear the input
        }
    }
}
