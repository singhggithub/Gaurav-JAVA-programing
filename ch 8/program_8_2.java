public class program_8_2 {
    int length ,width;
    program_8_2(int x , int y)
    {
        length = x ; 
        width = y  ;
    }
    int rectArea()
    {
        return(length *width);
    }
}

class rectanglearea
{
    public static void main(String[] args) {
        program_8_2 rect1 =new     program_8_2(15,10);
        int area1 = rect1.rectArea( );
        System.out.println("Area 1 = "+area1);

    }
}
