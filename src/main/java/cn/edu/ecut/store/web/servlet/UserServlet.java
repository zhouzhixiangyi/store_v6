package cn.edu.ecut.store.web.servlet;

import cn.edu.ecut.store.web.base.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends BaseServlet {


    public String registUI(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return "/jsp/register.jsp";
    }
}
