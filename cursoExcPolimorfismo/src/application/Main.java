package application;

import entitites.ImportedProduct;
import entitites.Product;
import entitites.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("ENTRE COM O NUMERO DE PRODUTOS: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("PRODUTO #" + i);
            System.out.print("NOME: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("PRECO: ");
            Double price = sc.nextDouble();
            System.out.print("COMUM, USADO OU IMPORTADO? c/u/i ");
            char ch = sc.next().charAt(0);
            if (ch == 'i') {
                System.out.println("TAXA DE IMPORTAÇÃO: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else if (ch == 'c') {
                list.add(new Product(name, price));
            } else if (ch == 'u') {
                System.out.print("DIGITE A DATA (DD/MM/AAAA) ");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProduct(name,price,manufactureDate));
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO: ");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}