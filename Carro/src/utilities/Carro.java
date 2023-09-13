package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carro {
    private String nome;
    private String marca;
    private String placa;
    private Double preco;
    private Roda[] rodas;

    public Carro() {
        this.nome = "";
        this.marca = "";
        this.placa = "";
        this.preco = 0.0;
        this.rodas = new Roda[4];
        for (int i = 0; i < 4; i++) {
            this.rodas[i] = new Roda();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Roda[] getRodas() {
        return rodas;
    }

    public void setRodas(Roda[] rodas) {
        this.rodas = rodas;
    }

    public void preencherCarro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome do carro");
        nome = sc.nextLine();
        System.out.println("digite o nome da marca");
        marca = sc.nextLine();
        System.out.println("digite a placa");
        placa = sc.nextLine();
        System.out.println("digite o preco do carro");
        preco = sc.nextDouble();
        for (int i = 0; i < this.rodas.length; i++) {
            System.out.println("digite as rodas #" + i+1);
            this.rodas[i].preencherRoda();
        }


    }
}
