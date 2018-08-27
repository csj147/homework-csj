package web;

import dao.*;
import entity.Mobile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/mobile/del")
public class MobileDel extends HttpServlet {

    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        int id = Integer.parseInt(req.getParameter("id"));

        MobileDAO mobileDAO = new MobileInMemoryDAO();

        mobileDAO.delete(id);

        resp.sendRedirect("/mobile/list");
    }
}
