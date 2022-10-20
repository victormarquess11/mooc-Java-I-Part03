
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            input = scanner.nextLine();
            String[] arrayStrings = input.split(" ");

            System.out.println(arrayStrings[arrayStrings.length-1]);

        } while (!input.equals(""));


    }
}
