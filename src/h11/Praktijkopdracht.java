package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Praktijkopdracht extends Applet {

    TextField tekstvak;
    Label label;
    Button knop;
    String s;
    int getal;

    public void init() {
        label = new Label("Zeg hier het cijfer:");
        add(label);

        tekstvak = new TextField( 15);
        add(tekstvak);
        tekstvak.addActionListener( new knopListener());

        knop = new Button("Ok");
        knop.addActionListener(new knopListener());
        add(knop);
    }

    public void paint(Graphics g) {
        int teller =1;
        int y = 20;

        while (teller <= 10 ){
            y +=20;
            g.drawString((teller) + "x" + (getal) + "=" + getal * teller, 50,y);
            teller++; // Telkens 1 erbij tot en met 10 hier.
        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt( s);
            tekstvak.setText("");
            repaint();
            }
        }
    }

    // Credits naar Quinten.

