import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;


public class TelaCadastro extends JFrame implements ActionListener {

    JButton btnCadastrar = new JButton("Concluir Cadastro");
    JButton btnVoltar = new JButton("Voltar");

    JTextField nome = new JTextField();
    JTextField cpf = new JTextField();
    JTextField telefone = new JTextField();
    JTextField endereco = new JTextField();
    JTextField login = new JTextField();
    JPasswordField senha = new JPasswordField();

    protected TelaCadastro() {

        this.setTitle("Xangrila Hotel: Cadastro");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        nome.setPreferredSize(new Dimension(100, 30));
        nome.setText("Nome");

        cpf.setPreferredSize(new Dimension(100, 30));
        cpf.setText("CPF");


        telefone.setPreferredSize(new Dimension(100, 30));
        telefone.setText("Telefone");

        endereco.setPreferredSize(new Dimension(100, 30));
        endereco.setText("Endereco");

        login.setPreferredSize(new Dimension(100, 30));
        login.setText("Login");

        senha.setPreferredSize(new Dimension(100, 30));
        senha.setText("Senha");


        ImageIcon icone = new ImageIcon("hotel.png");

        String[] tipoUsuario = {"Gerente", "Recepcionista"};


        JComboBox tipo = new JComboBox(tipoUsuario);

        this.setIconImage(icone.getImage());
        this.getContentPane().setBackground(new Color(0xCD3D3D));

        this.add(nome);
        this.add(cpf);
        this.add(telefone);
        this.add(endereco);
        this.add(login);
        this.add(senha);

        btnCadastrar.addActionListener(this);
        btnVoltar.addActionListener(this);

        this.add(tipo);
        this.add(btnCadastrar);
        this.add(btnVoltar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        File cadastro = new File("Cadastro.txt");


        if(e.getSource() == btnCadastrar) {
            Funcionario funcionario = new Funcionario(nome.getText(), cpf.getText(), telefone.getText(), endereco.getText(), login.getText(), senha.getPassword());
            
            System.out.println(funcionario);

            try {
                escritor("Cadastro.txt", funcionario);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }

        if(e.getSource() == btnVoltar){
            new TelaInicial();
            this.dispose();
        }
    }

    public static void salvaFuncionario(Funcionario obj, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            oos.flush();
        }
    }

    public static void escritor(String path, Funcionario obj) throws IOException {

        FileWriter fw = new FileWriter(path, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(obj.toString());
        bw.newLine();
        bw.flush();
        bw.close();
        fw.close();
    }
}
