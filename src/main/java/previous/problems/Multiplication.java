package previous.problems;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 11.");
        int num = scanner.nextInt();
        System.out.println(multiplication(num));

    }
    public static String multiplication(int x){
        String tables = "";
        for (int i = 1; i < 11; i++){
            tables += x + " x " + i + " = " + (x * i) + "\n";
        }
        return tables;
    }
}
