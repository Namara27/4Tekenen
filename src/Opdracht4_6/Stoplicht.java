package Opdracht4_6;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            g.fillRect(112,140,17,110);
            g.fillRoundRect(100,50,40,100,10,10);
            g.setColor(Color.red);
            g.fillArc(110,60,20,20,0,360);
            g.setColor(Color.orange);
            g.fillArc(110,90,20,20,0,360);
            g.setColor(Color.green);
            g.fillArc(110,120,20,20,0,360);
        }
}
