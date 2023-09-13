package utilities;

import java.util.Scanner;

public class Roda {
    private String cor;
    private String material;
    private Double aro;

    public Roda() {
        this.cor = "";
        this.material = "";
        this.aro = 0.0;
    }

    public void preencherRoda(){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a cor da roda");
        cor = sc.nextLine();
        System.out.println("digite o material");
        material = sc.nextLine();
        System.out.println("digite o tamanho do aro");
        aro = sc.nextDouble();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getAro() {
        return aro;
    }

    public void setAro(Double aro) {
        this.aro = aro;
    }
}
