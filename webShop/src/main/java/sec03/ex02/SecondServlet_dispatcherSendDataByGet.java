package sec03.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet_dispatcherSendDataByGet
 */
@WebServlet("/seconddispatcher2")
public class SecondServlet_dispatcherSendDataByGet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out =  response.getWriter();
		String name = request.getParameter("name");
		out.print("<html><body>");
		out.print("dispatcer를 이용한 forward 받기");
		out.print("<br> 이름 : " + name);
		out.print("</body></html>");
	}

}
