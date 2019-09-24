package h11;

import java.awt.*;
import java.applet.*;

public class Op8 extends Applet {

    public void init () {
        setSize(800,800);
    }
    public void paint(Graphics g) {
        int y = 500;
        int x = 500;
        int width = 10;
        int hight = 10;

        for (int i = 0; i < 100; i++) {
            g.drawOval(x,y , width ,hight);
            x -=5;
            y -=5;
            width += 10;
            hight += 10;
        }
    }
}
