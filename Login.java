//package login.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Login
 */
public class Login extends JFrame implements ActionListener {
    public JTextField t1;
    public JButton b1;

    public Login(){
        JPanel painel = new JPanel();
        
        b1 = new JButton("Converter");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getSource()==b1) {
                    double valor=Integer.parseInt(t1.getText());
                    double f=(valor*1.8)+32;
                    JOptionPane.showMessageDialog(null,"A temperatura em F é:"+f);
                }
            }
        });
        b1.setBounds(10,10,200,100);

        t1=new JTextField();
        t1.setBounds(80,90, 150, 90);

        this.setSize(800,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.add(b1);
        this.add(t1);
        this.add(painel);
    }
    public static void main(String[] args) {
        new Login();
    }


}


