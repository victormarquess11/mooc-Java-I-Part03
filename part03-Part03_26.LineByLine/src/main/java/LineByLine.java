
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();

        while ( !input.equals("") ) {
            String[] arrayStrings = input.split(" ");
            for (String string : arrayStrings) {
                System.out.println(string);
            }
            input = scanner.nextLine();
        }

    }
}
