package task1;

public class PatternNum {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > 0; j--) {
                if (i == 5) {
                    System.out.print(i);
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}