

public class program6_3 {
    
    public static void main(String[] args) {
        
    
     int a = 325, b =700, c = 400;

     System.out.println("Largest value is : ");

     if (a>b){

        if (a>c){
            System.out.println("a"+a);
        }
        else{
            System.out.println("c"+c);  //  print c
        }

     }
     else{
         if(c>b){
             System.out.println(c);
         }
         else{
             System.out.println(b);
         }
     }
}}
