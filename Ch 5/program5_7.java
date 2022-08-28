public class program5_7 {
    public static void main(String[] args) {
        

        // Declaration and initialization

        int a = 10, b = 5, c = 8 , d= 2;
        float x = 6.4f, y =3.0f;

        // order of evaluation 
        int answer1 = a*b + c/d;
        int answer2 = a * (b+c)/ d;

        //Type conversion 

        float answer3 = a/c;
        float answer4 = (float)a / c;
        float answer5 = a/y;
          
        // modulo operation

        float answer6 = a % c;
        float answer7 = x  % y;

        // Logic operations

        boolean bol1 = a>b && c>d;   // boolean is to store < > + - == = operations value and print if its true or not
        boolean bol2 = a<b && c>d;
        boolean bol3 = a <b || c>d;
        boolean bol4 = ! (a - b == c);

        System.out.println("Order of evalutaion");

        System.out.println("a*b + c/d = "+answer1);
        System.out.println("a * (b+c)/ d = "+answer2);

        System.out.println("Type conversion ");

        System.out.println("a/c = "+answer3);
        System.out.println("(float)a / c = "+answer4);
        System.out.println("a/y = "+answer5);

        System.out.println("modulo operation");

        System.out.println("a % c = "+answer6);
        System.out.println("x  % y = "+answer7);
        
        System.out.println("Logic operations");
        System.out.println("a>b && c>d  " +(a>b && c>d));
        System.out.println("a<b && c>d  "+bol2);
        System.out.println("a <b || c>d  "+bol3);
        System.out.println("! (a - b == c)  "+bol4);




    


        
    }
}
