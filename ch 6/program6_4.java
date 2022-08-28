public class program6_4 {
    public static void main(String[] args) {
        int rollnumber[] = { 22, 55, 70, 71, 55, 44, 99, 87, 65 };
        int mark[] = { 80, 85, 100, 75, 55, 69, 23, 12, 43 };

        for (int i = 0; i < rollnumber.length; i++) {
            if (mark[i] > 79) {
                System.out.println("Honors is roll.no = " + rollnumber[i]);
            }

            else if (mark[i] > 55) {
                System.out.println("I Division is roll number = " + rollnumber[i]);
            } else if (mark[i] > 49) {
                System.out.println("II Division is roll number = " + rollnumber[i]);
            } else {
                System.out.println("Fail = " + rollnumber[i]);
            }
        }
    }
}
