
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {

    private static final String url = "jdbc:postgresql://localhost:5432/exam?currentSchema=public";
    private static final String user = "postgres";
    private static final String password = "root";
    private static Connection connection;


    static {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("khedmat");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
