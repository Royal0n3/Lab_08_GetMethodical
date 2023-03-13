import java.util.Scanner;

public class GetRangedDouble {  public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
    double input = 0.0;
    boolean valid = false;
    String rangePrompt = prompt + " [" + low + "-" + high + "]: ";

    while (!valid) {
        System.out.print(rangePrompt);
        if (pipe.hasNextDouble()) {
            input = pipe.nextDouble();
            if (input >= low && input <= high) {
                valid = true;
            } else {
                System.out.println("Error: Input out of range [" + low + "-" + high + "]");
            }
        } else {
            System.out.println("Error: Input is not a valid number.");
            pipe.next(); // clear invalid input
        }
    }
    pipe.nextLine(); // clear newline
    return input;
}
}
