package h11;


import java.awt.*;
import java.applet.*;


public class Op2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 20; teller > 9; teller--) {
            y += 20;
            g.drawString("" + teller, 305, y );
        }
    }
}