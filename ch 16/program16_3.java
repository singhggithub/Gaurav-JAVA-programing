import java.io.*;

class program16_3
{
    public static void main(String[] args) 
    {
    
    
        FileInputStream infile = null ;
        int b ;

        try 
        {
            infile = new FileInputStream (args[0]);
            while((b = infile.read()) != -1)
            {
                System.out.print((char) b);
            }
            infile.close( );
        }
        catch (IOException ioe)
        {
            System.out.println(ioe);
        }
    }
}