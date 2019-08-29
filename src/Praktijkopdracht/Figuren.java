package Praktijkopdracht;

import java.awt.*;
import java.applet.*;

public class Figuren extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawString("Lijn", 90,40);
        g.drawLine(10,20,200,20);
        g.drawString("Rechthoek", 80,150);
        g.drawRect(10,50,190,80);
        g.drawString("Afgeronde Rechthoek",50,260);
        g.drawRoundRect(10,160, 190, 80, 30,30);
        g.drawString("Gevulde rechthoek met ovaal", 230,150);
        g.drawString("Gevulde ovaal",260,260);
        g.drawString("Taartpunt met ovaal eromheen",420,150);
        g.drawString("Cirkel",495,260);
        g.setColor(Color.magenta);
        g.fillRect(210,50,190,80);
        g.fillOval(210,160,190,80);
        g.fillArc(410,50,190,80,0,45);
        g.setColor(Color.black);
        g.drawOval(210,50,190,80);
        g.drawOval(410,50,190,80);
        g.drawArc(470,160,80,80,0,360);
    }
}
