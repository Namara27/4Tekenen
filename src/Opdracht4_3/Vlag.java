package Opdracht4_3;

import java.awt.*;
import java.applet.*;

public class Vlag extends Applet {

      public void init() {
      }

      public void paint(Graphics g) {
          g.setColor(Color.red);
          g.fillRect(40, 40, 200, 45);
          g.setColor(Color.white);
          g.fillRect(40, 80, 200, 45);
          g.setColor(Color.blue);
          g.fillRect(40, 120,200, 45);
          g.setColor(Color.gray);
          g.fillRect(20, 30 , 20, 300);
      }


}
