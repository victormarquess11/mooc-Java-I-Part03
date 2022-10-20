
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input, nameOldest;
        int ageOldest;

        input = scanner.nextLine();
        nameOldest = input.split(",")[0];
        ageOldest = Integer.valueOf(input.split(",")[1]);

        while ( !input.equals("")) {

            String[] splitInput = input.split(",");

            if (ageOldest < Integer.valueOf(input.split(",")[1])) {
                nameOldest = input.split(",")[0];
                ageOldest = Integer.valueOf(input.split(",")[1]);
            }

            input = scanner.nextLine();
        }

        System.out.println("Age of oldest: " + ageOldest);

    }
}
