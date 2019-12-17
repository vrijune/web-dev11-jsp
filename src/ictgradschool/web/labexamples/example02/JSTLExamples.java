package ictgradschool.web.labexamples.example02;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "example02", urlPatterns = {"/example02"} )
public class JSTLExamples extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String[] exampleStrings = {"Java","JavaScript","CSS","HTML","SQL"};

        request.setAttribute("exampleStrings", exampleStrings);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/example02/example02.jsp");
        dispatcher.forward(request, response);
    }
}
