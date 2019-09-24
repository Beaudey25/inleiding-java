package h08;

//Voorbeeld 8.2

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Op2 extends Applet {

    Button jongen;
    Button man;
    Button meisje;
    Button vrouw;
    String schermtekst;
    int mannen, vrouwen, jongens, meisjes, totaal;

    public void init() {
        jongen = new Button("jongen");
        man = new Button("man");
        meisje = new Button("meisje");
        vrouw = new Button("vrouw");
        add(jongen);
        add(man);
        add(meisje);
        add(vrouw);
        schermtekst = "";
        jongen.addActionListener(new JongenListener());
        man.addActionListener(new ManListener());
        meisje.addActionListener(new MeisjeListener());
        vrouw.addActionListener(new VrouwListener());
    }

    public void paint(Graphics g) {
        setBackground(Color.green);
        g.drawString(schermtekst, 50, 60);
        g.drawString("Aantal Jongens:" + jongens, 10, 50);
        g.drawString("Aantal Mannen:" + mannen, 10, 70);
        g.drawString("Aantal Meisjes:" + meisjes,10,90);
        g.drawString("Aantal Vrouwen:" + vrouwen,10,110);
        g.drawString("Totaal:" + totaal, 10, 130);
    }
    class JongenListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
            jongens +=1;
            totaal +=1;
            repaint();
        }
    }
        class ManListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                mannen += 1;
                totaal += 1;
                repaint();
            }
        }
            class MeisjeListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    meisjes +=1;
                    totaal +=1;
                    repaint();
                }
            }
                class VrouwListener implements ActionListener {
                    public void actionPerformed(ActionEvent e) {
                        vrouwen +=1;
                        totaal +=1;
                        repaint();
                    }
                }

            }





