package sec04.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SetAttribute")
public class SetAttribute extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String ctxMsg = "context Message";
		String sesMsg = "Session Message";
		String reqMsg = "request Message";
		
		ServletContext ctx = getServletContext();
		HttpSession session = request.getSession();
		
		ctx.setAttribute("context", ctxMsg);
		session.setAttribute("session", sesMsg);
		request.setAttribute("request", reqMsg);
		
		out.print("success binding");
		
	}

	

}
