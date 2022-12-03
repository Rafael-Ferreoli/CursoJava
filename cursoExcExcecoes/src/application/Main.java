package application;

import model.entitites.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ENTRE COM OS DADOS DA CONTA: ");
            System.out.print("NUMERO: ");
            Integer number = sc.nextInt();
            sc.nextLine();
            System.out.print("NOME: ");
            String holder = sc.nextLine();
            System.out.print("BALANÇO INICIAL DA CONTA: ");
            Double balance = sc.nextDouble();
            System.out.print("LIMITE DE SAQUE: ");
            Double withdrawLimit = sc.nextDouble();
            Account account = new Account(number, holder, balance, withdrawLimit);
            System.out.print("ENTRE COM A QUANTIA PARA RETIRAR: ");
            Double ammount = sc.nextDouble();
            account.withdraw(ammount);
            System.out.println(account.getBalance());
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
    sc.close();
    }
}