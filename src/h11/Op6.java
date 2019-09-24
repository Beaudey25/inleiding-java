package h11;

import java.awt.*;
import java.applet.*;

public class Op6 extends Applet {

    public void init () {
        setSize(500,500);
    }
    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        int width = 10;
        int hight = 10;

        for (int i = 0; i < 5; i++) {
            g.drawOval(x,y , width ,hight);
            x -=5;
            y -=5;
            width += 10;
            hight += 10;
        }

    }
}