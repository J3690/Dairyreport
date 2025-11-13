package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.UserDAO;

@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userid");
		String name = request.getParameter("name");
		
		UserDAO dao = new UserDAO();
		if(dao.verifyUser(userId, name)) {
			request.setAttribute("userId", name);
			request.getRequestDispatcher("changePasswordConfirm.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "ユーザー ID またはユーザーネームが間違っています");
			request.getRequestDispatcher("changePassword.jsp").forward(request, response);
		}
	}

}
