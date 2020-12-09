class Test_2 {

    int i;
    static int j;

    Test_2() {
        i++;
        j++;
    }

    void show() {
        System.out.println(i);
        System.out.println(j);
    }

}

public class static_var {

    public static void main(String[] args) {
        Test_2 t1 = new Test_2();
        Test_2 t2 = new Test_2();
        Test_2 t3 = new Test_2();
        t1.show();
        t2.show();
        t3.show();
    }
}
