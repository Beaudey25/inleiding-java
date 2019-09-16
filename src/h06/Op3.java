package h06;

//Voorbeeld 6.3

import java.awt.*;
import java.applet.*;


public class Op3 extends Applet {
    double a;
    double b;
    double c;
    double uitkomst;


    public void init() {
        a = 13;
        b = 13;
        c = 6;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}