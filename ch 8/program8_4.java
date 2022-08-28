class mathop
{
    static float mul ( float x , float y)
    {
        return x*y;
    }
    static float div( float x , float  y)
    {
        return x/y;
    }
}

public class program8_4 {
    public static void main(String[] args) {
        float a = mathop.mul(2.0f,8.0f);
        float b = mathop.div(a,8.0f);
        System.out.println("b ="+b);
        System.out.println("a ="+a);
    }
}
