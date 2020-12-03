package javaprograms;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        int num_1, num_2;
        int result;
        System.out.println("Enter any two numbers");

        num_1 = ob.nextInt();
        num_2 = ob.nextInt();
        result = num_1 + num_2;

        System.out.println("Addition is :" + result);
    }

}
