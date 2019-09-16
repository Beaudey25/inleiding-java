package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Op3 extends Applet {
    Button knop;
    TextField tekstvak;
    double getal;
    double uitkmost;
    TextField rentetekstvak;



    public void init() {
        tekstvak = new TextField(" ", 15);
        knop = new Button("Ok");
        rentetekstvak= new TextField("",15);add(tekstvak);
        add(tekstvak);
        add(rentetekstvak);
        add(knop);
        knop.addActionListener(new knopListener());
        tekstvak.addActionListener(new knopListener());
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            String geen;
            geen = "";
            rentetekstvak.setText(geen + getal*1.21);

        repaint();
        }

        public void pain(Graphics g) {
        }
    }
}

