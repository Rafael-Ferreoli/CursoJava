package application;

import entitites.*;
import entititesEnum.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "traveling to new zealand",
                "i'm going to visit this wonderful country",
                12);
        p1.addComment(c1);
        p1.addComment(c2);
        System.out.println(p1);

        
        /*
        //EXERCICIO 1


        System.out.print("Entre com o nome do departamento: ");
        String departmentName = sc.nextLine();
        System.out.println("Dados do trabalhador: ");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Salario: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("Quantos contratos esse trabalhador terá? ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("Entre com a data do contrato #" + i);
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duracao(horas): ");
            int horas = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valorPorHora, horas);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Entre com o mes e ano para calcular os ganhos (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Ganhos de " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
*/
        sc.close();
    }
}