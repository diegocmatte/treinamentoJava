package com.company.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioResposta {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        System.out.println("Informe o valor para pesquisa: ");
        String valor = entrada.nextLine();

        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, "%" + valor + "%");
        ResultSet resultSet = statement.executeQuery();

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
}
