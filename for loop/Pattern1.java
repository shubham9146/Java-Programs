package javaprograms;

public class Pattern1 {

    public static void main(String[] args) {
        int i, j;
        for (i = 10; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("  ");
        }

    }
}
