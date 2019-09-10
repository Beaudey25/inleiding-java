package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class driehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(10, 50, 50, 50);
        g.drawLine(30, 10, 50, 50);
        g.drawLine(10, 50, 30, 10);
    }
}