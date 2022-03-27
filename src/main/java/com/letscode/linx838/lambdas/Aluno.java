package com.letscode.linx838.lambdas;

public class Aluno {

    private String nome;
    private Integer idade;
    private String estado;

    public Aluno(String nome, Integer idade, String estado) {
        this.nome = nome;
        this.idade = idade;
        this.estado = estado;
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

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", estado='" + estado + '\'' +
                '}';
    }
}
