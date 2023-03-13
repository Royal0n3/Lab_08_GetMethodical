import java.util.Scanner;

public class GetDouble { /**
 * Prompts the user for a double input
 *
 * @param pipe   a Scanner object opened to read from System.in
 * @param prompt the prompt to display for the input
 * @return a double value
 */
public static double getDouble(Scanner pipe, String prompt) {
    double retDouble;
    while (true) {
        System.out.print(prompt + ": ");
        if (pipe.hasNextDouble()) {
            retDouble = pipe.nextDouble();
            pipe.nextLine(); // clear the newline character from input
            return retDouble;
        } else {
            pipe.nextLine(); // clear the input
        }
    }
}
