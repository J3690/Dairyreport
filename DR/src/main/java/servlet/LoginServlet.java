package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.UserDAO;
import model.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userid");
		String pass = request.getParameter("pass");
		
		UserDAO dao = new UserDAO();
		User user = dao.findUser(userId, pass);
		
		if(user != null) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("success.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "ユーザー ID またはパスワードが間違っています");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
