package Picture;

import java.awt.*;
import java.applet.*;

public class Bush{
    public static void drawLeaves(Graphics g)
    {
        g.setColor(Color.green);
        g.fillOval(50, 550, 100,75);
        g.fillOval(100, 560, 80,80);
        g.fillOval(85, 525, 75,50);
        g.fillOval(130, 520, 65,45);
        g.fillOval(150, 550, 100,75);
    }
    public static void drawBerries(Graphics g)
    {
        g.setColor(Color.red);
        g.fillOval(75, 605, 5,5);
        g.fillOval(193, 595, 5,5);
        g.fillOval(105, 555, 5,5);
        g.fillOval(165, 530, 5,5);
        g.fillOval(145, 585, 5,5);

    }
}
