package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.UserDAO;
import model.User;

@WebServlet("/RegisterConfirmServlet")
public class RegisterConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userid");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		
		UserDAO dao = new UserDAO();
		boolean result = dao.inserUser(new User(userId, pass, name));
		
		if(result) {
			request.setAttribute("message", "登録しました");
			request.getRequestDispatcher("success.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "登録に失敗しました");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

}
