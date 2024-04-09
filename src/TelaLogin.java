import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends javax.swing.JFrame implements ActionListener {

    JButton btnEntrar = new JButton("Entrar");
    JButton btnVoltar = new JButton("Voltar");

    public TelaLogin(){

        this.setTitle("Xangrila Hotel: Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JTextField login = new JTextField();
        login.setPreferredSize(new Dimension(100, 30));
        login.setText("Login");

        JPasswordField senha = new JPasswordField();
        senha.setPreferredSize(new Dimension(100, 30));
        senha.setText("Senha");

        ImageIcon icone = new ImageIcon("hotel.png");

        String[] tipoUsuario = {"Gerente", "Recepcionista"};

        JComboBox tipo = new JComboBox(tipoUsuario);

        this.setIconImage(icone.getImage());
        this.getContentPane().setBackground(new Color(0xCD3D3D));

        btnEntrar.setBounds(100, 160, 200, 40);
        btnEntrar.addActionListener(this);

        btnVoltar.setBounds(200, 160, 200, 40);
        btnVoltar.addActionListener(this);

        this.add(login);
        this.add(senha);
        this.add(btnEntrar);
        this.add(tipo);
        this.add(btnVoltar);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnVoltar){
            new TelaInicial();
            this.dispose();
        }


    }

    private void resgatarInformacoes(){

    }
}