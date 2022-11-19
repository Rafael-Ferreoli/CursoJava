package entities;

public class Estudante {
    public String name;
    public double notaPrimeiroTri;
    public double notaSegundoTri;
    public double notaTerceiroTri;

    public void notaFinal(){
        double notaFinal = notaPrimeiroTri + notaSegundoTri + notaTerceiroTri;
        if(notaFinal >= 60){
            System.out.println("NOTA FINAL = " + notaFinal);
            System.out.println("APROVADO");
        }else{
            System.out.println("NOTA FINAL = " + notaFinal);
            System.out.println("REPROVADO");
            double quantoFalta;
            quantoFalta = 60 - notaFinal;
            System.out.println("FALTOU: " + quantoFalta);
        }
    }
}
