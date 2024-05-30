package task1;

import java.util.Scanner;

public class Smallestof3 {
    public static void main(String[] args) {
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        int userInput1 = obj.nextInt();
        int userInput2 = obj.nextInt();
        int userInput3 = obj.nextInt();
        if(userInput1<userInput2){
            if(userInput1<userInput3){
                System.out.println(userInput1);
            }else {
                System.out.println(userInput3);
            } }
        else if (userInput2<userInput1){
            if (userInput2<userInput3){
                System.out.println(userInput2);
            }else {
                System.out.println(userInput3);
            }

        }
    }


}
