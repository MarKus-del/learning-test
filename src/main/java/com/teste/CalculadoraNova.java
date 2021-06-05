package com.teste;

import java.util.Arrays;

public class CalculadoraNova {

    public int somar(int ...valores) {
        return Arrays.stream(valores).reduce(0, (acumulador, value) -> acumulador += value);
    }
}
