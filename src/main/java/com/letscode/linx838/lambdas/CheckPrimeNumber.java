package com.letscode.linx838.lambdas;

public class CheckPrimeNumber implements CheckNumber {
    @Override
    public boolean check(Integer number) {
        boolean isPrimo = true;
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (count > 1) {
                    isPrimo = false;
                    break;
                }
            }
        }
        return isPrimo;
    }
}
