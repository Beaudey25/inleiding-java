package h11;

import java.awt.*;
import java.applet.*;


public class Op4 extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        for(teller = 3; teller < 31; teller++, teller++, teller++) {
            y += 20;
            g.drawString("" + teller, 200, y );
        }
    }
}