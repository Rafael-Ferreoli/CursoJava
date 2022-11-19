package application;

import entities.Banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Banco banco;
        System.out.println("digite o numero da sua conta");
        int numConta = sc.nextInt();
        System.out.println("digite o nome do titular");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        System.out.println("deseja colocar um saldo inicial na conta? s/n");
        char verificar = sc.nextLine().charAt(0);
        double depositoInicial = 0;
        if(verificar == 's') {
            System.out.println("digite o deposito inicial da conta");
            depositoInicial = sc.nextDouble();
            banco = new Banco(numConta, nomeTitular, depositoInicial);
        }else{
            banco = new Banco(numConta, nomeTitular);
        }

        System.out.println(banco);

        System.out.println("Deseja depositar qual valor?");
        double deposito = sc.nextDouble();
        banco.depositarValor(deposito);

        System.out.println(banco);

        System.out.println("Deseja retirar qual valor");
        double retirada = sc.nextDouble();
        banco.retirarValor(retirada);

        System.out.println(banco);


        sc.close();
    }
}