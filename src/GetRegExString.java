import java.util.Scanner;

public class GetRegExString {public static String getRegExString(Scanner pipe, String prompt, String regEx) {
    String input = "";
    boolean valid = false;

    while (!valid) {
        System.out.print(prompt + ": ");
        if (pipe.hasNext(regEx)) {
            input = pipe.next(regEx);
            valid = true;
        } else {
            System.out.println("Error: Input does not match the required format.");
            pipe.nextLine(); // clear invalid input
        }
    }
    return input;
}}



}
