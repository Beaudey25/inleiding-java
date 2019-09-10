package h05;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class copy extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;


    public void init() {
        setSize(500,500);
            //initialisatie.
            opvulkleur = Color.MAGENTA;
            lijnkleur = Color.BLACK;
            breedte = 100;
            hoogte = 50;
    }

    public void paint(Graphics g) {
        g.drawLine(0,50,100,50);
        g.drawString("Lijn",25,70);

//        g.drawRect(0, 100, breedte, hoogte);

        g.drawLine(0,breedte,breedte,breedte);
        g.drawLine(0, 100,0,150);
        g.drawLine(breedte,breedte,breedte,150);
        g.drawLine(0,150,100,150);
        g.drawString("Rechthoek", 20,170);

        g.drawRoundRect(0,200,breedte, hoogte,30,30);
        g.drawString("Afgeronde Rechthoek", 5, 270);

        g.drawLine(150,breedte,250,breedte);
        g.drawLine(150, breedte,150,150);
        g.drawLine(250,breedte,250,150);
        g.drawLine(150,150,250,150);
        g.drawString("Gevulde Rechthoek Met Ovaal", 120,170);
        g.setColor(Color.magenta);
        g.fillRect(150,breedte,breedte, hoogte);

        g.setColor(Color.black);
        g.drawOval(150,breedte,breedte,hoogte);
        g.drawString("Gevulde Ovaal", 160, 270);

        g.drawOval(150,200,breedte,hoogte);
        g.setColor(Color.magenta);
        g.fillOval(150,200,breedte,hoogte);

        g.setColor(Color.black);
        g.drawOval(300, breedte, 100,hoogte);
        g.setColor(Color.magenta);
        g.fillArc(300,100,breedte,hoogte,30,30);
        g.setColor(Color.black);
        g.drawString("Taartpunt Met Ovaal Eromheen", 300, 170);

        g.drawOval(320,190,65,65);
        g.drawString("Cirkel", 335, 270);






    }
}

