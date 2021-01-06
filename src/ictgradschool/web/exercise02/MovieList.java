package ictgradschool.web.exercise02;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "exercise02", urlPatterns = {"/movies"})
public class MovieList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] movies = req.getParameterValues("movies");
        String names = req.getParameter("name");
        req.setAttribute("movies", movies);
        req.setAttribute("names", names);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/exercise02/exercise02.jsp");
        dispatcher.forward(req, resp);


    }
}
