package cap19;

import java.sql.*;

public class TesteConexao {

    // endeço de concexão com o banco
    static String url = "jdbc:mysql://localhost:3306/impacta";
    static String usuario = "root";
    static String senha = "Imp@ct@";

    public static void abrirDB()  {

        try {
        String query = "select * from impacta.aluno";
        Connection conexao =
                DriverManager.getConnection(url, usuario, senha);

        Statement statement = conexao.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        }catch (SQLException e) {
            System.out.println(e);
        }
        System.out.println("Conexão com sucesso!!!");
    }

    public static void main(String[] args) {
        abrirDB();
    }
}
