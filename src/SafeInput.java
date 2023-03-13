import java.util.Scanner;

public class SafeInput {


    /**
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

    /**
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

    /**
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

    /**
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
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
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

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
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

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
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


