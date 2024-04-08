package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    JFrame tela = new JFrame();
    JButton btnLogin = new JButton("Login");
    JButton btnCadastrar = new JButton("Cadastrar");

    JTextField txtLogin = new JTextField();
    JTextField txtSenha = new JTextField();

    public Login(){

        btnLogin.setBounds(100, 160, 200, 40);
        btnLogin.addActionListener(this);

        btnCadastrar.setBounds(50, 160, 200, 40);
        btnCadastrar.addActionListener(this);

        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setTitle("Login");
        tela.setResizable(false);

        tela.setSize(500, 500);
        tela.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        tela.getContentPane().setBackground(new Color(0xCD3D3D));


        tela.add(btnLogin);
        tela.add(btnCadastrar);
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }

    private void gerarEntradaLogin() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnLogin){
            Janela janela = new Janela();
            tela.dispose();
        }
    }
}
