/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JButton;

/**
 *
 * @author gauravsharma
 */
public class DemoApplet extends JApplet{
    JButton b1;
    @Override
    public void init() {
        b1 = new JButton("ok");
        System.out.println("Applet Init");
    }
    @Override
    public void start() {
       
     System.out.println("Applet Start");
    }
    @Override
    public void stop() {
     System.out.println("Applet Stop");
    }
    @Override
    public void destroy() {
     System.out.println("Applet Destroy");
    }

    @Override
    public void paint(Graphics g) {
        
      //  g.drawString("hello", 100, 50);
       // g.drawLine(10, 10, 50, 200);
        g.drawOval(200,100 , 50, 100);
     
    }
   
    
    
   
}
