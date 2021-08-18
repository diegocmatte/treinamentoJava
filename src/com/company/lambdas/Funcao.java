package com.company.lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Ímpar";
        System.out.println(parOuImpar.apply(32));

        Function<String, String> oResultadoEh =
                valor -> "O resultado é: "+ valor;

        //String resultadoFinal = parOuImpar.apply(32);

        Function<String, String> empolgado =
                valor -> valor + "!!!!!";

        Function<String, String> duvida =
                valor -> valor + "?????";

        String resultadoFinal1 = parOuImpar
                .andThen(oResultadoEh)
                .andThen(empolgado)
                .apply(32);

        String resultadoFinal2 = parOuImpar
                .andThen(oResultadoEh)
                .andThen(duvida)
                .apply(33);

        System.out.println(resultadoFinal1);
        System.out.println(resultadoFinal2);
    }
}
