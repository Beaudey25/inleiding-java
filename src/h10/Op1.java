package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

    public class Op1 extends Applet {
        TextField tekstvak;
        Label label;
        String tekst;
        double leeftijd;
        double hoogstegetal;

        public void setSize(int width, int height) {
            super.setSize(50, 50);
        }

        public void init() {
            tekstvak = new TextField("", 15);
            tekstvak.addActionListener(new VakListener());
            tekst = "";

            label = new Label("Zet hier uw leeftijd en druk op enter.");

            add(label);
            add(tekstvak);
        }

        public void paint(Graphics g) {
            g.drawString("" + hoogstegetal, 20, 50);

        }

        class VakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s;
                s = tekstvak.getText();
                leeftijd = Integer.parseInt(s);
                if (leeftijd > hoogstegetal) {
                    hoogstegetal = leeftijd;
                    repaint();
                }
            }
        }
    }