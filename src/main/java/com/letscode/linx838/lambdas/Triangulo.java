package com.letscode.linx838.lambdas;

public class Triangulo implements FormaGeometrica {

    private long base;
    private long altura;

    public Triangulo(long base, long altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public long calculaArea(Integer a) {
        return base * altura / 2;
    }


}
