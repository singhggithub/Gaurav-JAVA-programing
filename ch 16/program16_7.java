
import java.io.*;
class program16_7 
{
	public static void main(String[] args) throws IOException
		{
			FileInputStream file1 = null;
			FileInputStream file2 = null;
			SequenceInputStream file3 = null;
			file1 = new FileInputStream("text1.txt");
			file2 = new FileInputStream("text2.txt");
			file3 = new SequenceInputStream(file1,file2);
			BufferedInputStream in = new BufferedInputStream(file3);
			BufferedOutputStream out = new BufferedOutputStream(System.out);
			int ch;
			while((ch = in.read())!=-1)
			{
				out.write((char)ch);
			}
			in.close();
			out.close();
			file1.close();
			file2.close();
		}
}