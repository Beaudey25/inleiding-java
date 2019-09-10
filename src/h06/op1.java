package h06;


//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class op1 extends Applet {
    double a;
    double b;
    double c;
    double uitkomst;

    public void init() {
        a = 112;
        b = 4;
        uitkomst = (a / b) + 0.25 ;
    }

    public void paint(Graphics g) {
        g.drawString("Beaudey krijgt: " + uitkomst , 20, 20);
        g.drawString("Jan krijgt: " + uitkomst , 20 ,35);
        g.drawString("Ali krijgt: " + uitkomst, 20 , 50);
        g.drawString("Jeannette krijgt: " + uitkomst, 20, 65);
    }
}