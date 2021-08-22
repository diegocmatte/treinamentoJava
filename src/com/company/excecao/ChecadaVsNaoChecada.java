package com.company.excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");

    }

    // Não checada ou não verificada
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro bem legal #1");
    }

    // Exceção verificada ou checada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro bem legal #2");
    }

    static void geraErro3() {
        try {
            throw new Exception("Ocorreu um erro bem legal #2");
        } catch (Exception e) {
            System.out.println("que legal!");
        }
    }
}
