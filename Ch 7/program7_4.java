public class program7_4
{
    public static void main(String[] args)
    {
        int p, q;
        System.out.println("The right angle triangle of @ is shown below :");
        for (p = 1; p <= 9; p++)
        {
            for (q = 1; q <= p; q++)
            {
                System.out.print("#");
            }
            System.out.println("#");
        }
    }
}
