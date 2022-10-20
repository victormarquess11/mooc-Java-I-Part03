
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while ( ! input.equals("") ) {
            String[] arraySplitString = input.split(" ");
            
            for (int i = 0; i < arraySplitString.length; i++) {
                if (arraySplitString[i].contains("av")){
                    System.out.println(arraySplitString[i]);
                }
            }
            input = scanner.nextLine();
        }


    }
}
