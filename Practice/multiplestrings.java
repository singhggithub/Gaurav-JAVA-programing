import java.util.Scanner;

public class multiplestrings {
    public static void main(String[] args) {
        int length;
        Scanner input = new Scanner(System.in);
        System.out.println("How many friends");
        length = input.nextInt();
        String[] names = new String[length];
        for (int counter = 0; counter < length; counter++) {
            System.out.println("Enter name of friend");
            names[counter] = input.next();

        }
        input.close();
        System.out.println("Your friends are");

        for (int counter = 0; counter < length; counter++) {
            System.out.println(names[counter]);
        }

    }
}