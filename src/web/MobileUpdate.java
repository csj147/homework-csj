package web;

import dao.*;
import entity.Mobile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/mobile/update")
public class MobileUpdate extends HttpServlet {

    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        int id = Integer.parseInt(req.getParameter("id"));

        MobileDAO mobiledao = new MobileInMemoryDAO();

        Mobile mobile = mobiledao.getMobileById(id);

        req.setAttribute("mobile",mobile);

        req.getRequestDispatcher("/WEB-INF/jsp/mobile_update.jsp").forward(req,resp);
    }

    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        req.setCharacterEncoding("UTF-8");

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String storage = req.getParameter("storage");
        double in = Double.parseDouble(req.getParameter("in"));
        float money = Float.parseFloat(req.getParameter("money"));
        String color = req.getParameter("color");

        Mobile mobile = new Mobile(id,name,storage,in,money,color);

        MobileDAO mobileDao = new MobileInMemoryDAO();

        mobileDao.update(mobile);

        resp.sendRedirect("/mobile/list");
    }
}
