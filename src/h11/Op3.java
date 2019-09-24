package h11;

import java.awt.*;
import java.applet.*;


public class Op3 extends Applet {
    int getal1 = 0;
    int getal2 = 1;
    int som = getal1 + getal2;
    int y = 20;
    String teken = "1";

    public void paint(Graphics g) {
        g.drawString( teken,10,20);
        for(int i = 0 ; i < 20; i++) {
            y += 20;
            g.drawString("" + som , 10,y);
            getal1 = getal2;
            getal2 = som;
            som = getal1 + getal2;
            i++;
        }
    }
}