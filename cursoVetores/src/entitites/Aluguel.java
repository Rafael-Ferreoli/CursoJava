package entitites;

public class Aluguel {

    protected String nome;
    protected String email;
    protected int numQuarto;

    public Aluguel(String nome, String email, int numQuarto) {
        this.nome = nome;
        this.email = email;
        this.numQuarto = numQuarto;
    }


    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "QUARTOS ALUGADOS: "
                + getNumQuarto()
                + ", Nome: "
                + getNome()
                + ", Email: "
                + getEmail()
                + ".";
    }
}
