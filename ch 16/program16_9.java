import java.io.*;
public class program16_9 {
    public static void main(String[] args) {

        RandomAccessFile rFile;
        try{
            rFile = new RandomAccessFile("city.txt", "rw");
            rFile.seek(rFile.length());
            rFile.writeBytes("Madras \n");
            rFile.close();
        }
        catch(IOException ioe)
        {
            System.out.println("ioe");
        }
    }
}
