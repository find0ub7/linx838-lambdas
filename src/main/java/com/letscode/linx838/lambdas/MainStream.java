package com.letscode.linx838.lambdas;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

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
        Aluno aluno41 = new Aluno("fulano4.1", 18, "SE");
        Aluno aluno5 = new Aluno("fulano5", 1, "CE");

        Stream<Aluno> alunosStream = Stream.of(aluno1, aluno2, aluno3, aluno4, aluno41, aluno5);
//        int somaIdadesAlunosMaiores = alunosStream
//                .filter(aluno -> aluno.getIdade() >= 18)
//                .mapToInt(Aluno::getIdade)
//                .sum();

//        System.out.println(somaIdadesAlunosMaiores);

//        alunosStream.sorted(
//                        comparing(Aluno::getIdade).reversed()
//                                .thenComparing(Aluno::getEstado))
//                .forEach(System.out::println);

        List<Integer> numerosRepetidos = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        numerosRepetidos.addAll(numerosRepetidos);
//        System.out.println(numerosRepetidos);
//        numerosRepetidos.stream().distinct().forEach(System.out::println);

        Aluno fulano = new Aluno("fulano", 10, "SP", List.of(10, 9, 5));
        Aluno beltrano = new Aluno("beltrano", 15, "PR", List.of(1, 7, 8));


        List<List<Integer>> listaDeNotas = Stream.of(fulano, beltrano)
                .map(aluno -> aluno.getNotas())
                .collect(Collectors.toList());

//        System.out.println("Lista de Notas: " + listaDeNotas);

        List<Integer> notas = Stream.of(fulano, beltrano)
                .flatMap(aluno -> aluno.getNotas().stream())
                .collect(Collectors.toList());

//        System.out.println("Notas: " + notas);

        //parenteses
        //boxed -> wrap de primitivo pra wrapper (Objeto): int -> Integer
        //unboxed -> processo inverso: Integer -> int

        //Operacoes terminais

        List<Integer> conjuntoNumeros = numerosRepetidos.stream()
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println(conjuntoNumeros);

        Map<Integer, Integer> dobroNumberos = numerosRepetidos.stream().distinct()
                .collect(Collectors.toMap(Function.identity(), numero -> 2 * numero));

        System.out.println(dobroNumberos);

        Map<Integer, Integer> mapa = new HashMap<>();
        mapa.put(1, 10);
        mapa.put(1, 100);
        System.out.println(mapa);

        Map<Boolean, List<Integer>> numerosPorParOuImpar =
                numerosRepetidos.stream().collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println(numerosPorParOuImpar);

        String numerosConcatenados = numerosRepetidos.stream().map(Object::toString)
                .collect(Collectors.joining(";"));

        System.out.println(numerosConcatenados);

        Integer somatoria = numerosRepetidos.stream().reduce(0, Integer::sum);
        System.out.println(somatoria);

        long count = numerosRepetidos.stream().filter(n -> n % 2 == 0).count();
        System.out.println(count);

        numerosRepetidos.add(11);
        boolean todosMenoresQue10 = numerosRepetidos.stream().allMatch(integer -> integer <= 10);
        System.out.println(todosMenoresQue10);

        boolean algumMenorIgualQue10 = numerosRepetidos.stream().anyMatch(integer -> integer > 11 || integer == 11);
        System.out.println(algumMenorIgualQue10);

        Optional<Integer> primeiroPar = numerosRepetidos.stream().filter(n -> n % 2 == 0).findFirst();
        System.out.println(primeiroPar);

        Optional<Integer> qualquerPar = numerosRepetidos.stream().filter(n -> n % 2 == 0).findAny();
        System.out.println(qualquerPar);

        Optional<Integer> max = numerosRepetidos.stream().max(comparing(Integer::intValue));
        System.out.println(max);

        Optional<Integer> min = numerosRepetidos.stream().min(comparing(Integer::intValue));
        System.out.println(min);

        OptionalDouble average = List.of(1, 2, 3).stream().mapToInt(Integer::intValue).average();
        System.out.println(average);

        //relacao de sumarizacao de notas dos alunos
        Stream.of(fulano, beltrano) //List<Aluno> -> List<SumarizacaoNotas>
                .map(aluno -> mapToSumarizacaoNotas(aluno))
                .forEach(System.out::println);
    }

    private static SumarizacaoNotas mapToSumarizacaoNotas(Aluno aluno) {
        List<Integer> notas = aluno.getNotas();
        Integer menorNota = notas.stream().min(comparing(Integer::intValue)).orElse(0);
        Integer maiorNota = notas.stream().max(comparing(Integer::intValue)).orElse(0);
        Double mediaNota = notas.stream().mapToInt(Integer::intValue).average().orElse(0);

        return new SumarizacaoNotas(aluno.getNome(), menorNota, maiorNota, mediaNota);
    }
}
