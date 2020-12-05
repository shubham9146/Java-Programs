package javaprograms;

public class Pattern {

    public static void main(String[] args) {
        int a = 1, i, j;
        for (i = 0; i < 10; i++) {
            a = 1;
            for (j = 0; j <= i; j++) {

                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
