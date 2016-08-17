/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author gauravsharma
 */
public class LoginPage implements ActionListener {

    JFrame f1;
    JLabel username_label, password_lable;
    JTextField username_text;
    JPasswordField password_text;
    JButton ok, exit;
    JMenuBar mb1;
    JMenu m1, m2, m3;
    JMenuItem mi1, mi2, mi3;

    public LoginPage() {
        f1 = new JFrame("Login Page");
        username_label = new JLabel("UserName");
        password_lable = new JLabel("Password");
        username_text = new JTextField();
        password_text = new JPasswordField();
        ok = new JButton("Ok");
        exit = new JButton("Exit");

        mb1 = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("Help");
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
    }

    void display() {
        f1.setSize(600, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.setLocation(100, 100);
        //f1.setUndecorated(true);
        username_label.setBounds(50, 100, 100, 30);
        password_lable.setBounds(50, 200, 100, 30);

        username_text.setBounds(200, 100, 100, 30);
        password_text.setBounds(200, 200, 100, 30);

        ok.setBounds(100, 300, 100, 30);
        exit.setBounds(300, 300, 100, 30);

        ok.addActionListener(this);
        exit.addActionListener(this);


        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);

        mb1.add(m1);
        mb1.add(m2);
        mb1.add(m3);

        f1.setJMenuBar(mb1);
        f1.add(username_label);
        f1.add(password_lable);
        f1.add(username_text);
        f1.add(password_text);

        f1.add(ok);
        f1.add(exit);


        f1.setVisible(true);
    }

    public static void main(String[] args) {

        new LoginPage().display();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ok) {
            String uname = username_text.getText().trim();
            String pass = password_text.getText();
            if (uname.equalsIgnoreCase("admin") && pass.equals("abc123")) {


                JOptionPane.showMessageDialog(null, "Welcome User", "Welcome", 1);

                DemoGui1 obj = new DemoGui1();
                obj.display();
                
                //f1.setVisible(false);
                   f1.dispose();
            } else {

                JOptionPane.showMessageDialog(null, "Invalid User", "Invalid", 0);

            }
        }
        if (e.getSource() == exit) {
            int result =
                    JOptionPane.showConfirmDialog(null, "R u Sure?", "Sure", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}
