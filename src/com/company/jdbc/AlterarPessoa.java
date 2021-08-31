package com.company.jdbc;

import java.sql.*;
import java.util.Scanner;

public class AlterarPessoa {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o código da pessoa: ");
        int codigo = entrada.nextInt();

        String select = "SELECT * FROM pessoas where codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, codigo);
        ResultSet resultado = stmt.executeQuery();

        if(resultado.next()){
            Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));

            System.out.println("O nome atual é: "+p.getNome());
            entrada.nextLine();

            System.out.print("Informe o novo nome: ");
            String novoNome = entrada.nextLine();

            stmt.close();
            stmt = conexao.prepareStatement(update);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            stmt.execute();

            System.out.println("Pessoa alterada com sucesso.");
        } else {
            System.out.println("Pessoa não encontrada.");
        }

        stmt.close();
        entrada.close();
        conexao.close();
    }
}
