
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> numbers = new ArrayList<>();
        int input = 0;
        int smallestNumber = 0, indexSmallest = 0;

        while (true) {
            input = Integer.valueOf(scanner.nextLine());

            if (input == 9999) {
                break;
            }

            numbers.add(input);
        }

        smallestNumber = numbers.get(0);
        
        for (int i = 1; i < numbers.size(); i++) {
            if ( numbers.get(i) < smallestNumber) {
                smallestNumber = numbers.get(i);
                indexSmallest = i;
            }
        }

        System.out.println("Smallest number: " + smallestNumber);
        System.out.println("Found at index: " + indexSmallest);



        
    }
}
