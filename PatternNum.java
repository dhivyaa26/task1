package task1;

public class PatternNum {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
                System.out.print(" ");
            }
            for(int k = 1; k < i; k++ ) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}