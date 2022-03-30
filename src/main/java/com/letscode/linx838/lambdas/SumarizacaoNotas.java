package com.letscode.linx838.lambdas;

public class SumarizacaoNotas {

    private String aluno;
    private Integer menorNota;
    private Integer maiorNota;
    private Double mediaNota;

    public SumarizacaoNotas(String aluno, Integer menorNota, Integer maiorNota, Double mediaNota) {
        this.aluno = aluno;
        this.menorNota = menorNota;
        this.maiorNota = maiorNota;
        this.mediaNota = mediaNota;
    }

    @Override
    public String toString() {
        return "SumarizacaoNotas{" +
                "aluno='" + aluno + '\'' +
                ", menorNota=" + menorNota +
                ", maiorNota=" + maiorNota +
                ", mediaNota=" + mediaNota +
                '}';
    }
}
