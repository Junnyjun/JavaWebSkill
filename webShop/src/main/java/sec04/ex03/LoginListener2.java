package sec04.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginListener2
 */
@WebServlet("/loginlistener2")
public class LoginListener2 extends HttpServlet {
	ServletContext context = null;
	List user_list = new ArrayList();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		HttpSession session =  request.getSession();
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		LoginImpl loginUser = new LoginImpl(user_id, user_pw);
		if (session.isNew()) {
			session.setAttribute("loginUser", loginUser);
			user_list.add(user_id);
			context.setAttribute("user_list", user_list);
			
		}

		out.println("<head>");
		out.println("<script  type='text/javascript'>");
		out.println("setTimeout('history.go(0);', 5000)");
		out.println("</script>");
		out.println("</head>");
		out.println("<html><body>");
		out.println("Id :  " + loginUser.user_id + "<br>");
		out.println("total user : " + LoginImpl.total_user + "<br>");
		user_list.toString();
		out.println("</body></html>");
		
	}

}
