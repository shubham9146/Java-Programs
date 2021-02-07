class object_destruction {
     private int data;
     public object_destruction(){
         System.out.println("Inside the constructor");
     }

     protected void finalize() throws Throwable{
         super.finalize();
     }
}

public class create_class{
    public static void main(String[] args){
        object_destruction e = new object_destruction();
    }
}
