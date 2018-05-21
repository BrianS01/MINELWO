import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{
    private Connection cnx = null;

    
    public Connection obtener()
    {
        if (cnx == null)
	{
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/mundulery", "root", "nogamenolife");
                
                if (cnx != null)
                {
                    System.out.println("Conexión realizada con exito");
                }
            } catch (SQLException ex)
            {
                System.err.println("Se presento una SQLException");
            }
            catch (ClassNotFoundException ex)
            {
                System.err.println("Se presento una ClassNotFoundException");
            }
        }

        return cnx;
    }

    
    public void cerrar() throws SQLException
    {
        if (cnx != null)
        {
            cnx.close();
        }
    }
    /*
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Puente creado
        Connection cnx = obtener();
        String sql = "SELECT a.idAlbum, a.nombreAlbum, i.nombreInterprete "
                + "FROM album as a , interprete as i  "
                + "where a.idInterprete = i.idInterprete ";

        PreparedStatement ps = cnx.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Album album = null;
        List<Album> albumes = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt(1);
            String nombreAlbum = rs.getString(2);
            String nombreIinterprete = rs.getString(3);
            album = new Album(id, nombreAlbum, nombreIinterprete);

            albumes.add(album);
           
        }
        System.out.println("FUERA DEL WHILE " + albumes.get(0).getIdAlbum() + " NombreAlbum:" + albumes.get(0).getNombreAlbum()
                + " Interprete: " + albumes.get(0).getNombreInterprete());

        System.out.println("FUERA DEL WHILE " + albumes.get(1).getIdAlbum() + " NombreAlbum:" + albumes.get(1).getNombreAlbum() + " Interprete: "
                + albumes.get(1).getNombreInterprete());

        if (rs != null) {
            rs.close();
        }

        if (ps != null) {
            ps.close();
        }

        if (cnx != null) {
            cnx.close();
        }

    }*/
}