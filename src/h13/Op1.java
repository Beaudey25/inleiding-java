package h13;

import java.awt.*;
import java.applet.Applet;

public class Op1 extends Applet {

    public void paint(Graphics g) {
        tekenDriehoek(g,50, 50,100,50,50,100);
    }

    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
       g.drawLine(x1,x2,y1,y2);
       g.drawLine(x2,x3,y2,y3);
       g.drawLine(x3,x1,y3,y1);
    }

}