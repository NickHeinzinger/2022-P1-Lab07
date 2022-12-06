package Picture;

import java.applet.Applet;
import java.awt.*;
public class Skyscraper {
    public static void drawFrame(Graphics g)
    {
        g.drawRect(400,75,200, 500);

        Color myGray = new Color(211, 211, 211);
        g.setColor(myGray);
        g.fillRect(400,75,200, 500);
        g.fillRect(400,75,200, 500);
    }
    public static void drawWindows(Graphics g)
    {
        Color Wind = new Color(105, 140, 155);
        g.setColor(Wind);
        g.fillRect(425, 100, 50, 50);
        g.fillRect(525, 100, 50, 50);
        g.fillRect(425, 200, 50, 50);
        g.fillRect(525, 200, 50, 50);
        g.fillRect(425, 300, 50, 50);
        g.fillRect(525, 300, 50, 50);
        g.fillRect(425, 400, 50, 50);
        g.fillRect(525, 400, 50, 50);
    }
    public static void drawDoor(Graphics g)
    {
        Color door = new Color(100,100,100);
        g.setColor(door);
        g.fillRect(475,525, 50, 50);
        g.setColor(Color.black);
        g.drawLine(500,525,500,575);
    }

}
