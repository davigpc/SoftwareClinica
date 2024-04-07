package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends javax.swing.JFrame {

    public Janela(){

        this.setTitle("Xangrila Hotel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(true);
        this.setSize(500, 500);

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        ImageIcon icone = new ImageIcon("hotel.png");
        //JLabel iconeLabel = new JLabel(icone);
        //this.add(iconeLabel);

        this.setIconImage(icone.getImage());
        this.getContentPane().setBackground(new Color(0xCD3D3D));

        gerarBotoesIniciais();
        JLabel modo = new JLabel("MODO: Hospede", JLabel.CENTER);
        this.add(modo);

        this.setVisible(true);

    }

    private void gerarBotoesIniciais(){
        JButton verInformacoes = new JButton("Obter Informacoes");
        verInformacoes.setBounds(33, 97, 100, 70);
        //verInformacoes.addActionListener(e -> JFrame novaJanela = new JFrame());

        JButton pagarConta = new JButton("Pagar Conta");
        pagarConta.setBounds(200, 97, 100, 70);

        JButton gerarFeedback = new JButton("Gerar Feedback");
        gerarFeedback.setBounds(400, 97, 100, 70);

        this.add(verInformacoes);
        this.add(pagarConta);
        this.add(gerarFeedback);
    }

}