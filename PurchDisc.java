package task1;

import java.util.Scanner;

public class PurchDisc {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int Amt = obj.nextInt();
        System.out.print("Purchase amount is ");
        System.out.print(Amt);
        if(Amt<=500) {
            System.out.println();
            System.out.print("No Discount, The final payable is ");
            System.out.print(Amt);
        }else if(Amt > 500 && Amt <= 1000) {
            System.out.println();
            System.out.print("10% Discount, The final payable is ");
            System.out.print(Amt-Amt*.1);
        }
        else if (Amt>1000){
            System.out.println();
            System.out.print("20% Discount, The final payable is ");
            System.out.print(Amt-Amt*.2);
        }
    }
}
