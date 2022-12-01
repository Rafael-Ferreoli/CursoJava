package application;

import entitites.Company;
import entitites.Individual;
import entitites.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<TaxPayer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("DIGITE O NUMERO DE PAGADORES DE TAXAS: ");
        int n = sc.nextInt();
        for (int i = 1; i<= n; i++){
            System.out.println("PAGADOR #" + i);
            System.out.print("PESSOA JURÍDICA OU FÍSICA? (j/f) ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("NOME: ");
            String name = sc.nextLine();
            System.out.print("GANHOS ANUAIS: ");
            Double anualIncome = sc.nextDouble();
            if (ch == 'f'){
                System.out.print("GASTOS COM SAÚDE: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name,anualIncome,healthExpenditures));
            } else if (ch == 'j') {
                System.out.print("NUMEROS DE FUNCIONARIOS: ");
                int numberOfEmployee = sc.nextInt();
                list.add(new Company(name,anualIncome,numberOfEmployee));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXAS PAGAS: ");
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TAXAS TOTAIS: $ " + String.format("%.2f", sum));
        sc.close();
    }
}