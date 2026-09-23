public class AUTOBOXING {
    public static void main(String[] args) {
        // int x=10;  //AUTOBOXING
        // Integer y=x;
        // System.out.println(x);
        // System.out.println(y); //unboxing

        // Integer a=20;     //autoboxing
        // int b=a;                  //unboxing
        // System.out.println(a);
        // System.out.println(b);

        //  printInteger(b);

        Integer x=10;
        Integer y=10;
         System.out.println(x==y);
        System.out.println(x.equals(y));
       
       
    }
     static void printInteger(Integer x)
        {
            System.out.println(x);
        }
}
