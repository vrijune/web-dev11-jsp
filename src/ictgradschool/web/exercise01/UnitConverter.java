package ictgradschool.web.exercise01;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UnitConverter extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //TODO: add all necessary code here to process the form data and display the original and converted units within the .jsp file

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
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
