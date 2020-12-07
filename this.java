package javaexamples;

class Test_1 {

    int i;

    Test_1(int i) {
        this.i = i;
    }

    void show() {
        System.out.println(i);
    }
}

public class this_keyword {

    public static void main(String[] args) {
        Test_1 t1 = new Test_1(10);
        t1.show();

    }
}
