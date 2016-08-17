/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gauravsharma
 */
public class DemoGui2 extends javax.swing.JFrame {

    javax.swing.JButton b1;

    public DemoGui2() {
        b1 = new javax.swing.JButton("Ok");
    }

    void display() {
        setSize(600, 500);
        setLayout(null);
        b1.setBounds(50, 100, 100, 30);
        add(b1);

    }

    public static void main(String[] args) {
        DemoGui2 f1 = new DemoGui2();
        f1.display();
        f1.setVisible(true);

    }
}
