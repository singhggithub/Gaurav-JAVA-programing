interface area 
{
    final static float pi =3.14f;
    float c (float x, float y);
}

class rectangle implements area
{
    public float c  (float x, float y)
    {
        return(x*y);
    }
}

class circle implements area
{
    public float c  (float x, float y)
    {
        return(pi*x*x);
    }
}
class program10_1
{
    public static void main(String[] args) {
        circle c = new circle();
        rectangle r = new rectangle();

        area a;

        a = r;
        System.out.println("Area of rectangle = "+a.c(5,5));

        a = c; 
        System.out.println("Area of circle = "+a.c(5,5));
    }
}