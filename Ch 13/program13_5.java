public class program13_5 {

    public static void main(String[] args) {
        try 
        {
            int a = 2, b = 40, c = 2, x = 7 ,z;
            int p[]={2};
           
            
            try
            {
                z = x/((b*b)-(4*a*c));
                System.out.println("The value of z = "+z);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Division by zero in arithmetic expression");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds ");
        }
    }
}
