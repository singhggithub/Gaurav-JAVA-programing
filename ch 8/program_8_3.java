class perimeter {
    int length;
    int breadth;

    perimeter() {
        length = 0;
        breadth = 0;

    }

    perimeter(int x, int y) {
        length = x;
        breadth = y;

    }

    void calculate_perimeter() {
        int peri;

        peri = 2 * (length + breadth);
        System.out.println("PErimeter of rectangle is " + peri);

    }
}

public class program_8_3 {
    public static void main(String[] args) {
        perimeter p1 = new perimeter();
        perimeter p2 = new perimeter(5, 10);
        p1.calculate_perimeter();
        p2.calculate_perimeter();
    }

}
