import java.io.*;
public class program16_4 
{
    public static void main(String[] args) {
        FileInputStream infile = null;
        FileOutputStream outfile = null;

        byte byteRead;

        try
        {
            infile = new FileInputStream("input.dat");
            outfile = new FileOutputStream("output.dat");

            do{
                byteRead = (byte) infile.read();
                outfile.write(byteRead);
    
            }
            while( byteRead != -1);
        }
    
    
    catch(FileNotFoundException e)
    {
        System.out.println("File not found");
    }
    catch(IOException e)
    {
        System.out.println(e.getMessage());
    }
    finally
    {
        try{
            infile.close();
            outfile.close();
        }
        catch(IOException e) {}
    }
}
}
