/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author gauravsharma
 */
public class StudentRegPage {

    JFrame f1;
    JLabel rollno_label, name_label, marks_label, gender_label, hobbies_label, address_label, city_label,img_label;
    JTextField rollno_text, name_text, marks_text;
    JRadioButton male_radio, female_radio;
    JCheckBox c1, c2, c3;
    JTextArea address_textarea;
    JComboBox city_combo;
    JButton save, exit;

    public StudentRegPage() {
        f1 = new JFrame("Student Reg");
        rollno_label = new JLabel("Rollno");
        name_label = new JLabel("Name");
        marks_label = new JLabel("Marks");
        gender_label = new JLabel("Gender");
        hobbies_label = new JLabel("Hobbies");
        address_label = new JLabel("Address");
        city_label = new JLabel("City");
        rollno_text = new JTextField();
        name_text = new JTextField();
        marks_text = new JTextField();
        male_radio = new JRadioButton("Male");
        female_radio = new JRadioButton("Female");
        c1 = new JCheckBox("aaaaaa");
        c2 = new JCheckBox("bbbbbb");
        c3 = new JCheckBox("cccccc");
        
        address_textarea = new JTextArea();
        city_combo = new JComboBox();
        save = new JButton("Save");
        exit = new JButton("Exit");
        img_label = new JLabel(new ImageIcon("C:\\java\\2.JPG"));
    }

    void display() {
        
        f1.setSize(600, 700);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        
         img_label.setBounds(350, 20, 100, 100);
        
        rollno_label.setBounds(50, 20, 100, 30);
        name_label.setBounds(50, 80, 100, 30);
        marks_label.setBounds(50, 140, 100, 30);
        gender_label.setBounds(50, 200, 100, 30);
        hobbies_label.setBounds(50, 260, 100, 30);
        address_label.setBounds(50, 320, 100, 30);
        city_label.setBounds(50, 450, 100, 30);
        
        rollno_text.setBounds(200, 20, 100, 30);
        name_text.setBounds(200, 80, 100, 30);
        marks_text.setBounds(200, 140, 100, 30);
        male_radio.setBounds(200, 200, 100, 30);
        female_radio.setBounds(350, 200, 100, 30);
        c1.setBounds(200, 260, 100, 30);
        c2.setBounds(350, 260, 100, 30);
        c3.setBounds(500, 260, 100, 30);
        address_textarea.setBounds(200, 320, 100, 100);
        city_combo.setBounds(200, 450, 100, 30);
        save.setBounds(100, 550, 100, 30);
        exit.setBounds(350, 550, 100, 30);
        
        f1.add(rollno_label);
        f1.add(name_label);
        f1.add(marks_label);
        f1.add(gender_label);
        f1.add(hobbies_label);
        f1.add(address_label);
        f1.add(city_label);
        
        
         f1.add(rollno_text);
        f1.add(name_text);
        f1.add(marks_text);
        f1.add(male_radio);
        f1.add(female_radio);
        f1.add(c1);
        f1.add(c2);
        f1.add(c3);
        f1.add(address_textarea);
         f1.add(city_combo);
          f1.add(address_textarea);
         f1.add(save);
          f1.add(exit);
        
         f1.add(img_label);
        
        f1.setVisible(true);
        
        
    }

    public static void main(String[] args) {
        
        new StudentRegPage().display();
    }
}
