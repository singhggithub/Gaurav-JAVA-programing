import java.io.DataInputStream; // to call in.readline()

public class Program4_1 {

	public static void main(String args[]) {
		DataInputStream in = new DataInputStream(System.in); // syntax for readline
		int n = 0;
		int number = 0;
		float num = 0.0f;

		try // like if in java
		{
			System.out.println("Enter integer");
			number = Integer.parseInt(in.readLine()); // scanf() for int in java
			System.out.println("Enter integer 2");
			n = Integer.parseInt(in.readLine());
			System.out.println("Enter float");
			num = Float.valueOf(in.readLine()); // scanf() for float in java
		} catch (Exception e) // like else in java
		{
			System.out.println(" input error " + e);

		}
		System.out.println(" int Number = " + number);
		System.out.println(" float Number = " + num);
		System.out.println(" int  N = " + n);
		System.out.println(" int  N+number = " + (n + number));

	}

}