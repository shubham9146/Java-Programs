class Test_5 {

    static int j;

    Test_5() {
        System.out.println("Constructor called");
        j++;
    }

    static void show() {
        System.out.println(j);
    }

    static {
        System.out.println("Static block called");
    }
}

public class Static_block {

    public static void main(String[] args) {
        Test_5 t1 = new Test_5();
        Test_5.show();
    }

}
