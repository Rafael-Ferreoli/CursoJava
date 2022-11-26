package entitites;

import entititesEnums.OrderStatus;

import java.util.Date;

public class OrderItem {
    private Integer quantidade;
    private double preco;
    private Produtos produtos;

    public OrderItem() {

    }

    public OrderItem(Integer quantidade, double preco, Produtos produtos    ) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produtos = produtos;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        preco = preco;
    }

    public double subTotal(){
        return preco*quantidade;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return produtos.getNome()
                + ", $"
                + String.format("%.2f", preco)
                + ", Quantity: "
                + quantidade +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
