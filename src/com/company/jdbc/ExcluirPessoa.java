package com.company.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o código para exclusão: ");
        int codigo = entrada.nextInt();

        String sql = "DELETE FROM pessoas WHERE codigo > ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        int contador = stmt.executeUpdate();

        if(contador > 0){
            System.out.println("Pessoa excluída com sucesso");
            System.out.println("Quantidade afetada: " + contador);
        } else {
            System.out.println("Nada feito.");
        }

        entrada.close();
        conexao.close();
    }
}
