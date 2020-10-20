package cn.itcast.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/heh")
public class servlet implements Servlet {
    //在servlet被创建的时候执行
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("sout");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    //在servletc每一次被访问的时候执行
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hehe");
    }

    @Override
    public String getServletInfo() {
        return null;
    }
    //在服务器正常关闭的时候执行
    @Override
    public void destroy() {
        System.out.println("soutend");
    }
}
