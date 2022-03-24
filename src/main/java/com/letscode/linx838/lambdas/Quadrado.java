package com.letscode.linx838.lambdas;

public class Quadrado implements FormaGeometrica {

    private long lado;

    public Quadrado(long lado) {
        this.lado = lado;
    }

    @Override
    public long calculaArea(Integer a) {
        return lado * lado;
    }

}
