package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Op2 extends Applet {
    TextField tekstvak;
    Label label;
    String tekst;
    double leeftijd;
    double laagstegetal;
    double hoogstegetal;
    boolean eerstegetal;

    public void setSize(int width, int height) {
        super.setSize(50, 50);
    }

    public void init() {
        tekstvak = new TextField("", 15);
        tekstvak.addActionListener(new VakListener());
        tekst = "";
        eerstegetal = true;
        label = new Label("Zet hier uw leeftijd en druk op enter.");

        add(label);
        add(tekstvak);
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Dit is het hoogste getal." + hoogstegetal,15,50);
        g.drawString("Dit is het laagste getal." + laagstegetal, 15,70);

    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak.getText();
            leeftijd = Integer.parseInt(s);

            if (eerstegetal) {
                eerstegetal = false;
                hoogstegetal = leeftijd;
                laagstegetal = leeftijd;
                repaint();
            } else {
                if (leeftijd > hoogstegetal) {
                    hoogstegetal = leeftijd;
                    repaint();
                } else if (leeftijd < laagstegetal) {
                    laagstegetal = leeftijd;
                    repaint();
                }
            }
            }
        }
    }
