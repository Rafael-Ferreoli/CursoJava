package utilities;

public class Emprego {

    private int id;
    private String nome;
    private double salario;

    public Emprego(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcento){
        salario += salario * porcento/100;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setName(String name) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Id: "
                + getId()
                + ", Nome: "
                + getNome()
                + ", Salario: "
                + getSalario()
                + ".";
    }

}
