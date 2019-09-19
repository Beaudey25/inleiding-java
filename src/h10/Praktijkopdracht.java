package h10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Praktijkopdracht extends Applet {

    TextField tekstvak;
    Label label;
    Button knop;
    int totaal;
    String s;
    String tekst;

    public void init() {

        tekstvak = new TextField( 15);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);

        label = new Label("Zeg hier uw cijfer");
        add(label);

        knop = new Button("Ok");
        knop.addActionListener(new TekstvakListener());
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 200, 50);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            totaal = Integer.parseInt( s);
            switch(totaal) {
                case 1:
                    tekst = "Slecht";
                    break;
                case 2:
                    tekst = "Slecht";
                    break;
                case 3:
                    tekst = "Slecht";
                    break;
                case 4:
                    tekst = "Onvoeldoende";
                    break;
                case 5:
                    tekst = "Matig";
                    break;
                case 6:
                    tekst = "Voldoende";
                    break;
                case 7:
                    tekst = "Voldoende";
                    break;
                case 8:
                    tekst = "Goed";
                    break;
                case 9:
                    tekst = "Goed";
                    break;
                case 10:
                    tekst = "Goed";
                    break;
                default:
                    tekst = "Klopt niet";
                    break;
            }
            repaint();
        }

    }
}
