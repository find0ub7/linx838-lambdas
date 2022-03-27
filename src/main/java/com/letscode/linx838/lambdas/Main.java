package com.letscode.linx838.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        //dada uma lista de numeros inteiros, imprima somente os pares
        //dada uma lista de numeros inteiros, imprima somente os impares
        //dada uma lista de numeros inteiros, imprima somente os primos

        List<FormaGeometrica> formaGeometricas = new ArrayList<>();

        formaGeometricas.add(new Quadrado(2));
        formaGeometricas.add(new Triangulo(2, 3));
        formaGeometricas.add(Integer::longValue); //lambda simplifica utilizando a seta, o metodo vc usa o ::

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("fulano");
        pessoa.setIdade(10);

        Function<Pessoa, Integer> mapeiaPessoaEmNome = Pessoa::getDobroIdade;
        Integer dobroIdade = mapeiaPessoaEmNome.apply(pessoa);
//        System.out.println("Dobro da idade: " + dobroIdade);

        formaGeometricas.add(new Quadrado(4));

        FormaGeometrica x = (a) -> 100;
        x.calculaArea(2);

//        for (FormaGeometrica formaGeometrica : formaGeometricas) {
//            System.out.println(formaGeometrica.calculaArea(1));
//        }

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
//        printPrimo(numeros, new CheckPrimeNumber());
//        printEven(numeros, new CheckNumberEven());
        printNumberByCheck(numeros, (number) -> number % 2 != 0);
        printNumberByCheck(numeros, (number) -> number % 2 == 0);
        printNumberByCheck(numeros, new CheckPrimeNumber());
    }

    public static void printNumberByCheck(List<Integer> numbers, CheckNumber checkNumber) {
        for (Integer number : numbers) {
            if (checkNumber.check(number)) {
                System.out.println(number);
            }
        }
    }

    public static List<Integer> filtraNumeros(List<Integer> numbers, CheckNumber checkNumber) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (checkNumber.check(number)) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }

}
