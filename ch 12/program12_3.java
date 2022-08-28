class Q extends Thread{
    public void run ( )
    {
        for ( int i = 1; i<= 5 ; i++)
        {
            if (i==1) //yield( );
            System.out.println("\tFrom thread Q : i = "+i);
        }
        System.out.println("exit from A");
    }
}

class W extends Thread
{
    public void run( )
    {
        for( int j = 1 ; j<= 5; j++)
        {
            System.out.println("\t From thread W : j = "+j);
        }
        System.out.println("Exit from W");
    }
}
class R extends Thread{
    public void run ( )
    {
        for ( int k = 1; k<= 5; k++ )
        {
            System.out.println("\t from thread R : k = "+k);
        }
        System.out.println("Exit from k");
    }
}

public class program12_3 {
    public static void main(String[] args) {
        Q threadQ = new Q( );
        W threadW = new W( );
        R threadR = new R( );

        System.out.println("Start thread A");
        threadQ.start(  );

        System.out.println("Start thread W");
        threadW.start(  );

        System.out.println("Start thread R");
        threadR.start(  );
    }
}
