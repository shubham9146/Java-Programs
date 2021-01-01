
package javaprograms;

class A{
    void read(){
        System.out.println("Read from HDD");
    }
}
class B extends A{
    void read(){
        System.out.println("Read from USB");
    }
}
class C extends B{
    void read(){
        System.out.println("Read from DVD");
    }
}

public class dyanamic_method {
    public static void main(String[] args) {
        A ob_1 = new A();
        B ob_2 = new B();
        C ob_3 = new C();
        show(ob_1);
        show(ob_2);
        show(ob_3);
        
    }
    static void show(A r){
        r.read();
    }
    
}
