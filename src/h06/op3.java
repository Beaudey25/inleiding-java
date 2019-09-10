package h06;


//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class Rekenen extends Applet {
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

    }
}