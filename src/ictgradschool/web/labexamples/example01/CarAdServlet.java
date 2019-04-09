package ictgradschool.web.labexamples.example01;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CarAdServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CarAdJavaBean carAd = new CarAdJavaBean();

        carAd.setCarModel(request.getParameter("carModel"));
        carAd.setDescription(request.getParameter("description"));
        carAd.setCarPrice(Integer.parseInt(request.getParameter("price")));

        request.setAttribute("carAd", carAd);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/example01/car-ad.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}
