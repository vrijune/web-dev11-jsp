package ictgradschool.web.labexamples.example03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.util.Iterator;
import java.util.Map;

@WebServlet(name = "example03", urlPatterns = {"/example03"} )
public class ParameterMapExample extends HttpServlet {
    static final Logger logger = LogManager.getLogger();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //This has not been used in any activities but it shows how you can
        //create a parameter map to loop through parameters from forms

        Map<String, String[]> map = request.getParameterMap();
        Iterator i = map.entrySet().iterator();

        while (i.hasNext()) {
            Map.Entry pair = (Map.Entry) i.next();
            String[] values = (String[]) pair.getValue();
            logger.info(pair.getKey() + " = " + values[0]);
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/lab-examples/parameter-map-submitted.html");
        dispatcher.forward(request, response);

    }
}
