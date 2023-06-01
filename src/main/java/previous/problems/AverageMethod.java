package previous.problems;

public class AverageMethod {
    public static void main(String[] args) {
        System.out.println("The average is: " + average(sum(1,3,4)));
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static double average(int tot){
        return (double) tot / 3;
    }
}