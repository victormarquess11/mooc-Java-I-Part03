
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            input = scanner.nextLine();
            String[] arrayStrings = input.split(" ");
            System.out.println(arrayStrings[0]);
        } while (!input.equals(""));

    }
}
