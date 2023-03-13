import java.util.Scanner;

public class GetRangedInt { /**
 * Prompts the user for an integer within a specified inclusive range
 *
 * @param pipe   a Scanner object opened to read from System.in
 * @param prompt the prompt to display for the input
 * @param low    the lower bound of the range (inclusive)
 * @param high   the upper bound of the range (inclusive)
 * @return an integer value within the specified range
 */
public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
    int retInt;
    while (true) {
        System.out.print(prompt + " (" + low + "-" + high + "): ");
        if (pipe.hasNextInt()) {
            retInt = pipe.nextInt();
            if (retInt >= low && retInt <= high) {
                pipe.nextLine(); // clear the newline character from input
                return retInt;
            } else {
                System.out.println("Error: Input must be within range " + low + "-" + high + ".");
            }
        } else {
            pipe.nextLine(); // clear the input
        }
}
