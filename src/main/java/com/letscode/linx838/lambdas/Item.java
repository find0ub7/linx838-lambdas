package com.letscode.linx838.lambdas;

public class Item {

    private String codigo;
    private Integer quantidade;
    private Double valorTotal; //TOTAL

    public Item(String codigo, Integer quantidade, Double valorTotal) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codigo='" + codigo + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valorTotal +
                '}';
    }
}
