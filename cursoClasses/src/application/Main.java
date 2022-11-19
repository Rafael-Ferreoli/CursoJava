package application;

import entities.Emprego;
import entities.Estudante;
import entities.Rectangle;
import util.ConversorMoeda;
import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Produto produto = new Produto(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + produto);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        produto.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + produto);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + produto);
/*
        //EXERCICIO CONVERSOR
        System.out.println("digite o valor do dolar");
        double precoDolar = sc.nextDouble();
        System.out.println("digite a quantidade de dolar para compra");
        double qtdDolar = sc.nextDouble();
        double valorPago = ConversorMoeda.conversor(precoDolar,qtdDolar);
        System.out.println("o valor a ser pago em real eh:" + valorPago);
*/
        /*
        //EXERCICIO ESTUDANTE
        Estudante estudante = new Estudante();
        System.out.println("digite o nome do estudante");
        estudante.name = sc.nextLine();
        System.out.println("digite as notas do 1 trismestre");
        estudante.notaPrimeiroTri = sc.nextDouble();
        System.out.println("digite as notas do 2 trismestre");
        estudante.notaSegundoTri = sc.nextDouble();
        System.out.println("digite as notas do 3 trismestre");
        estudante.notaTerceiroTri = sc.nextDouble();
        estudante.notaFinal();
        */
        /*
        //EXERCICIO EMPREGO
        Emprego emprego = new Emprego();
        System.out.println("digite o nome do empregado");
        emprego.name = sc.nextLine();
        System.out.println("digite o salario bruto");
        emprego.salarioBruto = sc.nextDouble();
        System.out.println("digite o valor do imposto");
        emprego.taxa = sc.nextDouble();
        System.out.println("EMPREGADO: " + emprego.salarioLiquido());
        System.out.println("quantos % voce quer aumentar o salario?");
        double percent = sc.nextDouble();
        emprego.acrescentarSalario(percent);
        System.out.println(emprego);
        */

        /*
        //EXERCICIO RETANGULO
        Rectangle rectangle = new Rectangle();
        System.out.println("digite a largura do retangulo");
        rectangle.largura = sc.nextDouble();
        System.out.println("digite a altura do retangulo");
        rectangle.altura = sc.nextDouble();
        System.out.println("AREA = " + rectangle.area(rectangle.largura, rectangle.altura));
        System.out.println("PERIMETRO = " +rectangle.perimeter(rectangle.largura, rectangle.altura));
        System.out.println("DIAGONAL = " + rectangle.diagonal(rectangle.largura, rectangle.altura));
        */

        sc.close();
    }


}