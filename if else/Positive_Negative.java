package Positive_Negative;

import java.util.Scanner;

class java {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int x;
        System.out.println("Enter the number");
        x = ob.nextInt();
        if (x > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

}
