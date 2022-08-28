
public class program9_4 {
private static final int process = 0;

public static void main(String[] args) {
    StringBuffer str = new StringBuffer("Object Language");

    System.out.println("Original string :"+str);

    System.out.println("Length of string : "+str.length());
    for (int i = 0; i < str.length();i++ )
    {
        int p = i+1;
        System.out.println("Character at position "+p +" is "+str.charAt(i));
    }
    String aString = new String(str.toString());
    int pos = aString.indexOf(" language");

    str.insert(process,"Orinted");
    System.out.println("Modified string"+str);

    str.setCharAt(6, '-');
    System.out.println("String now"+str);
    str.append("Improves security.");
    System.out.println("Appended string"+str);
    


}

}
