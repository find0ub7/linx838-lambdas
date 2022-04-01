package com.letscode.linx838.lambdas;

import java.util.List;

public class Pedido {

    private String id;
    private String comprador;
    private String vendedor;
    private List<Item> itens;

    public Pedido(String id, String comprador, String vendedor, List<Item> itens) {
        this.id = id;
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public double getValorTotalItens() {
        return itens.stream().mapToDouble(Item::getValorTotal).sum();
    }

    public int getQuantidadeTotal() {
        return itens.stream().mapToInt(Item::getQuantidade).sum();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", comprador='" + comprador + '\'' +
                ", vendedor='" + vendedor + '\'' +
                ", itens=" + itens +
                '}';
    }
}
