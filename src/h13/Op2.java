package h13;

import java.awt.*;
import java.applet.Applet;

public class Op2 extends Applet {

    public void init(){
        setSize(600,600);
    }

    public void paint(Graphics g) {
        tekenRechthoek(g,0, 0,50,50,150,200, 300,300,400,400,500,500,350,350,100,250,100);
    }

    void tekenRechthoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4,int x5,int y5,int x6,int y6,int x7,int y7,int x8,int y8,int x9) {
        g.drawRect(x1,y4,x6,y4);
        g.setColor(Color.red);
        g.fillRect(x1,y4,x6,y4);
        g.setColor(Color.black);

        for (int i = 0; i < 3; i++) {
            g.drawRect(x1,y4,x3,y2);
            g.drawRect(x2,y4,x3,y2);
            g.drawRect(x3,y4,x3,y2);
            g.drawRect(x4,y4,x3,y2);
            g.drawRect(x7,y4,x3,y2);
            y4+=100;
        }

        for (int i = 0; i < 3; i++) {
            g.drawRect(x1,y7,x3,y2);
            g.drawRect(y8,y7,x3,y2);
            g.drawRect(x3,y7,x3,y2);
            g.drawRect(x8,y7,x3,y2);
            g.drawRect(x7,y7,x3,y2);
            y7 +=100;
        }
    }
}

