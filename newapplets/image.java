/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newapplets;

import java.applet.Applet;

/**
 *
 * @author admin
 */
import java.awt.*;
public class image extends Applet {
    Image=img;

    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
    public void init() {
        img=getImage(getcodeBase(),"rabbit.gif");
    }
    public void paint(Graphics g)
    {
        g.drawImage(img,10,10,this);
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
