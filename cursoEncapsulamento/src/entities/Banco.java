package entities;

public class Banco {
    private int numConta;
    private String nomeTitular;
    private double saldoConta;

    public Banco(int numConta, String nomeTitular, double depositoInicial) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        depositarValor(depositoInicial);
    }

    public Banco(int numConta, String nomeTitular) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
    }

    public void depositarValor(double deposito){
        this.saldoConta += deposito;
    }

    public void retirarValor(double retirada) {
            this.saldoConta -= retirada + 5.00;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public String toString() {
        return "Conta: "
                + getNumConta()
                + ", Nome: "
                + getNomeTitular()
                + ", Balance: R$ "
                + getSaldoConta()
                + ".";
    }
}

