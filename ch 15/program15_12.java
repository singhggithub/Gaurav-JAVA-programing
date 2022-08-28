
import java.awt.Label;

import java.awt.Frame;

public class program15_12 {

public program15_12 () {

Frame frame = new Frame ("AWT Labels");

Label firstLabel = new Label ("First Label");
firstLabel.setBounds (10, 40, 160, 30);

//Add components to the frame frame.add (firstLabel);
Label secondLabel = new Label("second label");
secondLabel.setBounds(10,90,160,30);
frame.add(firstLabel);
frame.add(secondLabel);

frame.setSize (400, 150);

frame.setLayout (null); frame.setVisible (true);
}


public static void main(String[] args) {

new program15_12 ();
}
}