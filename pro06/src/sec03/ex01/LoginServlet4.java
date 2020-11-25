package sec03.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login4")
public class LoginServlet4 extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("init method call");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet method call");
		doHandle(request, response);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("doPost method call");
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		System.out.println("doHandle method call");
		String user_pw = request.getParameter("user_pw");
		System.out.println("ID : " + user_id);
		System.out.println("Password : " + user_pw);
	}
	public void destroy() {
		System.out.println("destory method cal");
	}

}
