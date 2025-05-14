package controlador;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import conexion.Conexion;
import java.sql.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");

        try (Connection con = Conexion.getConexion()) {
            String sql = "SELECT rol FROM empleado WHERE nombre_usuario = ? AND hash_contrasena = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, clave);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String rol = rs.getString("rol");

                HttpSession sesion = request.getSession();
                sesion.setAttribute("usuario", usuario);
                sesion.setAttribute("rol", rol);

                if (rol.equals("ADMIN")) {
                    response.sendRedirect("admin");
                } else {
                    response.sendRedirect("animales");
                }
            } else {
                request.setAttribute("error", "Usuario o contraseña incorrectos.");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("login.jsp");
        }
    }
}
