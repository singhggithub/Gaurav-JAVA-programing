import java.util.*;

import javax.print.attribute.standard.PagesPerMinute;

class Book {
    int id;
    String name;
    Scanner sc;
    page[] pages; // if int float or char not mentioned it is initialized as int

    class page // Nested class
    {
        int[] lines;

        page(int numlines) {
            lines = new int[numlines];
        }

        void setlines() {
            for (int i = 0; i < lines.length; i++) {
                System.out.println("Enter the number of words for line" + (i + 1));
                lines[i] = sc.nextInt();
            }
        }

        int getlines() {
            return lines.length;
        }
    }

    Book(int id, String name, int numpages) {
        this.id = id;
        this.name = name;
        sc = new Scanner(System.in);
        pages = new page[numpages];

        for (int i = 0; i < pages.length; i++) {
            System.out.println("Enter Number of lines for page " + (i + 1));
            int nlines = sc.nextInt();
            pages[i] = new page(nlines);
            pages[i].setlines();

        }
    }

    public int getnumofwords() {
        int NumofWord = 0;
        for (int i = 0; i < pages.length; i++) {

            for (int j = 0; j < pages[i].getlines(); j++) {
                NumofWord += pages[i].lines[j];
            }
        }
        return NumofWord;

    }
}

public class program3_8 {
    public static void main(String[] args) {

        Book b = new Book(1, "OOPM", 2);
        Book a = new Book(1, "OOPM", 3);

        int nowords = b.getnumofwords();
        int noofwords = a.getnumofwords();

        System.out.println("Total words =" + nowords);
        System.out.println("Total words =" + noofwords);

    }
}
