package control;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.UserDAO;

@WebServlet("/ChangePasswordConfirmServlet")
public class ChangePasswordConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userid");
		String newPassword = request.getParameter("newpassword");
		
		UserDAO dao = new UserDAO();
		boolean updated = dao.updatePassword(userId, newPassword);
		
		if(updated) {
			request.setAttribute("message", "パスワードを変更しました");
			request.getRequestDispatcher("success.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "更新に失敗しました");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

}
