

import java.applet. Applet;

import java.awt.*;

public class program15_19 extends Applet {

@Override

public void paint (Graphics graphics) {

Font font = graphics.getFont ();

String fontName = font.getName();

String fontFamily = font.getFamily();

int size = font.getSize();

int style = font.getStyle();

String message = "Font Family:" + fontName;

message += ", Font :"+ fontFamily;

message +=",Font size :"+size+", Font style:";



if((style & Font.BOLD) == Font. BOLD)

message += "Bold ";

if( (style & Font.ITALIC) == Font.ITALIC)

message += "Italic ";

if ( (0) == Font.PLAIN)

message += "Plain ";

graphics.drawString(message, 14, 36);
    }
}

/*

<applet code="FontApplet" width=350 height=60>

</applet>

*/