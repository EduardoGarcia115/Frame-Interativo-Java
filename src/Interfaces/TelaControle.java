package Interfaces;  //INFORMAÇÃO DO PACKAGE

//IMPORTAÇÕES DE PACOTES
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


//CLASSE DO FRAME
public class TelaControle extends JFrame implements ActionListener {
  
    //DECLARAÇÃO DE ATRIBUTOS
    JLabel texto;
    JButton jogar;
    JButton sair;
    PainelSemaforo painel1; 
    
    //CONSTRUTOR DO FRAME PRINCIPAL
    public TelaControle(){
        
        //INSTANCIANDO OS OBJETOS
        texto = new JLabel("MENU");
        jogar = new JButton("JOGAR");
        sair = new JButton("SAIR");
        painel1 = new PainelSemaforo();
        
        //ATRIBUÍNDO AS QUARACTERÍSTICAS PRINCIPAIS DO FRAME
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(600, 750);
        this.setTitle("JOGOS");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //INFORMANDO AS COORDENADAS DOS BOTÕES E DO LABEL
        texto.setBounds(73, 50, 50, 20);
        jogar.setBounds(10, 100, 150, 60);
        sair.setBounds(10, 200, 150, 60);
        
        //ADICIONANDO OS ELEMENTOS NO FRAME
        this.add(jogar);
        this.add(sair);
        this.add(texto);
        this.add(painel1);
        
        //ADICIONANDO A AÇÃO PARA OS BOTÕES 
        jogar.addActionListener(this);
        sair.addActionListener(this);
    }    

    //SOBREESCREVENDO O MÉTODO ACTIONPERFORMED PARA ADICIONAR AS AÇÕES DESEJADAS
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(jogar))
          painel1.setVisible(true);
        else
            if(e.getSource().equals(sair))
                painel1.setVisible(false);
                painel1.labelVerde.setVisible(false);
                painel1.labelAmarelo.setVisible(false);
                painel1.labelVermelho.setVisible(false);
}
}           

