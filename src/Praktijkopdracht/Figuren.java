package Praktijkopdracht;

import java.awt.*;
import java.applet.*;

public class Figuren extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawString("Gevulde rechthoek met ovaal", 230,150);
        g.drawString("Gevulde ovaal",260,260);
        //Lijn
        g.drawString("Lijn", 90,40);
        g.drawLine(10,20,200,20);
        //Rechthoek
        g.drawString("Rechthoek", 80,150);
        g.drawRect(10,50,190,80);
        //Afgeronde Rechthoek
        g.drawString("Afgeronde Rechthoek",50,260);
        g.drawRoundRect(10,160, 190, 80, 30,30);
        //Ovaal van taartpunt
        g.drawString("Taartpunt met ovaal eromheen",420,150);
        g.drawOval(410,50,190,80);
        //Cirkel
        g.drawString("Cirkel",495,260);
        g.drawArc(470,160,80,80,0,360);
        //Gevulde Rechthoek, Gevulde ovaal, Taartpunt
        g.setColor(Color.magenta);
        g.fillRect(210,50,190,80);
        g.fillOval(210,160,190,80);
        g.fillArc(410,50,190,80,0,45);
        //Ovaal van gevulde rechthoek
        g.setColor(Color.black);
        g.drawOval(210,50,190,80);
    }
}
