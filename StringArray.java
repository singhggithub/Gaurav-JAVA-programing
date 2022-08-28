
import java.io.*;
import java.util.*;

public class StringArray {
    public static void main(String[] args) {
        Scanner open = new Scanner(System.in);
        DataInputStream o = new DataInputStream(System.in);

        String string;
        int a;

        int arry[] = new int[10];

        System.out.println("Enter a String");
        string = open.nextLine();
        System.out.println("String is " + string);

        a = string.length();    // string has /o (Extra index at end of string) to terminate string 
        System.out.println("Length of string is "+a);

        for (int i = 0; i <= a; i++) {
            System.out.println("New element " + i);
            arry[i] = open.nextInt();
        }

        for (int i = 0; i <= a; i++) {
            System.out.println("Array " + i + " = " + arry[i]);
        }

    }
}
