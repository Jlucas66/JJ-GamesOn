package br.ufrpe.JJGamesOn.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static final String URL = "mysql://root:eDc3b6agDG11-1-1-DB61CgEfac363hh@roundhouse.proxy.rlwy.net:39211/JJGamesOnBD";
    private static final String USUARIO = "root";
    private static final String SENHA = "eDc3b6agDG11-1-1-DB61CgEfac363hh";

    private static Connection conexao;

    // Método para obter a conexão
    public static Connection obterConexao() {
        try {
            // Registra o driver JDBC (opcional para versões recentes do JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Retorna a conexão
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }

    // Método para fechar a conexão
    public static void fecharConexao() {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão");
            }
        }
    }
}