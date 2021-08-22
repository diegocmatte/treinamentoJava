package com.company.excecao;

public class Aluno {

    public final String nome;
    public final double nota;
    public final boolean bomComportamento;

    public Aluno(String nome, double nota) {
        this(nome,nota,true);
    }

    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    public String toString() {
        return nome + " tem nota "+ nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        if (Double.compare(aluno.nota, nota) != 0) return false;
        if (bomComportamento != aluno.bomComportamento) return false;
        return nome != null ? nome.equals(aluno.nome) : aluno.nome == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nome != null ? nome.hashCode() : 0;
        temp = Double.doubleToLongBits(nota);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (bomComportamento ? 1 : 0);
        return result;
    }
}
