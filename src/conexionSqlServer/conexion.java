
package conexionSqlServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    public static Connection getConnection() {

        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=bd_gjelperfums;"
                + "user=sa;"
                + "password=database;"
                + "loginTimeout=30;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";

        try {
            Connection con = DriverManager.getConnection(conexionUrl);
            System.out.println("Conexion exitosa");
            return con;

        } catch (SQLException e) {
            System.out.println("Error de conexion: " + e.getMessage());
            return null;
        }
    }
}

