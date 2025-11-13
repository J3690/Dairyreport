package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userid");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		
		if(userId.isEmpty() || pass.isEmpty() || name.isEmpty()) {
			request.setAttribute("error", "すべての項目を入力してください");
			request.getRequestDispatcher("register.jsp").forward(request, response);
			return;
		}
		
		User user = new User(userId, pass, name);
		request.setAttribute("user", user);
		request.getRequestDispatcher("registerConfirm.jsp").forward(request, response);
	}

}
