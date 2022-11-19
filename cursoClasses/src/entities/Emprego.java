package entities;

public class Emprego {
    public String name;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return salarioBruto - taxa;
    }

    public void acrescentarSalario(double percent){
        salarioBruto += salarioBruto * percent/100 ;
    }

    public String toString(){
        return name
                + " , "
                + salarioLiquido();
    }
}
