import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial implements ActionListener {

    JFrame telaInicial = new JFrame();
    JButton btnLogin = new JButton("Fazer Login");
    JButton btnCadastrar = new JButton("Cadastrar Funcionário");

    public TelaInicial(){

        btnLogin.setBounds(100, 160, 200, 40);
        btnLogin.addActionListener(this);

        btnCadastrar.setBounds(50, 160, 200, 40);
        btnCadastrar.addActionListener(this);

        telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaInicial.setTitle("Bem vindo ao Hotel Xangrila!");
        telaInicial.setResizable(false);

        telaInicial.setSize(500, 500);
        telaInicial.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        telaInicial.getContentPane().setBackground(new Color(0xCD3D3D));

        telaInicial.add(btnLogin);
        telaInicial.add(btnCadastrar);

        telaInicial.setVisible(true);
        telaInicial.setLocationRelativeTo(null);
    }

    private void gerarEntradaLogin() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnLogin){
            TelaLogin telaLogin = new TelaLogin();
            telaInicial.dispose();
        }
        if(e.getSource() == btnCadastrar){
            TelaCadastro telaCadastro = new TelaCadastro();
            telaInicial.dispose();
        }
    }
}
