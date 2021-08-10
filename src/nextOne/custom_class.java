package nextOne;

public class custom_class {

        public static  String name;

   static {
       name = "Marina";

   }

   public static void method1(){
       System.out.println(name);
   }
}

class test{
    public static void main(String[] args) {
        custom_class.method1();
    }
}