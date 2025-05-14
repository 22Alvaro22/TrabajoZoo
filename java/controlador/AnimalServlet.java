package controlador;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
import conexion.Animal;
import conexion.AnimalDAO;

@WebServlet("/animales")

public class AnimalServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        AnimalDAO dao = new AnimalDAO();
        List<Animal> lista = dao.obtenerTodos();

        request.setAttribute("animales", lista);
        request.getRequestDispatcher("animales.jsp").forward(request, response);
    }
}
