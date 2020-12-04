package armstrong;

import java.util.Scanner;


public class java {

    public static void main(String[] args) {
        int num_1, num_2, num_3 = 0, num, arm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three digit number : ");
        num = sc.nextInt();
        num_1 = num % 10;
        num_2 = num / 10;
        num_2 = num_2 % 10;
        num_3 = num / 100;

        arm = (num_1 * num_1 * num_1) + (num_2 * num_2 * num_2) + (num_3 * num_3 * num_3);

        if (arm == num) {
            System.out.println("This is a Armstrong Number.");
        } else {
            System.out.println("This is not a Armstrong Number.");
        }

    }
}
