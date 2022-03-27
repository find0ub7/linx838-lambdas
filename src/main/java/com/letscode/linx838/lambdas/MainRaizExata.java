package com.letscode.linx838.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainRaizExata {

    public static void main(String[] args) {
        List<Integer> numeros = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        //        1 - 100: 1, 4, 9, 25, 36, 49, ...100
        List<Integer> lista = filtraNumeros(numeros, (n) -> {
            double raiz = Math.sqrt(n);
            double raizPraCima = Math.ceil(raiz);
            return (raiz - raizPraCima == 0);
        });

        for (Integer num : lista) {
            System.out.println(num);
        }
    }

    private static List<Integer> filtraNumeros(List<Integer> numeros, CheckNumber checkNumber) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numeros) {
            if (checkNumber.check(number)) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }
}
