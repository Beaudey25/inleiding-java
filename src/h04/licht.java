package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class licht extends Applet {

    public void init() {
       setSize(100,100);
    }

    public void paint(Graphics g) {
    g.drawOval(10,10,40,60);
    g.setColor(Color.black);
    g.fillOval(10,10,40,60);
    g.drawOval(25,23,10,10);
    g.setColor(Color.red);
    g.fillOval(25,23,10,10);
    g.setColor(Color.black);
    g.drawOval(25, 35,10,10);
    g.setColor(Color.orange);
    g.fillOval(25,35,10,10);
    g.setColor(Color.black);
    g.drawOval(25,48, 10,10);
    g.setColor(Color.green);
    g.fillOval(25,48,10,10);
    }

}