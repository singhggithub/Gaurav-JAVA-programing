import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Mysingle
{
    int value();
}
public class program9_9 {
    @Mysingle(100)
    public static void myMeth() {
        program9_9 ob = new program9_9();
        try{
            Method m = ob.getClass().getMethod("myMeth");
            Mysingle anno = m.getAnnotation(Mysingle.class);
            System.out.println("The value is : "+anno.value());

        }
        catch(NoSuchMethodException exc)
        {
            System.out.println("Method not found");
        }
        
    }
    public static void main(String[] args) {
        myMeth();
    }
}
