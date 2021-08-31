package com.company.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite parte do nome: ");
        String nomePessoa = entrada.nextLine();

        String sql = "SELECT * FROM PESSOAS WHERE nome LIKE '%" + nomePessoa + "%'";

        Statement statement = conexao.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while(resultSet.next()){
            int codigo = resultSet.getInt("codigo");
            String nome = resultSet.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p: pessoas) {
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }

        statement.close();
        entrada.close();
        conexao.close();
    }

    // verificar desafioResposta para comparar

}
