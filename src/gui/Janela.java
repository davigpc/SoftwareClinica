package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends javax.swing.JFrame implements ActionListener {

    JButton verInformacoes = new JButton("Ver Informacoes");
    JButton pagarConta = new JButton("Pagar Conta");
    JButton gerarFeedback = new JButton("Gerar Feedback");

    public Janela(){

        this.setTitle("Xangrila Hotel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        ImageIcon icone = new ImageIcon("hotel.png");
        //JLabel iconeLabel = new JLabel(icone);
        //this.add(iconeLabel);

        this.setIconImage(icone.getImage());
        this.getContentPane().setBackground(new Color(0xCD3D3D));

        gerarBotoesIniciais();
        this.setVisible(true);

    }

    private void gerarBotoesIniciais(){
        verInformacoes.setBounds(33, 97, 100, 70);
        pagarConta.setBounds(200, 97, 100, 70);
        gerarFeedback.setBounds(400, 97, 100, 70);

        this.add(verInformacoes);
        this.add(pagarConta);
        this.add(gerarFeedback);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == verInformacoes){

            JFrame janelaInfo = new JFrame();
            janelaInfo.setTitle("Informações do Hóspede");
            janelaInfo.setSize(500,500);

            janelaInfo.setLocationRelativeTo(null);
            janelaInfo.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

            JLabel nome = new JLabel("Nome:");
            JLabel cpf = new JLabel("CPF:");
            JLabel telefone = new JLabel("Telefone:");
            JLabel endereco = new JLabel("Endereco:");

            janelaInfo.add(nome);
            janelaInfo.add(cpf);
            janelaInfo.add(telefone);
            janelaInfo.add(endereco);
            janelaInfo.setVisible(true);

        }

    }

    private void resgatarInformacoes(){

    }
}