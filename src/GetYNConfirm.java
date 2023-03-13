import java.util.Scanner;

public class GetYNConfirm {    public static boolean getYNConfirm(Scanner pipe, String prompt) {
    boolean valid = false;
    boolean input = false;

    while (!valid) {
        System.out.print(prompt + " [Y/N]: ");
        String response = pipe.nextLine().toLowerCase();

        if (response.equals("y")) {
            input = true;
            valid = true;
        } else if (response.equals("n")) {
            input = false;
            valid = true;
        } else {
            System.out.println("Error: Invalid response. Please enter Y or N.");
        }
    }

    return input;
}
