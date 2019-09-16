package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
        setSize(100,100);
    }

    public void paint(Graphics g) {
   g.setColor(Color.blue);
   g.fillRoundRect(20,20,50,50,20,20);
   g.drawOval(30,30,10,10);
   g.setColor(Color.black);
   g.fillOval(30,30,10,10);
   g.drawOval(50,30,10,10);
   g.setColor(Color.black);
   g.fillOval(50,30,10,10);
   g.drawOval(30,50,10,10);
   g.setColor(Color.black);
   g.fillOval(30,50,10,10);
   g.drawOval(50,50,10,10);
   g.setColor(Color.black);
   g.fillOval(50,50,10,10);
    }
}