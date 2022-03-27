package com.letscode.linx838.lambdas;

public class CheckEvenNumber implements CheckNumber {
    @Override
    public boolean check(Integer number) {
        return number % 2 == 0;
    }
}
