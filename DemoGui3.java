/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author gauravsharma
 */
public class DemoGui3 {

    JFrame f1;
    JButton b1, b2, b3, b4, b5;

    public DemoGui3() {
        f1 = new JFrame("My Frame");
        b1 = new JButton("Save");
        b2 = new JButton("Ok");
        b3 = new JButton("Exit");
        b4 = new JButton("open");
        b5 = new JButton("close");


    }

    void display() {
        f1.setSize(600, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        b1.setBounds(50, 100, 100, 30);
        b2.setBounds(50, 150, 100, 30);
        b3.setBounds(50, 200, 100, 30);
        b4.setBounds(50, 250, 100, 30);
        b5.setBounds(50, 300, 100, 30);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        
        


        f1.setVisible(true);
    }

    public static void main(String[] args) {
        DemoGui3 obj = new DemoGui3();
        obj.display();

    }
}
