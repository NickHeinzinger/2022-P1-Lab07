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
        Color hill = new Color(80,190,80);
        g.setColor(hill);
        g.fillOval(160,425,200,200);
        Color hill2 = new Color(60,200,80);
        g.setColor(hill2);
        g.fillOval(-20,425,300,200);
        g.fillOval(300,450,200,150);
        g.setColor(hill);
        g.fillOval(550,425,200,200);
        g.setColor(hill2);
        g.fillOval(650,450,300,250);
        g.fillOval(850,425,200,250);
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
        Color cloud = new Color(230, 230, 230);
        g.setColor(cloud);
        g.fillOval(750,100, 90, 60);
        g.fillOval(800,150,50, 30);
        g.fillOval(800,90, 110, 80);
        g.fillOval(850,125,80, 70);
        g.fillOval(880,90,80, 65);

        g.fillOval(660,45,60, 40);
        g.fillOval(655,30,50, 30);
        g.fillOval(690,40,40, 30);
    }
}