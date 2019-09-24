package h11;

import java.awt.*;
import java.applet.*;

    public class Op9 extends Applet {

        public void init() {
            setSize(800, 800);
        }
        public void paint(Graphics g) {
            setBackground(Color.PINK);
            int y = 50;
            int x = 50;
            int breedte = 50;
            int hoogte = 50;

            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }
            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }
            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
        }
    }


