package com.letscode.linx838.lambdas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainPedidos {

    public static void main(String[] args) {
        List<Item> itens1 = List.of(
                new Item("i1", 10, 100.0)
        );

        List<Item> itens2 = List.of(
                new Item("i2", 20, 200.0)
        );

        List<Item> itens3 = List.of(
                new Item("i3", 50, 500.0)
        );

        List<Pedido> pedidos = List.of(
                new Pedido("p1", "c1", "v1", itens1),
                new Pedido("p2", "c2", "v1", itens2),
                new Pedido("p3", "c1", "v2", itens3)
        );

        Map<String, SumarizacaoPedidos> sumarizacaoPorVendedor = pedidos.stream()
                .collect(Collectors.groupingBy(Pedido::getVendedor)) //Map<String, List<Pedido>>
                .entrySet() //Set<Entry<String, List<Pedido>>>
                .stream() //Map<String, List<Pedido>> -> Map<String, SumarizacaoPedidos>
                .map(entry -> mapToSumarizador(entry)) //Entry<String, List<Pedido> -> Entry<String, SumarizacaoPedido>
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));//        Map<String, SumarizacaoPedido>

        System.out.println(sumarizacaoPorVendedor);

    }

    private static Map.Entry<String, SumarizacaoPedidos> mapToSumarizador(Map.Entry<String, List<Pedido>> entry) {
        String vendedor = entry.getKey();
        List<Pedido> pedidos = entry.getValue();
        double valorTotal = pedidos.stream().mapToDouble(Pedido::getValorTotalItens).sum();
        int quantidadeTotal = pedidos.stream().mapToInt(Pedido::getQuantidadeTotal).sum();

        return Map.entry(vendedor, new SumarizacaoPedidos(vendedor, valorTotal, quantidadeTotal));
    }
}
