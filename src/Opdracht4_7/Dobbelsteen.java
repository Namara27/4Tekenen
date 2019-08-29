package Opdracht4_7;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            g.fillRoundRect(100,100,100,100, 20,20);
            g.setColor(Color.white);
            g.fillArc(115,115,20,20,0,360);
            g.fillArc(115,165,20,20,0,360);
            g.fillArc(165,115,20,20,0,360);
            g.fillArc(165,165,20,20,0,360);
        }
}
