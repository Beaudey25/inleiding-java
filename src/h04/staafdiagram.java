package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class staafdiagram extends Applet {

    public void init() {
        setSize(100, 100);
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50, 0, 50, 80 );
        g.drawLine(80, 0, 80, 80);
        g.drawLine(110, 0, 110, 80);
        g.drawLine(20, 80, 110, 80);
        g.drawLine(20, 0, 20, 80);
        g.drawString("Valerie", 10, 90);
        g.drawString("0", 5, 80);
        g.drawString("20", 0, 65);
        g.drawString("40", 0, 50);
        g. drawString("60", 0, 35);
        g.drawString("80", 0, 20);
        g.drawString("100", 0, 10);
        g.setColor(Color.blue);
        g.fillRect(20, 40, 30, 40);
        g.setColor(Color.black);
        g.drawString("Jeroen", 50, 90);
        g.drawString("Hans", 90, 90);
        g.setColor(Color.yellow);
        g.fillRect(50, 0, 30, 80);
        g.setColor(Color.green);
        g.fillRect(80,10,30,70);

    }
}