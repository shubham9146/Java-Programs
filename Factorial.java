package javaprograms;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        int i, num, result = 1;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number");
        num = ob.nextInt();
        i = 1;
        while (i <= num) {
            result = result * i;
            i++;
        }
        System.out.println(result);
    }

}
