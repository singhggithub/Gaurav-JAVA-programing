
class An extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\t From thread a : i = " + i);
        }
        System.out.println("exit form a");
    }
}

class Bn extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\t From thread b : j = " + j);
        }
        System.out.println("exit form b");
    }
}

class Cn extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("\t From thread c : k = " + k);
        }
        System.out.println("exit form c");
    }
}

public class program12_4 {
    public static void main(String[] args) {
        An threadAn = new An();
        Bn threadBn = new Bn();
        Cn threadCn = new Cn();
        threadCn.setPriority(Thread.MAX_PRIORITY);
        threadBn.setPriority(threadAn.getPriority() + 1);
        threadAn.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start thread A");
        threadAn.start();

        System.out.println("Start thread B");
        threadBn.start();

        System.out.println("Start thread C");
        threadCn.start();

        System.out.println("End of the main thread");

    }
}
