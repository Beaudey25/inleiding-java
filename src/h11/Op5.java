package h11;

import java.awt.*;
import java.applet.*;


public class Op5 extends Applet {

    public void init () {
        setSize(500,500);
    }

    public void paint(Graphics g) {

        int y = 50;
        int x = 50;


        for (int i = 0; i < 5; i++) {
            g.drawRect(x,y, 50,50);
            x += 50;
            y += 50;


        }

    }
}