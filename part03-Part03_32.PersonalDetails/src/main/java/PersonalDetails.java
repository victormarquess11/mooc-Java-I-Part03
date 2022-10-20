
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input, longestName;
        int sumBirthYears=0, counterPersons = 0;

        input = scanner.nextLine();
        longestName = input.split(",")[0];
        sumBirthYears += Integer.valueOf(input.split(",")[1]);
        counterPersons += 1;

        while (true){
            input = scanner.nextLine();
            if(input.equals(""))
                break;
                
            String[] splitInput = input.split(",");

            if (splitInput[0].length() > longestName.length()) {
                longestName = splitInput[0];
            }

            sumBirthYears += Integer.valueOf(splitInput[1]);
            counterPersons += 1;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double)sumBirthYears/counterPersons);

    }
}
