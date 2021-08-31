package com.company.jdbc;

public class DAOTeste {

    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
        System.out.println(dao.incluir(sql, "Joao da Silva", 1000));
        System.out.println(dao.incluir(sql, "Maria Ana", 1001));
        System.out.println(dao.incluir(sql, "Julia Pereira", 1002));

        dao.close();
    }
}
