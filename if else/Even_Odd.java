
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        int x;
        System.out.println("Enter the number");
        x = ob.nextInt();
        if (x % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
