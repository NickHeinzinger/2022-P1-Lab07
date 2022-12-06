package Picture;

import java.awt.*;
import java.applet.*;

public class Bush{
    public static void drawLeaves(Graphics g)
    {
        Color myGreen = new Color(34, 139, 34);
        g.setColor(myGreen);
        g.fillOval(50, 550, 100,75);
        g.fillOval(100, 560, 80,80);
        g.fillOval(85, 525, 75,50);
        g.fillOval(130, 520, 65,45);
        g.fillOval(150, 550, 100,75);
        g.fillOval(170, 530, 50,45);

        g.setColor(myGreen);
        g.fillOval(50+700, 550, 100,75);
        g.fillOval(100+700, 560, 80,80);
        g.fillOval(85+700, 525, 75,50);
        g.fillOval(130+700, 520, 65,45);
        g.fillOval(150+700, 550, 100,75);
        g.fillOval(170+700, 530, 50,45);
    }
    public static void drawBerries(Graphics g)
    {
        g.setColor(Color.red);
        g.fillOval(75, 605, 5,5);
        g.fillOval(193, 595, 5,5);
        g.fillOval(105, 555, 5,5);
        g.fillOval(165, 530, 5,5);
        g.fillOval(145, 585, 5,5);
        g.fillOval(197, 542, 5,5);

        g.setColor(Color.red);
        g.fillOval(75+700, 605, 5,5);
        g.fillOval(193+700, 595, 5,5);
        g.fillOval(105+700, 555, 5,5);
        g.fillOval(165+700, 530, 5,5);
        g.fillOval(145+700, 585, 5,5);
        g.fillOval(197+700, 542, 5,5);
    }
}
