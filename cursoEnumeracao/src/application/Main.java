package application;

import entitites.Clientes;
import entitites.Order;
import entitites.OrderItem;
import entitites.Produtos;
import entititesEnums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 17871249754
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("ENTRE COM OS DADOS DO CLIENTE:");
        System.out.println("NOME:");
        String nome = sc.nextLine();
        System.out.println("EMAIL:");
        String email = sc.nextLine();
        System.out.println("DATA DE NASCIMENTO: (DD/MM/YYYY)");
        Date aniversario = sdf.parse(sc.next());
        Clientes clientes = new Clientes(nome, email, aniversario);


        System.out.println("ENTRE COM OS DADOS DO PEDIDO:");
        System.out.print("STATUS: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(), status, clientes);

        System.out.println("QUANTOS PRODUTOS VOCE IRA PEDIR?");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("ENTRE COM OS DADOS DO #" + i + " PEDIDOS:");
            System.out.println("NOME DO PRODUTO:");
            String nomeProduto = sc.nextLine();
            System.out.println("PRECO DO PRODUTO:");
            Double precoProduto = sc.nextDouble();
            Produtos produtos = new Produtos(nomeProduto, precoProduto);
            System.out.println("QUANTIDADE DO PRODUTO:");
            int quantidadeProduto = sc.nextInt();
            sc.nextLine();
            OrderItem orderItem = new OrderItem(quantidadeProduto, precoProduto, produtos);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("SUMARIO DO PEDIDO:");
        System.out.println(order);

        sc.close();
    }
}