/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author gauravsharma
 */
public class DemoGui1 {

    JFrame f1;
    JLabel l1;
    Thread t1;
    String imgs[] = {"1.JPG", "2.JPG", "3.JPG"};

    public DemoGui1() {
        f1 = new JFrame("My Freammmmmmm");
        l1 = new JLabel(new ImageIcon("C:\\java\\1.JPG"));
        t1 = new Thread(new Data10());

    }

    void display() {
        f1.setSize(900, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        l1.setBounds(10, 50, 300, 300);
        f1.add(l1);
        f1.setVisible(true);
        t1.start();
    }

    public static void main(String[] args) {
        DemoGui1 obj = new DemoGui1();
        obj.display();
    }

    class Data10 implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i < imgs.length; i++) {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                l1.setIcon(new ImageIcon("C:\\java\\" + imgs[i]));
            }
        }
    }
}
