package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class vlag extends Applet {

    public void init() {
        setSize(100, 100);
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(20, 10, 80, 10);
    g.drawLine(20, 25, 80, 25);
    g.drawLine(20, 40, 80, 40);
    g.drawLine(20, 55, 80, 55);
    g.drawLine(20, 10, 20, 90);
    g.drawLine(80, 10, 80, 55);
    g.setColor(Color.white);
    g.fillRect(20, 25, 60, 15);
g.setColor(Color.red);
g.fillRect(20, 10, 60, 15);
g.setColor(Color.blue);
g.fillRect(20, 40, 60, 15);
    }
}