package conexion;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static final String URL = "jdbc:mysql://localhost:3306/zoologico?useSSL=false&serverTimezone=UTC";

    private static final String USUARIO = "root";
    private static final String CLAVE = ""; // Usa tu contraseña aquí, si tienes una

    public static Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            if (conexion != null) {
                System.out.println("✅ Conexión OK");
            } else {
                System.out.println("❌ La conexión fue NULL");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("❌ No se encontró el driver JDBC");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar a la base de datos");
            e.printStackTrace();
        }
        return conexion;
    }
}

