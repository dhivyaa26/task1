package task1;
import java.util.Scanner;

public class NegRpos {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int A = obj.nextInt();
        if (A<0) {
            System.out.println("The number is negative");
        } else if (A>0) {
            System.out.println("The number is positive");
        } else if (A==0) {
            System.out.println("It is a zero");
        }
    }
}
