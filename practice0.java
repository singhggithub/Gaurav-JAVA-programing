import java.util.Scanner;

public class practice0 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        char c ;
		byte b ;
		short o ;
		int i = 1 ;
		long l ;  
        float f1 ;             
        float f2 ; 
        double d2 ;
        // System.out.println("Enter char");
        System.out.printf("Enter char %c \n ",i+64);  // 65 is ascii value of A
        c = s.next().charAt(0);  //   s.next().charAt(index);
        System.out.println(" char "+c);
    }
      //   Interpreter is faster than the compiler because compiler has to compile whole program

}
