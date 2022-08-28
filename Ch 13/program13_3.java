
public class program13_3 {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 5;
         int c = 5;
         int x,y;

         try{
             x=a / (b-c);   // Exception error 
         }
         catch(ArithmeticException e){
            System.out.println("Division by zero");
         }
         y = a/(b+c);
         System.out.println("Y = "+y);
    }
}
