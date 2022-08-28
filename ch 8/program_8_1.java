public class program_8_1 {
    int length, width;

    void getdata(int x, int y) {
        length = x;
        width = y;

    }

    int rectrea() {
        int area = length * width;
        return (area);

    }
}

class rectArea {
    public static void main(String[] args) {
        int area1, area2;
        program_8_1 rect1 = new program_8_1();
        program_8_1 rect2 = new program_8_1();

        rect1.length = 15;
        rect1.width = 10;
        area1 = rect1.length * rect1.width;

        rect2.getdata(20, 12);
        area2 = rect2.rectrea();
        System.out.println("Area 1 = " + area1);
        System.out.println("Area 2 = " + area2);

    }
}
