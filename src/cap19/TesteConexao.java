package cap19;

import java.sql.*;

public class TesteConexao {

    // endeço de concexão com o banco
    static String url = "jdbc:mysql://localhost:3306/impacta";
    static String usuario = "root";
    static String senha = "Imp@ct@";

    public static void abrirDB() throws SQLException {

        Connection conexao = null;
        try {

            conexao = DriverManager.getConnection(url, usuario, senha);

            //Inserir no BD
            String queryInsert = "insert into aluno values (?,?,?,?)";
            PreparedStatement preparedStatement = conexao.prepareStatement(queryInsert);

                    // na tabela a ordem da coluna 1 é o campo idaluno
            preparedStatement.setNull(1, Types.INTEGER );

            // na tabela a ordem da coluna 2 é o campo nome
            preparedStatement.setString(2, "Inserido pelo jdbc");

            // na tabela a ordem da coluna 3 é o campo cpf
            preparedStatement.setString(3, "2365987496");

            // na tabela a ordem da coluna 3 é o campo matricula
            preparedStatement.setInt(4, 129);

            preparedStatement.executeUpdate();

            // consulta ao BD
            String querySelect = "select * from impacta.aluno";
            Statement statement = conexao.createStatement();
            ResultSet resultSet = statement.executeQuery(querySelect);
            while (resultSet.next()) {
                System.out.print("id: " + resultSet.getInt("idaluno"));
                System.out.print(" nome: " + resultSet.getString("nome"));
                System.out.print(" cpf: " + resultSet.getString("cpf"));
                System.out.print(" matricula: " + resultSet.getInt("matricula"));
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if (conexao != null) {
                conexao.close();
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        abrirDB();
    }
}
