package application;

import utilities.Emprego;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("QUANTOS EMPREGADOS SERAO REGISTRADOS?");
        int numEmp = sc.nextInt();
        List<Emprego> list = new ArrayList<>();
        for (int i = 0; i < numEmp; i++) {
            System.out.println("EMPREGADO #" + (i + 1) + ":");
            System.out.println("DIGITE O ID DO FUNCIONARIO");
            Integer id = sc.nextInt();
            while (testeId(list, id)){
                System.out.println("ID JA EXISTENTE, TENTE NOVIMENTE");
                id = sc.nextInt();
            }
            System.out.println("DIGITE O NOME DO FUNCIONARIO");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("DIGITE O SALARIO DO FUNCIONARIO:");
            Double salario = sc.nextDouble();
            Emprego emprego = new Emprego(id, nome, salario);
            list.add(emprego);
        }

        System.out.println("DIGITE O ID DO EMPREGADO QUE VAI TER O SALARIO AUMENTADO:");
        int idAumento = sc.nextInt();
        Emprego emprego = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
        if (emprego == null) {
            System.out.println("ESSE ID NAO EXISTE");
        } else {
            System.out.println("DIGITE A PORCENTAGEM DO AUMENTO");
            double porcento = sc.nextDouble();
            emprego.aumentarSalario(porcento);
        }

        System.out.println();
        System.out.println("LISTA DE EMPREGADOS:");
        for (Emprego emprego1 : list){
            System.out.println(emprego1);
        }

                /*
        //FUNCAO ALTERNATIVA PARA BUSCAR ELEMENTO NA LISTA NO FINAL DO CODIGO
        Integer pos = posicaoId(list,idAumento);
        if(pos == null){
            System.out.println("ESSE ID NAO EXISTE");
        }else{
            System.out.println("DIGITE A PORCENTAGEM DO AUMENTO:");
            double porcento = sc.nextDouble();
            list.get(pos).aumentarSalario(porcento);
        }

        System.out.println();
        System.out.println("LISTA DE EMPREGADOS:");
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        */





        /*
        //LIST EXEMPLOS
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("rafael");
        list.add("stefany");
        list.add("murilo");
        list.add(2, "joao");
        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("______");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("______________");
        System.out.println("posicao de murilo:" + list.indexOf("murilo"));
        System.out.println("posicao de asdasdsa:" + list.indexOf("asdasdsa"));

        System.out.println("______________");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'm').collect(Collectors.toList());
        result.add("marrocos");
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("______________");
        String name = list.stream().filter(x -> x.charAt(0) == 'm').findFirst().orElse(null);
        System.out.println(name);
        name = list.stream().filter(x -> x.charAt(0) == 'x').findFirst().orElse(null);
        System.out.println(name);

         */
    }

    public static boolean testeId(List<Emprego> list, int id){
        Emprego emprego = list.stream().filter(x->x.getId() == id).findFirst().orElse(null);
        return emprego != null;
    }

    public static Integer posicaoId (List<Emprego> list, int id){
        for (int i = 0; i< list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}