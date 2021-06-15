import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * autor : Matheus Francisco 
 */
public class Acesso extends JFrame implements ActionListener {
    JButton entrar=new JButton();
    Container jpanel=getContentPane();
    Panel meupainel=new Panel();
    JTextField username=new JTextField();
    JPasswordField senha1=new JPasswordField();

    
    public  Acesso(){
        jpanel.add(meupainel);
        meupainel.add(entrar);
        meupainel.add(username);
        meupainel.add(senha1);

        botao();
        userName();
        senhaUser();
        acaoBotao();
    }
    public void userName(){
        username.setBounds(200,80,200,25);
        username.setVisible(true);
    }
    public void senhaUser(){
        senha1.setVisible(true);
        senha1.setBounds(200,120,200,25);
    }
    public void botao(){
        entrar.setBounds(250,160,100,50);
        entrar.setText("Entrar");
        entrar.setVisible(true);
    }
    public void acaoBotao(){
        entrar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource()==entrar){
            String texto1;
            String senhauser;
            texto1=username.getText();
            senhauser=senha1.getText();
            if(texto1.equalsIgnoreCase("username") && senhauser.equalsIgnoreCase("1234")){
                JOptionPane.showMessageDialog(this,"Login Sucess");
            }else{
                JOptionPane.showMessageDialog(this,"User ou senha invalidos");
            }
        }

    }
    public static void main(String[] args) {
       Acesso frame=new Acesso();
       frame.setSize(650,350);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       frame.setVisible(true);
       
       
    }
}