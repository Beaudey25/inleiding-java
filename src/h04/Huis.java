//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {
        setSize(100, 110);
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(20, 50, 50, 10);
        g.drawLine(80, 50, 50, 10);
        g.drawLine(20, 50, 80, 50);
        g.drawLine(20, 50, 20, 105);
        g.drawLine(80, 50, 80, 105);
        g.drawLine(20, 105, 80, 105);
        g.drawLine(20, 85, 30, 85);
        g.drawLine(30, 85, 30, 105);
        g.drawLine(55, 75, 55, 90);
        g.drawLine(55, 90, 70, 90);
        g.drawLine(55, 75, 70, 75);
        g.drawLine(70, 90, 70, 75);

         }
    }
