
import java.awt.Frame;
import java.awt.Button;

public class program15_11 
{
	private program15_11()
	{
	Frame frame = new Frame("awt frame and button1");
	Button button = new Button("i am an Button");
    frame.add(button);
	button.setBounds(30,50,150,50);
	frame .setSize(300,300);
	frame.setLayout(null);
	frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new program15_11();
	}
}