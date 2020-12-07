class Test{

    private static int length;
    int i,j;
    Test(int x,int y){
        i = x;
        j = y;
        System.out.println("Constructor with arguments");
    }
    Test()
    {
        i = 10;
        j = 20;
        System.out.println("Constructor without arguments");
    }
    void add()
    {
        System.out.println(i + j);
    }
}
public class Constructor_over {
    public static void main(String[] args) {
        {
            Test t1 = new Test();
            Test t2 = new Test(30,40);
            t1.add();
            t2.add();
         }
    }
    
}
