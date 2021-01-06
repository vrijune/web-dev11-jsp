package ictgradschool.web.exercise05;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;

@WebServlet(name = "fileupload", urlPatterns = {"/fileupload"} )
public class FileUpload extends HttpServlet {
    private File uploadsFolder;
    private File tempFolder;
    private final String imagesRelativePath = "/images";
    private final List<String> acceptableMimeTypes = Arrays.asList("image/png", "image/jpeg");

    @Override
    public void init() throws ServletException {
        super.init();

        // Get the upload folder, ensure it exists.
        this.uploadsFolder = new File(getServletContext().getRealPath(imagesRelativePath));
        if (!uploadsFolder.exists()) {
            uploadsFolder.mkdirs();
        }

        // Create the temporary folder that the file-upload mechanism needs.
        this.tempFolder = new File(getServletContext().getRealPath("/WEB-INF/temp"));
        if (!tempFolder.exists()) {
            tempFolder.mkdirs();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setSizeThreshold(4 * 1024);
        factory.setRepository(tempFolder);
        ServletFileUpload upload = new ServletFileUpload(factory);




        try {
            List<FileItem> fileItems = upload.parseRequest(req);
            File fullsizeImageFile = null;

            for (FileItem fi : fileItems) {
                if (!fi.isFormField() && acceptableMimeTypes.contains(fi.getContentType())) {
                    String fileName = fi.getName();
                    fullsizeImageFile = new File(uploadsFolder, fileName);
                    fi.write(fullsizeImageFile);
                }
            }

        } catch (Exception e) {
            throw new ServletException(e);
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ImageGallery");
        dispatcher.forward(req, resp);

    }
}


