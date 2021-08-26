package com.company.generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {

        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(2.3);
        System.out.println(caixaA);

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(123);
        System.out.println(caixaB);
    }
}
