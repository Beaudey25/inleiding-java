package h08;

import com.sun.org.glassfish.external.statistics.annotations.Reset;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Op1 extends Applet {
    Button ok;
    Button reset;
    TextField tekstvak;


    public void init() {
        tekstvak = new TextField("Voer iets in", 15);
        add(tekstvak);
        ok = new Button("Ok");
        reset = new Button("Reset");
        add(ok);
        add(reset);
        ResetListener resetListener = new ResetListener();
        OkListener okListener = new OkListener();
        ok.addActionListener(new OkListener());
        reset.addActionListener(new ResetListener());


    }
    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.getText();


        repaint();
        }

}
    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.getText();
            tekstvak.setText(" ");

            repaint();
        }

    }

    public void paint(Graphics g ) {
        g.drawString(" " + tekstvak.getText(),50,60);
    }
}

// Credits naar Quinten