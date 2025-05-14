package conexion;


import java.sql.Connection;

public class PruebaConexion {
    public static void main(String[] args) {
        try {
            Connection conn = Conexion.getConexion();
            if (conn != null) {
                System.out.println("✅ Conexión exitosa");
            } else {
                System.out.println("❌ Conexión fallida");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
