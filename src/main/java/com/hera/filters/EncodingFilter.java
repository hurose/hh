package com.hera.filters;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EncodingFilter implements Filter {
    String encoding="UTF-8";
    public void destroy() {

    }

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest arg0=(HttpServletRequest) servletRequest;
        HttpServletResponse arg1=(HttpServletResponse) servletResponse;
        arg0.setCharacterEncoding("UTF-8");
        arg1.setCharacterEncoding("UTF-8");
        arg1.setContentType("text/html;charset="+encoding);
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
