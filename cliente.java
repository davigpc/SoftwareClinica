public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int login;
    private String senha;
    private int checkIn;
    private int checkOut;
    private Quarto nomeQuarto;

    public Quarto getQuarto() {
        return nomeQuarto;
    }

    public void setQuarto(Quarto nomeQuarto) {
        this.nomeQuarto = nomeQuarto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckIn(int checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(int checkOut) {
        this.checkOut = checkOut;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}