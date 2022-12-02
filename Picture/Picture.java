package Picture;

import java.applet.Applet;
import java.awt.*;

public class Picture extends Applet {
    public void paint(Graphics g) {
//Background
        Background.drawSky(g);
        Background.drawHills(g);
        Background.drawSun(g);
        Background.drawClouds(g);
//Building
        Skyscraper.drawFrame(g);
        Skyscraper.drawWindows(g);
        Skyscraper.drawDoor(g);
//Bushes
        Bush.drawLeaves(g);
        Bush.drawBerries(g);
    }
}

