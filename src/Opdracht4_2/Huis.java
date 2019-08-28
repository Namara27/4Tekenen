package Opdracht4_2;

import java.awt.*;
import java.applet.*;

public class Huis extends Applet {
        public void init() {
        }

        public void paint(Graphics g) {
            g.drawRect(130, 130, 100, 100);
            g.drawRect(185, 190, 30, 40);
            g.drawRect(140, 190, 35,25);
            g.drawRect(140,145,35,30);
            g.drawRect(185,145,30,30);
            g.drawLine(130, 130, 180, 60);
            g.drawLine(180, 60, 230, 130);
            g.drawLine(140,204, 175,204);
            g.drawLine(140, 160,175,160);
            g.drawLine(185,160, 215, 160);
        }
}
