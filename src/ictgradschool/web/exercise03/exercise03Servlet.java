package ictgradschool.web.exercise03;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "exercise03", urlPatterns = {"/userdetails"})

public class exercise03Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String type = req.getParameter("userType");
        req.setAttribute("firstName", firstName);
        req.setAttribute("lastName", lastName);
        req.setAttribute("type", type);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/exercise03/exercise03.jsp");
        dispatcher.forward(req, resp);



    }
}
