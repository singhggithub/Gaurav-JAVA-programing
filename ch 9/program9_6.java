import java.io.DataInputStream;
import java.io.IOException;

public class program9_6 {
    public static void main(String[] args) {
        Float principalAmount = new Float (0);
        Float intrestrate = new Float(0);
        int numyears = 0;

        try{
            DataInputStream in = new DataInputStream(System.in);
            System.out.println("Enter principal amount: ");
            System.out.flush();
            String principalString = in.readLine();
            principalAmount = Float.valueOf(principalString);

            System.out.println("Enter intrest rate: ");
            System.out.flush();
            String intreststring = in.readLine();
            intrestrate = Float.valueOf(intreststring);
            System.out.println("Enter number of years");
            System.out.flush();
            String yearsString = in.readLine();
            numyears = Integer.parseInt(yearsString);

        }
        catch(IOException e)
        {
            System.out.println("IO error");
            System.exit(1);
            
        }

    }
}
