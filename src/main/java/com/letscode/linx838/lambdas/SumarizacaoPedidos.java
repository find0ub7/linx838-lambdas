package com.letscode.linx838.lambdas;

public class SumarizacaoPedidos {

    private String vendedor;
    private Double valorTotal;
    private Integer quantidadeTotal;

    public SumarizacaoPedidos(String vendedor, Double valorTotal, Integer quantidadeTotal) {
        this.vendedor = vendedor;
        this.valorTotal = valorTotal;
        this.quantidadeTotal = quantidadeTotal;
    }

    @Override
    public String toString() {
        return "SumarizacaoPedidos{" +
                "vendedor='" + vendedor + '\'' +
                ", valorTotal=" + valorTotal +
                ", quantidadeTotal=" + quantidadeTotal +
                '}';
    }
}
