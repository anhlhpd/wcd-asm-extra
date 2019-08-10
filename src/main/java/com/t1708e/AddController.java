package com.t1708e;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class AddController extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(AddController.class.getSimpleName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/addphone.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        String price = req.getParameter("price");
        String description = req.getParameter("description");

        LOGGER.log(Level.INFO, name);

        Phone phone = Phone.Builder.aPhone()
                .withName(name).withBrand(brand).withPrice(price).withDescription(description)
                .build();
        ofy().save().entity(phone).now();
        resp.sendRedirect("/list");
    }
}
