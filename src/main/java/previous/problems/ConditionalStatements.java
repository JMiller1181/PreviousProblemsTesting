package previous.problems;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String first = scanner.nextLine();
        System.out.println("Enter another word: ");
        String second = scanner.nextLine();
        sameOrNot(first, second);
    }
    public static boolean sameOrNot(String first, String second){
        if( first.equalsIgnoreCase(second)) {
            System.out.println("The words are the same.");
            return true;
        } else {
            System.out.println("The words are not the same.");
            return false;
        }
    }
}
