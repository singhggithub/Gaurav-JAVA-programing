import java.io.*;
import java.awt.*;

class ReadStudentFile extends Frame {
    TextField number, name, marks;
    Button next, done;
    Label numLabel, nameLabel, marksLabel;
    DataInputStream dis;
    boolean moreRecords = true;

    public ReadStudentFile() {
        super("create student File");

    }

    public void setup() {
        resize(400, 200);
        setLayout(new GridLayout(4, 2));
        number = new TextField(25);
        numLabel = new Label("Roll Number");
        name = new TextField(25);
        nameLabel = new Label("MArks");
        next = new Button("NEXT");
        done = new Button("DONE");
        add(numLabel);
        add(number);
        add(numLabel);
        add(name);
        add(marksLabel);
        add(marks);
        add(next);
        add(done);
        show();
        try {
            dis = new DataInputStream(new FileInputStream("student.dat"));

        } catch (IOException e) {
            System.err.println(e.toString());
            System.exit(1);
        }
    }

    public void readRecord() {
        int n;
        String s;
        double d;
        try {
            n = dis.readInt();
            s = dis.readUTF();
            d = dis.readDouble();
            number.setText(String.valueOf(n));
            name.setText(String.valueOf(s));
            marks.setText(String.valueOf(d));
        } catch (EOFException e) {
            moreRecords = false;
        } catch (IOException ioe) {
            System.out.println("IO Error");
            System.exit(1);

        }
    }

    public void cleanup() {
        try {
            dis.close();

        } catch (IOException e) {
        }
    }

    public boolean action(Event event, Object o) {
        if (event.target instanceof Button) {
            if (event.arg.equals("NEXT"))
                readRecord();
        }
        return true;
    }

    public boolean handleEvent(Event event) {
        if (event.target instanceof Button) {
            if (event.arg.equals("DONE") ||
                    moreRecords == false) {
                cleanup();
                System.exit(0);
                return true;
            }
        }
        return super.handleEvent(event);
    }

    public static void main(String[] args) {
        ReadStudentFile student = new ReadStudentFile();
        student.setup();
    }
}