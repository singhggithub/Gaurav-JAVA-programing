

import java.io.*;
import java.awt.*;

class program16_11 extends Frame {
    TextField number, name, marks;
    Button enter, done;
    Label numLabel, nameLabel, markLabel;
    DataOutputStream dos;

    public program16_11() {
        super("Creat Student File");
    }

    public void setup() {
        resize(400, 200);
        setLayout(new GridLayout(4, 2));

        number = new TextField(25);
        numLabel = new Label("Roll Number");
        name = new TextField(25);
        nameLabel = new Label("Student name");
        marks = new TextField(25);
        markLabel = new Label("Marks");
        enter = new Button("ENTER");
        done = new Button("DONE");

        add(numLabel);
        add(number);
        add(nameLabel);
        add(name);
        add(markLabel);
        add(marks);
        add(enter);
        add(done);

        show();

        try {
            dos = new DataOutputStream(
                    new FileOutputStream("Student.dat"));
        } catch (IOException e) {
            System.err.println(e.toString());
            System.exit(1);
        }
    }

    public void addRecord() {
        int num;
        Double d;
        num = new Integer(number.getText()).intValue();
        try {
            dos.writeInt(num);
            dos.writeUTF(name.getText());
            d = new Double(marks.getText());
            dos.writeDouble(d.doubleValue());
        } catch (IOException e) {

        }

        number.setText(" ");
        name.setText(" ");
        marks.setText(" ");
    }

    public void cleanup() {
        if (!number.getText().equals(" ")) {
            addRecord();
        }
        try {
            dos.flush();
            dos.close();
        } catch (IOException e) {
        }
    }

    public boolean action(Event event, Object o) {
        if (event.target instanceof Button) {
            if (event.arg.equals("ENTER")) {
                addRecord();
                return true;
            }
        }
        return super.action(event, o);
    }

    public boolean handleEvent(Event event)
		{
			if(event.target instanceof Button)
			{
				if(event.arg.equals("Done" ))
						{
					    cleanup();
					    System.exit(0);
					    return true;
						}
			}
			return super.handleEvent(event);
		}

    public static void main(String args[]) {
        program16_11 student = new program16_11();
        student.setup();
    }
}