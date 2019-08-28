package Opdracht4_1;

import java.awt.*;
import java.applet.*;

public class GelijkbenigeDriehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(50, 200, 100, 110);
        g.drawLine(100, 110, 150, 200);
        g.drawLine(50, 200, 150, 200);
    }
}
