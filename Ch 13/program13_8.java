
public class program13_8 
{
    static void divide_m() throws ArithmeticException 
    {
        int x = 22, y = 10, z;
        z = x / y;
        System.out.println("z = " + z);

    }

    public static void main(String[] args) {
        try {
            divide_m();
        } catch (ArithmeticException e) {
            System.out.println("Caught the exception " + e);
        }
    }
}
