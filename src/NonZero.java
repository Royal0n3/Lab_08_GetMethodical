import java.util.Scanner;

public class NonZero {/**
 * Prompts the user for a non-empty String
 *
 * @param pipe   a Scanner object opened to read from System.in
 * @param prompt the prompt to display for the input
 * @return a non-empty String response
 */
public static String getNonZeroLenString(Scanner pipe, String prompt) {
    String retString;
    do {
        System.out.print(prompt + ": ");
        retString = pipe.nextLine().trim();
    } while (retString.isEmpty());
    return retString;
}
}
