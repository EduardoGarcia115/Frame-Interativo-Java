package Interfaces;  //INFORMAÇÃO DO PACKAGE


//IMPORTAÇÕES DE PACOTES
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//CLASSE DO PAINEL
public class PainelSemaforo extends JPanel implements ActionListener {
    
    //DECLARAÇÃO DOS ATRIBUTOS
    JButton botaoVermelho;
    JButton botaoAmarelo;
    JButton botaoVerde;
    ImageIcon imagemVermelho;
    ImageIcon imagemAmarela;
    ImageIcon imagemVerde;
    JLabel labelVermelho;
    JLabel labelAmarelo;
    JLabel labelVerde;
    JLabel texto;
    
    //MÉTODO CONSTRUTOR
    public PainelSemaforo(){
        
        //CRIANDO OS OBJETOS
        botaoVermelho = new JButton();
        botaoAmarelo = new JButton();
        botaoVerde = new JButton();
        
        //CRIANDO OS ÍCONES DAS IMAGENS
        ImageIcon red = new ImageIcon("src/Imagens/semaforoVermelho.png"); 
        ImageIcon yellow = new ImageIcon("src/Imagens/semaforoAmarelo.png");
        ImageIcon green = new ImageIcon("src/Imagens/semaforoVerde.png");
        
        //CRIANDO OS OBJETOS
        labelVermelho = new JLabel();
        labelAmarelo = new JLabel();
        labelVerde = new JLabel();
        texto = new JLabel("Clique em uma cor");
        
        //ATRIBUÍNDO AS CARACTERÍSTICAS DO PAINEL
        this.setLayout(null);
        this.setVisible(false);
        this.setBounds(200, 20, 360, 680);
        this.setBackground(Color.pink);
        
        //ATRIBUÍNDO AS COORDENADAS DOS OBJETOS
        botaoVermelho.setBounds(140, 50, 80,50);
        botaoAmarelo.setBounds(140, 100, 80, 50);
        botaoVerde.setBounds(140, 150, 80, 50);
        labelVermelho.setBounds(10, 220, 342, 600);
        labelAmarelo.setBounds(10, 220, 342, 600);
        labelVerde.setBounds(10, 220, 342, 600);
        texto.setBounds(130, 10, 140, 40);
        
        //ATRIBUÍNDO COR AOS BOTÕES
        botaoVermelho.setBackground(Color.red);
        botaoAmarelo.setBackground(Color.yellow);
        botaoVerde.setBackground(Color.green);
        
        //MODIFICANDO O TAMANHO DAS IMAGENS
        red.setImage(red.getImage().getScaledInstance(342, 600, Image.SCALE_SMOOTH));
        yellow.setImage(yellow.getImage().getScaledInstance(342, 600, Image.SCALE_SMOOTH));
        green.setImage(green.getImage().getScaledInstance(342, 600, Image.SCALE_SMOOTH));
        
        //ADICIONANDO AS IMAGENS EM SEUS RESPECTIVOS LABELS
        labelVermelho.setIcon(red);
        labelAmarelo.setIcon(yellow);
        labelVerde.setIcon(green);
        
        //ATRIBUÍNDO A VISIBILIDADE DOS LABELS COM IMAGENS
        labelVermelho.setVisible(false);
        labelAmarelo.setVisible(false);
        labelVerde.setVisible(false);
        
        //ATRIBUÍNDO AS AÇÕES AOS LABELS 
        botaoVermelho.addActionListener(this);
        botaoAmarelo.addActionListener(this);
        botaoVerde.addActionListener(this);
        
        //ADICIONANDO OS OBJETOS NA TELA
        this.add(botaoVermelho);
        this.add(botaoAmarelo);
        this.add(botaoVerde);
        this.add(labelVermelho);
        this.add(labelAmarelo);
        this.add(labelVerde);
        this.add(texto);
   
    }    
    
    //SOBREESCRITA DO MÉTODO ACTIONPERFORMED
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(botaoVerde)){
            labelVerde.setVisible(true);
            labelVermelho.setVisible(false);
            labelAmarelo.setVisible(false);
        }
          else 
            if(e.getSource().equals(botaoVermelho)){
                labelVermelho.setVisible(true);
                labelAmarelo.setVisible(false);
                labelVerde.setVisible(false);
            }
        else
                if(e.getSource().equals(botaoAmarelo)){
                    labelAmarelo.setVisible(true);
                    labelVermelho.setVisible(false);
                    labelVerde.setVisible(false);  
                }  
        
    }
    
    
    
}


 
        
   
     