package ictgradschool.web.exercise01;

import ictgradschool.web.labexamples.example01.CarAdJavaBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "unitconverter", urlPatterns = {"/unitconverter"} )
public class UnitConverter extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //TODO: add all necessary code here to process the form data and display the original and converted units within the .jsp file


        String kilos = req.getParameter("kilos");
        String celsius = req.getParameter("celsius");

        req.setAttribute("kilos", kilos );
        req.setAttribute("celsius", celsius);
        req.setAttribute("pounds", kilogramsToPounds(Double.parseDouble(kilos)));
        req.setAttribute("fahrenheit", convertCelsiusToFahrenheit(Double.parseDouble(celsius)));
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/exercise01/exercise01.jsp");
        dispatcher.forward(req, resp);


    }

    public double kilogramsToPounds(double kilograms) {
        double pounds = 0.0;
        pounds = kilograms * 2.20462;
        return pounds;
    }

    public double convertCelsiusToFahrenheit(double celsius) {
        double farenheit = 0.0;
        farenheit = 32 + (9 * celsius) / 5.0;
        return farenheit;
    }

}
