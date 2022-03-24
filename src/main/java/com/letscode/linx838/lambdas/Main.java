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
        pessoa.getNome();

        Function<Pessoa, Integer> mapeiaPessoaEmNome = Pessoa::getDobroIdade;

        formaGeometricas.add(new Quadrado(4));

        FormaGeometrica x = (a) -> 100;
        x.calculaArea(2);

        for (FormaGeometrica formaGeometrica : formaGeometricas) {
            System.out.println(formaGeometrica.calculaArea(1));
        }

    }

}
