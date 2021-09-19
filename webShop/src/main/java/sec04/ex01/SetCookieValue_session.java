package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookieValue_session
 */
@WebServlet("/SetCookieValue_session")
public class SetCookieValue_session extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		Date d = new Date();
		Cookie c = new Cookie("cookieTest", URLEncoder.encode("Seesion Cookie Test","utf-8"));
		c.setMaxAge(-1);
		response.addCookie(c);
		
		out.println("now : "+d);
		
	}

	

}
