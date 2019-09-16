package h05;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Op2 extends Applet {
   Color opvulkleurV;
   Color opvulkleurJ;
   Color opvulkleurH;
   int breedte;
   int hoogte;




    public void init() {
        setSize(100, 100);
        opvulkleurV= Color.blue;
        opvulkleurH= Color.green;
        opvulkleurJ= Color.YELLOW;
        hoogte= 80;
                breedte= 20;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50, 0, 50, hoogte );
        g.drawLine(hoogte, 0, hoogte, hoogte);
        g.drawLine(110, 0, 110, hoogte);
        g.drawLine(breedte, hoogte, 110, hoogte);
        g.drawLine(breedte, 0, breedte, hoogte);
        g.drawString("Valerie", 10, 90);
        g.drawString("0", 5, hoogte);
        g.drawString("20", 0, 65);
        g.drawString("40", 0, 50);
        g. drawString("60", 0, 35);
        g.drawString("80", 0, breedte);
        g.drawString("100", 0, 10);
        g.setColor(Color.blue);
        g.fillRect(breedte, 40, 30, 40);
        g.setColor(Color.black);
        g.drawString("Jeroen", 50, 90);
        g.drawString("Hans", 90, 90);
        g.setColor(Color.yellow);
        g.fillRect(50, 0, 30, 80);
        g.setColor(Color.green);
        g.fillRect(hoogte,10,30,70);

    }
}