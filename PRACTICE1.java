

import java.util.Scanner;
public class PRACTICE1 {

    public static void main(String[] args) {
        
        double a,b,c,d;
        Scanner open = new Scanner(System.in);

        System.out.println("Enter a and b ");
        a = open.nextDouble();
        b = open.nextDouble();


        c = Math.max(a,b);
        System.out.println("Greater number  is "+c);

        d = Math.sqrt(c);
        System.out.println("Square root of greater number " +Math.max(a,b)+ " is "+d);

    }
    
}
