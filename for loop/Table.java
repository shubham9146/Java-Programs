package javaprograms;

import java.util.Scanner;

public class for_loop {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int i, a, b;
        System.out.println("Enter number");
        a = ob.nextInt();
        for (i = 1; i <= 10; i++) {

            b = a * i;
            System.out.println(b);
        }
    }
}
