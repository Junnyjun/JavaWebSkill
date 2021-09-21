package sec04.ex03;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class LoginImpl2
 *
 */
@WebListener
public class LoginImpl2 implements HttpSessionListener {
	
	String user_id;
	String user_pw;
	static int total_user=0;
	

    public LoginImpl2(String user_id, String user_pw) {
		this.user_id = user_id;
		this.user_pw = user_pw;
	}

    @Override
	public void sessionCreated(HttpSessionEvent se)  { 
         System.out.println("create session");
         ++total_user;
    }


    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("destroy session");
        --total_user;
    }
	
}
