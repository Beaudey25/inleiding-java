package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {
    Button minknop;
    Button keerknop;
    Button deelknop;
    Button plusknop;
    TextField tekstvak;
    TextField machine;
    double getal;
    double getal2;
    double antwoord;
    String s;
    String s2;

    public void init() {
        tekstvak = new TextField(" ", 15);
        machine = new TextField("", 15);
        keerknop = new Button("*");
        deelknop = new Button("/");
        plusknop = new Button("+");
        minknop = new Button("-");
        add(tekstvak);
        add(machine);
        add(keerknop);
        add(deelknop);
        add(plusknop);
        add(minknop);
        plusknop.addActionListener(new plusknopListener());
        minknop.addActionListener(new minknopListener());
        keerknop.addActionListener(new keerknopListener());
        deelknop.addActionListener(new deelknopListener());

        antwoord = 0.0;
    }

    public void paint(Graphics g) {
        g.drawString(antwoord + "", 50, 100);
    }

    class plusknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s2 = machine.getText();
            getal = Double.parseDouble(s);
            getal2 = Double.parseDouble(s2);
            antwoord = getal + getal2;
            repaint();
        }
    }

    class minknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s2 = machine.getText();
            getal = Double.parseDouble(s);
            getal2 = Double.parseDouble(s2);
            antwoord = getal - getal2;
            repaint();

        }
    }

    class keerknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s2 = machine.getText();
            getal = Double.parseDouble(s);
            getal2 = Double.parseDouble(s2);
            antwoord = getal * getal2;
            repaint();
        }
    }

    class deelknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s2 = machine.getText();
            getal = Double.parseDouble(s);
            getal2 = Double.parseDouble(s2);
            antwoord = getal / getal2;
            repaint();
        }
    }
}
