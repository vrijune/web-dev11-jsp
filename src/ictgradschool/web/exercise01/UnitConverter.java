package ictgradschool.web.exercise01;

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
