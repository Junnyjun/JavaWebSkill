package sec04.ex03;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class EncoderFilter
 */
@WebFilter("/*")
public class EncoderFilter implements Filter {
	ServletContext context;
   
    public EncoderFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("EncodeFilter DoFilter");
		request.setCharacterEncoding("utf-8");
		String context = ((HttpServletRequest)request).getContextPath();
		String pathInfo = ((HttpServletRequest)request).getRequestURI();
		String realPath = request.getRealPath(pathInfo);
		
		String msg = "Context Info : " + context
				+ "\n URL Info : " + pathInfo
				+ "\n physical path : "+realPath;
		
		System.out.println(msg);
		long begin = System.currentTimeMillis();
		
		chain.doFilter(request, response);
		
		long end = System.currentTimeMillis();
		System.out.println("work time : "+(end-begin)+"ms");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("utf-8 encoding filter");
		context = fConfig.getServletContext();
		
	}

}
