package h06;


//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class op2 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;
    int uitkomst2;
    int uitkomst3;

    public void init() {
        a = 60;
        b = 60;
        c = 24;
        uitkomst = 60 * 60 ;
        uitkomst2 = 60 * 60 * 24;
        uitkomst3 = 60 * 60 * 24 * 365;
    }

    public void paint(Graphics g) {
        g.drawString("In 1 uur: " + uitkomst , 20, 20);
        g.drawString("In 1 dag: " + uitkomst2, 20, 35);
        g.drawString("In 1 jaar: " + uitkomst3, 20, 50);
    }
}
