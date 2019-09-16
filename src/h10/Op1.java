package h10;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

    public class Op1 extends Applet {
        TextField tekstvak;
        String s;
        Button knop;


        public void init() {
            tekstvak = new TextField(" ", 15);
            knop = new Button("Ok");
            add(tekstvak);
            add(knop);
            tekstvak.addActionListener(new tekstvakListener());



        }

        public void paint(Graphics g) {
            g.drawString("" + 8 + "" + 22 + ": " + (8<5),50, 60 );
            g.drawString("" + 8 + "" + 5 + ": " + (8 < 5), 50, 80 );

        }

        class tekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
         String s = tekstvak.getText();






            }
        }
    }
