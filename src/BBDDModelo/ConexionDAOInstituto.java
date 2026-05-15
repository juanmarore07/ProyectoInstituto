package BBDDModelo;
import java.sql.*;

public class ConexionDAOInstituto {
    private static final String URL = "jdbc:mysql://localhost:3306/instituto";
    private static final String USER = "root";
    private static final String PASSWORD = "juanma1973y4.";

    private static Connection concetarseABBDD() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }

}
