class G extends Thread
{
    public void run ( )
    {
        System.out.println("This is thread G \t thread ID : "+Thread.currentThread().getId()+"\t Thread ptiority : "+Thread.currentThread().getPriority());
    }
}

class M extends Thread 
{
    public void run ()
    {
        System.out.println("This is thread M\t Thread ID : "+Thread.currentThread().getId()+"\t Thread priority : "+Thread.currentThread().getPriority());
    }
}

class L extends Thread
{
    public void run ()
    {
        System.out.println("This is thread L\t Thread ID : "+Thread.currentThread().getId()+"\t Thread priority : "+Thread.currentThread().getPriority());
    }
}
public class program12_5 {
    public static void main(String[] args) {
        
    
    G threadG = new G();
    M threadM = new M();
    L threadL = new L();

    threadG.setPriority(Thread.MIN_PRIORITY);
    threadM.setPriority(Thread.NORM_PRIORITY);
    threadL.setPriority(Thread.MAX_PRIORITY);

    System.out.println("\n This is the main thread \t thread ID "+Thread.currentThread().getId()+"\t Thread priority : "+Thread.currentThread().getPriority()+"\n");
    System.out.println("Lets call the other thread in sequence G->M->L\n");

    threadG.start();
    threadM.start();
    threadL.start();
    }
    
}
