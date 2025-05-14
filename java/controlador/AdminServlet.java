package controlador;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.IOException;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession sesion = req.getSession(false);
        String usuario = (String) sesion.getAttribute("usuario");
        String rol = (String) sesion.getAttribute("rol");

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h1>Hola ADMIN " + usuario + "</h1>");
        resp.getWriter().println("<p>Aquí irá el panel de administración del zoo 🛠️</p>");
        resp.getWriter().println("</body></html>");
    }
}
