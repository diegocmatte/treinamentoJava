package com.company.jdbc;

import java.sql.*;

public class CriarBanco {

    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=false";
        final String usuario = "root";
        final String senha = "123456";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java_2");


        conexao.close();
    }
}
