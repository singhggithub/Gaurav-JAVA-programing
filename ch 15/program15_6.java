import java.awt.*;
import java.applet.*;
public class program15_6 extends Applet
{
    public void paint (Graphics g)
    {
        for ( int i = 0 ; i<=4;i++)
        {
            if ((i %2) == 0)
            {
            g.drawOval (120,i*60+10,50,50);
            }
            else
            {
            g.fillOval(120,i*60+10,50,50);
            }

        }
    }
}
