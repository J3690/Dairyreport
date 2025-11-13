package control;

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
		String password = request.getParameter("pass");
		
		UserDAO dao = new UserDAO();
		User user = dao.findUser(userId, password);
		
		if(user != null) { /* ログイン時の Userid と Password のチェック */
			request.setAttribute("user", user);
			request.getRequestDispatcher("success.jsp").forward(request, response); // ログイン成功
		} else { /* Userid か Password が間違って場合 */
			request.setAttribute("error", "ユーザー ID またはパスワードが間違っています");
			request.getRequestDispatcher("login.jsp").forward(request, response); // 間違った場合もう一度ログイン画面表示
		}
		
	}
}
