
public class program4_2 {

	public static void main(String[] args) {
		System.out.println("Variable created");
		char c = 'x';
		byte b = 50;
		short s = 2003;
		int i = 3765825;
		long l = 316574564646746767l;  // l at end of long
        float f1 = 3.254f;             // f at the end of float
        float f2 = 1.2e-5f; 
        double d2 = 0.0000987;
        
        System.out.println("C = "+c);
        System.out.println("b = "+b); 
        System.out.println("s = "+s);
        System.out.println("i = "+i);
        System.out.println("l = "+l);
        System.out.println("f1 = "+f1);
        System.out.println("f2 = "+f2);
        System.out.println("d2 = "+d2);
        System.out.println(" ");
        System.out.println("Types converted");
        
        short s1 = (short)b;
        short s2 = (short)i; // type cast all of this
        float n1 = (short)l;
        int ml = (short)f1;
        
        System.out.println("(short)b = "+s1);
        System.out.println("(short)i = "+s2);
        System.out.println("(short)l = "+n1);
        System.out.println("(short)fl = "+ml);
	}

}
