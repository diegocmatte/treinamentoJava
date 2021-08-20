package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class DesafioMap {

    public static void main(String[] args) {

        /*
        1. Número para String binária.. 6 -> 110
        2. Reverter a String.. 110 -> 011
        3. Converter de volta para inteiro.. 011 -> 3
         */
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Consumer<Object> print = System.out::println;

        Function<Integer, String> primeiroBinario =
                num -> Integer.toBinaryString(num);

        UnaryOperator<String> inverteBinario =
                binario -> new StringBuilder(binario).reverse().toString();

        Function<String, Integer> voltaBinario =
                binario -> Integer.parseInt(binario,2);

        nums.stream()
                .map(primeiroBinario)
                .map(inverteBinario)
                .map(voltaBinario)
                .forEach(print);

        // solucao do desafio

        UnaryOperator<String> inverter =
                s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> binarioParaInt =
                s -> Integer.parseInt(s,2);

        System.out.println("\nSolução da aula");
        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);


    }
}
