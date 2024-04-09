
import java.io.Serializable;
import java.util.Arrays;

public class Funcionario extends Pessoa implements Serializable {

    private String tipo;
    private String login;
    private String senha;

    public Funcionario(String nome, String cpf, String telefone, String endereco, String login, char[] senha) {
        super(nome, cpf, telefone, endereco);
        this.login = login;
        this.senha = Arrays.toString(senha);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + this.getNome() + '\'' +
                ", cpf=" + this.getCpf() +
                ", telefone=" + this.getTelefone() +
                ", endereco=" + this.getEndereco() +
                ", login=" + this.getLogin() +
                ", senha=" + this.getSenha() +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
