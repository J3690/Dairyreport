package control;

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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userid");
		String password = request.getParameter("password");
		String userName = request.getParameter("username");
		
		if(userId.isEmpty() || password.isEmpty() || userName.isEmpty()) {
			// 入力チェック
			request.setAttribute("error", "すべての項目を入力してください");
			request.getRequestDispatcher("register.jsp").forward(request, response);
			return;
		}
		
		User user = new User(userId, password, userName);
		request.setAttribute("user", user);
		request.getRequestDispatcher("registerConfirm.jsp").forward(request, response);
	}
}
