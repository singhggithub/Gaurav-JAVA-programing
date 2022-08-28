import java.awt.*;
import java.applet.*;

class program14 extends Applet
{
    String str;
    public void init(  )
    {
        str = getParameter("String");
        if (str== null)
            str = "java";
            str = "Hello"+str;
    }
    public void paint (Graphics g)
    {
        g.drawString(str,10,100);
    }
}