package io.waxc.demo.webstarter.interceptor;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/*
A Servlet Filter is used in the web layer only, you can’t use it outside of a web context.
Interceptors can be used  for authentication of web pages you would use a servlet filter.
For security stuff in your business layer or logging/bugtracing (a.k.a. independent of the web layer)
filter executed first before loading interceptor
*/
@Component
public class SimpleFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain)
            throws IOException, ServletException {

        System.out.println("Remote Host:" + request.getRemoteHost());
        System.out.println("Remote Address:" + request.getRemoteAddr());
        filterchain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterconfig) throws ServletException {
    }
}