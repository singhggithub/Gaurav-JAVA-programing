import javax.swing.plaf.synth.SynthOptionPaneUI;

public class program7_2 {
    public static void main(String[] args) {
        int row, column , y;
        System.out.println("Multiplication table \n ");

        row = 1;

        do 
        {
            column =1 ;
            do
            {
                y = row * column ;
                System.out.print(" "+y);
                column = column +1 ;
            }
            while(column <= 3);
            System.out.println(" ");
            row = row +1;
        }
        while(row <= 3);
    }
}
