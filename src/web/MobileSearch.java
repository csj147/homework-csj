package web;

import dao.*;
import entity.Mobile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/mobile/s")
public class MobileSearch extends HttpServlet {

    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("4324");
    }

    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String name = req.getParameter("name").toLowerCase();

        MobileDAO mobileDao = new MobileInMemoryDAO();

        List<Mobile> mobiles = new ArrayList<>();

        for (Mobile mobile : mobileDao.listAll()){

            String Name = mobile.getName().toLowerCase();

            if(Name.contains(name)){
                mobiles.add(mobile);
            }
        }
        
        req.setAttribute("mobiles",mobiles);
        req.getRequestDispatcher("/WEB-INF/jsp/mobile_list.jsp").forward(req,resp);
    }
}
