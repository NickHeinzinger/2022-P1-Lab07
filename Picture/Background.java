package Picture;

import java.applet.Applet;
import java.awt.*;
public class Background {
    public static void drawSky(Graphics g)
    {
        Color skyBlue = new Color(225,246,255);
        g.setColor(skyBlue);
        g.fillRect(0,0,1000,600);
    }
    public static void drawHills(Graphics g)
    {
        Color grassGrn = new Color(50, 205, 50);
        g.setColor(grassGrn);
        g.fillRect(0, 500, 1000, 300);
    }
    public static void drawSun(Graphics g)
    {
        Color Sun = new Color(255, 215, 0);
        g.setColor(Sun);
        g.fillOval(-75,-75, 150, 150);
    }
    public static void drawClouds(Graphics g)
    {
        Color Colud = new Color(200, 200, 200);
    }
}