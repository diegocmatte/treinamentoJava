package com.company.excecao.personalizadaA;

import com.company.excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        try{
            Aluno aluno = new Aluno("abc", -7.0);
            Validar.aluno(aluno);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException e){
            System.out.println(e.getMessage());
        }

        try{
            Aluno aluno = new Aluno("",8);
            Validar.aluno(aluno);
        } catch (StringVaziaException | NumeroForaIntervaloException e){
            System.out.println(e.getMessage());
        }

        try{
            Aluno aluno = null;
            Validar.aluno(aluno);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }
}
