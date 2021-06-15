import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel {
    JLabel titulo=new JLabel("teste");
    JLabel user1=new JLabel();
    JLabel senha=new JLabel();
    public Panel(){
        setBackground(Color.TRANSLUCENT);
        setLayout(null);
        localizacao();
        addComponentes();
        texto();   
    }
    private void setBackground(int translucent) {
    }
    public void localizacao(){
        titulo.setBounds(180, 10, 240, 50);
        user1.setBounds(240,60,120,25);
        senha.setBounds(240,100,120,25);
    }
    public void addComponentes(){
        add(titulo);
        add(user1);
        add(senha);
        

    }
    public void texto(){
        titulo.setText("Bem-vindo(a) ao Login");
        titulo.setFont(new Font("sans-serif",Font.BOLD,22));

        user1.setText("Insira seu usuario:");
        user1.setFont(new Font("sans-serif", Font.ITALIC,12));

        senha.setText("Insira sua senha:");
        senha.setFont(new Font("sans-serif", Font.ITALIC,12));

    }
    public void add(Object botao){
    }
    
}
