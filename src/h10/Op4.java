package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Op4 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    String s, tekst;
    String tekst2;
    int dag;
    int jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak2 = new TextField("",20);
        label = new Label("Type de datum en het jaar en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvak2.addActionListener(new Tekstvak2Listener());
        tekst = "";
        tekst2 = "";
        add(label);
        add(tekstvak);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 100 );
        g.drawString(tekst2,50,120);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "januari heeft 31 dagen";
                    break;
                case 2:
                    tekst = "februari heeft 28 dagen";
                    break;
                case 3:
                    tekst = "maart heeft 3 dagen";
                    break;
                case 4:
                    tekst = "april heeft 30 dagen";
                    break;
                case 5:
                    tekst = "mei 31 dagen";
                    break;
                case 6:
                    tekst = "juni heeft 30 dagen";
                    break;
                case 7:
                    tekst = "juli 31 dagen";
                    break;
                case 8:
                    tekst = "augustus 31 dagen";
                    break;
                case 9:
                    tekst = "september heeft 30 dagen";
                    break;
                case 10:
                    tekst = "oktober heeft 31 dagen";
                    break;
                case 11:
                    tekst = "november heeft 30 dagen";
                    break;
                case 12:
                    tekst = "december heeft 31 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
    class Tekstvak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak2.getText();
            jaartal = Integer.parseInt( s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst2 = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst2 = ""+ jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}
