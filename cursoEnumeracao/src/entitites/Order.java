package entitites;

import entititesEnums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> orderItem = new ArrayList<>();
    private Clientes clientes;


    public Order(){

    }

    public Order(Date moment, OrderStatus status, Clientes clientes) {
        this.moment = moment;
        this.status = status;
        this.clientes = clientes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public List<OrderItem> orderItem(){
        return orderItem;
    }

    public void addItem(OrderItem item){
        orderItem.add(item);
    }

    public void removeItem(OrderItem item){
        orderItem.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : orderItem) {
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(clientes + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : orderItem) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}

