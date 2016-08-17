/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author gauravsharma
 */
public class DemoEvent1 {

    JFrame f1, f2;
    JButton b1;

    public DemoEvent1() {
        f1 = new JFrame("My frame");
        f2 = new JFrame("New Frame");
        b1 = new JButton("ok");
    }

    void display() {
        f1.setSize(600, 500);
        f2.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        b1.setBounds(50, 100, 100, 30);
      
        f1.add(b1);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        new DemoEvent1().display();
    }
}
