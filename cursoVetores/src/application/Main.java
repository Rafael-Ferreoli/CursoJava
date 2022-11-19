package application;

import entitites.Aluguel;
import entitites.Pessoa;
import entitites.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //EXERCICIO DESAFIO
        Aluguel[] vectHotel = new Aluguel[10];
        System.out.println("DIGITE QUANTOS QUARTOS VAO SER ALUGADOS:");
        int qtQuartos = sc.nextInt();
        for (int i = 1; i <= qtQuartos; i++) {
            System.out.println("ALUGUEL #" + i + ":");
            System.out.println("DIGITE SEU NOME:");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("DIGITE SEU EMAIL");
            String email = sc.nextLine();
            System.out.println("DIGITE SEU QUARTO");
            int quartoNum = sc.nextInt();
            vectHotel[quartoNum] = new Aluguel(nome,email,quartoNum);
        }

        System.out.println("QUARTOS ALUGUADOS:");
        for (int i = 0; i < vectHotel.length; i++) {
            if(vectHotel[i] != null) {
                System.out.println(vectHotel[i].toString());
            }
        }





    /*
        //EXERCICIO VETOR 3 E 8
        System.out.println("digite quantas pessoas voce vai digitar");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];
        System.out.println("EXERCICIO 3 OU 8? 3/8");
        char c = sc.next().charAt(0);
        if (c == '3') {
            for (int i = 0; i < vect.length; i++) {
                sc.nextLine();
                System.out.printf("DADOS DA %da PESSOA:", i + 1);
                System.out.println("NOME:");
                String nome = sc.nextLine();
                System.out.println("IDADE:");
                int idade = sc.nextInt();
                System.out.println("ALTURA:");
                double altura = sc.nextDouble();
                vect[i] = new Pessoa(nome, idade, altura);
            }

            double somaAltura = 0.0;
            for (int i = 0; i < vect.length; i++) {
                somaAltura += vect[i].getAltura();
            }

            double mediaAltura = 0.0;
            for (int i = 0; i < vect.length; i++) {
                mediaAltura = somaAltura / vect.length;
            }

            System.out.printf("ALTURA MEDIA: %.2f%n", mediaAltura);
            System.out.println("PESSOA COM MENOS DE 16 ANOS:");
            int menores = 0;
            for (int i = 0; i < vect.length; i++) {
                if (vect[i].getIdade() < 16) {
                    menores++;
                    System.out.println(vect[i].getNome());
                }
            }
            System.out.println("PERCENTUAL DE MENORES DE 16:");
            double percentualMenores = ((double)menores / vect.length) * 100.0;
            System.out.println(percentualMenores);
        }else{
            for (int i = 0; i < vect.length; i++) {
                sc.nextLine();
                System.out.printf("DADOS DA %da PESSOA:", i + 1);
                System.out.println("NOME:");
                String nome = sc.nextLine();
                System.out.println("IDADE:");
                int idade = sc.nextInt();
                vect[i] = new Pessoa(nome, idade);
            }

            int idadeMaisVelha = 0;
            String nomeMaisVelha = null;
            for (int i = 0; i < vect.length; i++) {
                if(idadeMaisVelha < vect[i].getIdade()){
                    idadeMaisVelha = vect[i].getIdade();
                    nomeMaisVelha = vect[i].getNome();
                }
            }

            System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelha + " " + idadeMaisVelha + " anos");

        }
*/
        /*
        //EXERCICIO VETOR 5
        System.out.println("digite quantos valores vao ter cada vetor");
        int n = sc.nextInt();
        int [] vect1 = new int[n];
        int [] vect2 = new int[n];
        int [] vect3 = new int[n];
        System.out.println("PREENCHA O PRIMEIRO VETOR:");
        for(int i=0;i< vect1.length;i++){
            vect1[i] = sc.nextInt();
        }

        System.out.println("PREENCHA O SEGUNDO VETOR:");
        for(int i=0;i< vect2.length;i++){
            vect2[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for(int i=0;i< vect3.length;i++){
            System.out.println(vect3[i] = vect1[i] + vect2[i]);
        }
        */
        /*
        //EXERCICIO VETOR 6
        System.out.println("digite quantos valores vao ter cada vetor");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double somaVet = 0, mediaVet = 0;
        System.out.println("PREENCHA O VETOR:");
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
            somaVet += vect[i];
        }

        mediaVet = somaVet / vect.length;
        System.out.println("MEDIA DO VETOR: " + mediaVet);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < mediaVet){
                System.out.println(vect[i]);
            }
        }
        */
/*
        //EXERCICIO VETOR 4 E 7
        System.out.println("digite quantos numeros vc vai digitar");
        int n = sc.nextInt();
        int [] vect = new int[n];
        for(int i=0;i< vect.length;i++){
            System.out.println("DIGITE UM NUMERO:");
            vect[i] = sc.nextInt();
        }

        double somaPares = 0, mediaPares = 0;
        int contadorPares = 0;
        System.out.println("NUMERO PARES:");
        for (int i=0;i< vect.length;i++){
            if(vect[i]%2==0){
                System.out.println(vect[i]);
                contadorPares++;
                somaPares += vect[i];
            }
        }

        mediaPares = somaPares/contadorPares;

        if (contadorPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        }else {
            System.out.println("QUANTIDADE DE PARES: " + contadorPares);
            System.out.println("MEDIA DOS PARES: " + mediaPares);
        }
*/
/*
        //EXERCICIO VETOR 2
        System.out.println("digite quantos numero voce vai digitar");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
        }
        System.out.println("VALORES:");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%2f%n", vect[i]);
        }
        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }
        double media = 0;
        media = soma / vect.length;
        System.out.println("SOMA: " + soma);
        System.out.println("MEDIA: " + media);
        */
        /*
        //EXERCICIO VETOR 1
        System.out.println("digite o tamanho do vetor ate 10");
        int n = sc.nextInt();
        int[] vect = new int[n];
        for (int i=0;i<vect.length;i++){
            vect[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for(int i=0;i< vect.length;i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
        ]*/
        /*
        //VETOR TIPO REFERENCIA(CLASSE)
        int n = sc.nextInt();
        Produtos[] vect = new Produtos[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Produtos(name, price);
        }
        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }
        double media = soma / vect.length;
        System.out.printf("%2f%n", media);
*/

        /*
        // VETOR TIPO VALOR(PRIMITIVO)
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        double media = soma / n;
        System.out.printf("%2f%n", media);
*/

        sc.close();
    }
}