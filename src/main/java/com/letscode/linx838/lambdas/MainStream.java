package com.letscode.linx838.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        Stream<Integer> stream = List.of(1, 3, 4).stream();
        Integer[] numeros = new Integer[]{1, 2, 3};
        Stream<Integer> numerosFromArray = Arrays.stream(numeros);

        List<Integer> numerosFiltrados = IntStream.rangeClosed(1, 10)
                .filter(value -> value % 2 == 0)
                .boxed() //int -> Integer
                .collect(Collectors.toList());

        System.out.println(numerosFiltrados);

        Aluno aluno1 = new Aluno("fulano1", 10, "SP");
        Aluno aluno2 = new Aluno("fulano2", 14, "SC");
        Aluno aluno3 = new Aluno("fulano3", 19, "GO");
        Aluno aluno4 = new Aluno("fulano4", 18, "SP");
        Aluno aluno5 = new Aluno("fulano5", 1, "CE");

        int somaIdadesAlunosMaiores = Stream.of(aluno1, aluno2, aluno3, aluno4, aluno5)
                .filter(aluno -> aluno.getIdade() >= 18)
                .mapToInt(Aluno::getIdade)
                .sum();

        System.out.println(somaIdadesAlunosMaiores);


//        System.out.println(nomes);
    }
}
