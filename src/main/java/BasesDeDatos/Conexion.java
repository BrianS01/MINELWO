package BasesDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection cnx = null;

    public Connection obtener() throws SQLException {
        if (cnx == null || cnx.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/mundulery", "root", "nogamenolife");

                if (cnx != null) {
                    System.out.println("Conexión realizada con exito");
                }
            } catch (SQLException ex) {
                System.err.println("Se presento una SQLException");
            } catch (ClassNotFoundException ex) {
                System.err.println("Se presento una ClassNotFoundException");
            }
        }

        return cnx;
    }

    public void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
}
