class Test {

    int i;
    static int j;

    Test() {
        i++;
        j++;
    }

    static void disp() {
        System.out.println("Hello");
    }

    static void show() {
        System.out.println(j);
        disp();
    }
}

public class static_meth {

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test.show();
    }
