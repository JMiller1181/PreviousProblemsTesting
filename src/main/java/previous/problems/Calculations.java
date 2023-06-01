package previous.problems;

public class Calculations {
    public static void main(String[] args){
        System.out.println(calculations(4,5));
    }
    public static String calculations(int a, int b){
        return a + " + " + b + " = " + (a+b) + "\n" +
                a + " - " + b + " = " + (a-b) + "\n" +
                a + " * " + b + " = " + (a*b) + "\n" +
                a + " / " + b + " = " + (Double.valueOf(a)/Double.valueOf(b)) + "\n" +
                a + " % " + b + " = " + (a%b);
    }
}
