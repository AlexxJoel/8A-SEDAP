package mx.edu.utez.sda.practicascriptservler.control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "PersonaServlet", value = "/PersonaServlet")
public class PersonaServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/persona/form.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String semblaza = req.getParameter("semblanza");

        req.setAttribute("nombreX", nombre);
        req.setAttribute("semblazaX", semblaza);

        req.getRequestDispatcher("/WEB-INF/persona/resultado.jsp").forward(req, resp);

    }
}
