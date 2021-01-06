package ictgradschool.web.exercise04;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.File;
import java.io.IOException;

@WebServlet(name = "exercise04",  urlPatterns = {"/ImageGallery"})
public class ImageGallery extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        File imageFolder = new File(getServletContext().getRealPath("/images"));
        File[] files = imageFolder.listFiles();

        req.setAttribute("files", files);


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/exercise04/exercise04.jsp");
        dispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}


