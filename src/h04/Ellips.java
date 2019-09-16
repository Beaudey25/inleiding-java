package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Ellips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.drawOval(20, 20, 50, 100);
       g.setColor(Color.yellow);
        g.fillOval(20,20,50,100);
    }
}
