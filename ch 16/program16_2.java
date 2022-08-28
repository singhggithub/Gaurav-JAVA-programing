
import java.io.*;
public class program16_2 
{
	public static void main(String[] args) 
	{		
		byte cities [] = {'d','e','l','h','i','\n','m','a','d','r','a','s','\n','l','o','n','d','o','n','\n'};
		FileOutputStream outfile = null;
		try
		{
			outfile = new FileOutputStream("city.txt");
			outfile.write(cities);
			outfile.close();
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
			System.exit(-1);
		}
	}
}