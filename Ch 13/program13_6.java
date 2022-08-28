public class program13_6 {
    public static void main(String[] args) {
        int a[] = {5,10,8};
        int b = 5  ;
        try{
        

            int x = a[2]/b-a[1];
            System.out.println("x = "+x);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index error");
        }
        catch(ArrayStoreException e)
        {
            System.out.println("Wrong data type");
        }

        int y = a[1] / a[0];
        System.out.println("y = "+y);
    }
}