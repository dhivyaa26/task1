package task1;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int numA = obj.nextInt();
        int revA = 0;
        System.out.print("Input : ");
        System.out.print(numA);
        while (numA != 0){
            int remainder = numA % 10;
            revA = revA*10 + remainder;
            numA = numA/10;
        }
        System.out.println();
        System.out.print("Output: ");
        System.out.print(revA);
    }
}
