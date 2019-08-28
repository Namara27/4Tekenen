package Opdracht4_4;

import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(50,20,50,200);
        g.drawLine(50,200,250,200);
        g.drawString("Valerie", 70, 220);
        g.drawString("Jeroen", 130, 220);
        g.drawString("Hans", 190, 220);
        g.drawString("20", 30, 180);
        g.drawString("40", 30, 150);
        g.drawString("60", 30, 120);
        g.drawString("80", 30, 90);
        g.drawString("100", 25, 60);
        g.drawString("120", 25, 30);
        g.drawString("(kg)", 25, 10);
        g.setColor(Color.red);
        g.fillRect(70, 145, 40,55);
        g.setColor(Color.blue);
        g.fillRect(130, 55, 40, 145);
        g.setColor(Color.green);
        g.fillRect(190, 85, 40, 115);
    }
}
