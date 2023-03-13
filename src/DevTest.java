import java.util.Scanner;



public class DevTest {
    public static void main(String[] msg){
        final int CHAR_COUNT = 60;
        final String BORDER = "***";
        int totalSpaces = CHAR_COUNT - 2 * BORDER.length() - msg.length;

        // Calculate the number of spaces to the left and right of the message
        int leftSpaces, rightSpaces;
        if (totalSpaces % 2 == 0) {
            leftSpaces = rightSpaces = totalSpaces / 2;
        } else {
            rightSpaces = totalSpaces / 2;
            leftSpaces = rightSpaces + 1;
        }

        // Print the top border
        for (int i = 0; i < CHAR_COUNT; i++) {
            System.out.print(BORDER);
        }
        System.out.println();

        // Print the message with padding
        System.out.print(BORDER);
        for (int i = 0; i < leftSpaces; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < rightSpaces; i++) {
            System.out.print(" ");
        }
        System.out.println(BORDER);

        // Print the bottom border
        for (int i = 0; i < CHAR_COUNT; i++) {
            System.out.print(BORDER);
        }
        System.out.println();
    }
}