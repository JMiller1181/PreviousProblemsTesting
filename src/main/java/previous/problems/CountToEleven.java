package previous.problems;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 11.");
        int num = scanner.nextInt();
        System.out.println(countToEleven(num));
    }
    public static String countToEleven(int x){
        String count = "";
        for (int i = x; i <= 11; i++){
            count += i + " ";
        }
        return count;
    }
}
