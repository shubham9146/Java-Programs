package javaexamples;

class Test_6 {

    void add(int x, int y) {
        System.out.println(x + y);
    }
}

public class passby_value {

    public static void main(String[] args) {
        int a, b;
        a = 100;
        b = 200;
        Test_6 t1 = new Test_6();
        t1.add(a, b);
    }

}
