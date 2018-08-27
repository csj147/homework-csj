package web;

import dao.*;
import entity.Mobile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/mobile/list")
public class MobileList extends HttpServlet {

    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        MobileDAO mobileDao = new MobileInMemoryDAO();

        List<Mobile> mobiles = mobileDao.listAll();

        req.setAttribute("mobiles",mobiles);

        req.getRequestDispatcher("/WEB-INF/jsp/mobile_list.jsp").forward(req, resp);
    }
}
