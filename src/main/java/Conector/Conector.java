
package Conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
      // Librería de MySQL
    private String driver = "org.mariadb.jdbc.Driver";

    // Nombre de la base de datos
    private String database = "sussana";

    // Host
    private String hostname = "localhost";

    // Puerto
    private String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    private String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;


    // Nombre de usuario
    private String username = "susana";

    // Clave de usuario
    private String password = "patata";

    private Connection conn = null;

    public Connection conectarMySQL() {

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);

            if (conn != null) {
                System.out.println("\nConexion exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Algo no funcionó en el Conector" + e.toString());
        }

        return conn;
    }

    public void cerrar() {
        try {
            conn.close();
            System.out.println("Conexión cerrada");
        } catch (SQLException ex) {
            System.err.println("Error al cerrar la conexión" + ex.toString());
        }
    }
}
