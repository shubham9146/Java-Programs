
import java.util.Scanner;

public class Digit_Addition {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int a, b, result;
        System.out.println("Enter any two digit number");
        a = ob.nextInt();
        b = a / 10;
        result = a % 10;
        a = b + result;
        System.out.println(a);
    }

}
