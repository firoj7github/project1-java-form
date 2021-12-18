
package javaform;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class JavaForm extends JFrame{
    private final JLabel userLabel;
    private JLabel passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton submitButton, clearButton;
    private final Font f;
    private final Container c;
    JavaForm()
    {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(150, 50, 500, 300);
    this.setTitle("Log IN Form");
    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.pink);
     f = new Font ("arial", Font.BOLD, 16);
    userLabel = new JLabel("User Name :");
    userLabel.setBounds(50, 20, 100, 20);
    userLabel.setFont(f);
    
     passLabel = new JLabel("Password :");
    passLabel.setBounds(50, 60, 100, 20);
    passLabel.setFont(f);
    
    tf = new JTextField();
    tf.setBounds(145, 20, 190, 25);
    
    pf = new JPasswordField();
    pf.setBounds(145, 60, 190, 25);
    pf.setEchoChar('*');
    
    submitButton = new JButton("Log In");
    submitButton.setBounds(50, 100, 80, 25);
    
    clearButton = new JButton("Log Out");
    clearButton.setBounds(140, 100, 80, 25);
    c.add(userLabel);
    c.add(tf);
    c.add(passLabel);
    c.add(pf);
    c.add(submitButton);
    c.add(clearButton);
    clearButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        tf.setText("");
        pf.setText("");
        }
    });
     submitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
       String userName = tf.getText();
       String password = pf.getText();
       if(userName.equals("Joy") && password.equals("1234")){
       
       JOptionPane.showMessageDialog(null, "successfully log in");
       }else{
       JOptionPane.showMessageDialog(null, "Please enter correct informaion");
       
       }
        }
    });
   
    
    }

    public static void main(String[] args) {
     JavaForm F = new JavaForm();
     F.setVisible(true);
    }

  

    
 }
