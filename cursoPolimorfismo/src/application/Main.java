package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("ENTRE COM O NUMERO DE EMPREGADOS: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("EMPREGADO #" + i);
            System.out.print("EMPREGADO TERCEIRIZADO? (s/n)");
            char ch = sc.next().charAt(0);
            System.out.println("NOME: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("HORAS: ");
            int hours = sc.nextInt();
            System.out.println("VALOR POR HORA: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 's') {
                System.out.println("TAXA ADICIONAL: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAGAMENTOS:");
        for (Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}