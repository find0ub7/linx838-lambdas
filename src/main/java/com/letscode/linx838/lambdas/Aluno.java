package com.letscode.linx838.lambdas;

import java.util.List;

public class Aluno {

    private String nome;
    private Integer idade;
    private String estado;
    private List<Integer> notas; //menor nota, maior nota, media notas

    public Aluno(String nome, Integer idade, String estado) {
        this.nome = nome;
        this.idade = idade;
        this.estado = estado;
    }

    public Aluno(String nome, Integer idade, String estado, List<Integer> notas) {
        this.nome = nome;
        this.idade = idade;
        this.estado = estado;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", estado='" + estado + '\'' +
                ", notas=" + notas +
                '}';
    }
}
