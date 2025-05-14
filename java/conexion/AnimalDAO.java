package conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO {

    public List<Animal> obtenerTodos() {
        List<Animal> lista = new ArrayList<>();
        Connection conn = Conexion.getConexion();
        String sql = "SELECT * FROM animal";
         // 🔹 Obtener conexión primero

        if (conn == null) {
            System.out.println("❌ La conexión con la base de datos es NULL");
            return lista; // Evita error si la conexión falló
        }

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Animal a = new Animal();
                a.setId(rs.getInt("id"));
                a.setNombre(rs.getString("nombre"));
                a.setEspecie(rs.getString("especie"));
                a.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                a.setHistoriaMedica(rs.getString("historia_medica"));
                a.setDescripcion(rs.getString("descripcion"));
                a.setFoto(rs.getString("foto"));
                a.setRecintoId(rs.getInt("recinto_id"));
                lista.add(a);
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al obtener animales");
            e.printStackTrace();
        }

        return lista;
    }
}

