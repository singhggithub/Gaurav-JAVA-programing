import java.io.*;
import java.util.*;
class program16_10 
{
    
    static DataInputStream din = new DataInputStream(System.in);
    static StringTokenizer st;

    public static void main(String[] args) throws IOException
    {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream ("invent.dat"));

        System.out.println("Enter code number");
        st = new StringTokenizer(din.readLine());
        int code = Integer.parseInt(st.nextToken());

        System.out.println("Enter number of items");
        st = new StringTokenizer(din.readLine());
        int items = Integer.parseInt(st.nextToken());
        
        System.out.println("Enter cost ");
        st = new StringTokenizer(din.readLine());
        double cost = new Double (st.nextToken()).doubleValue( );

        dos.writeInt(code);
        dos.writeInt(items);
        dos.writeDouble(cost);
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream ("invent.dat"));
        int codeNumber = dis.readInt();
        int totalitems =dis.readInt();
        double itemcost = dis.readInt();
        double totalcost = totalitems * itemcost; 
        dis.close();

        System.out.println();
        System.out.println("Code number "+codeNumber);
        System.out.println("Item cost "+itemcost);
        System.out.println("Total item "+totalitems);
        System.out.println("Total cost "+totalcost);
    }
}
