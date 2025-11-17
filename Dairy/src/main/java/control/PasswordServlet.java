package control;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.UserDAO;

@WebServlet("/PasswordServlet")
public class PasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		
		// Userid + Username 確認
		if("check".equals(action)) {
			String userid = request.getParameter("userid");
			String username = request.getParameter("username");
			
			UserDAO dao = new UserDAO();
			boolean ok = dao.checkUser(userid, username);
			
			if(ok) { // Userid と Username があっていたらパスワード入力に進む
				request.setAttribute("userid", userid);
				RequestDispatcher rd = request.getRequestDispatcher("jsp/password/passwordNew.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("error", "ユーザー ID または ユーザーネームが間違っています");
				RequestDispatcher rd = request.getRequestDispatcher("jsp/password/passwordCheck.jsp");
				rd.forward(request, response);
			}
		} else if("update".equals(action)) { // 新パスワード入力 → 更新
			String userid = request.getParameter("userid");
			String password = request.getParameter("password");
			
			UserDAO dao = new UserDAO();
			boolean result = dao.updatePassword(userid, password);
			
			if(result) { // userid と password があっていたらパスワード変更完了
				RequestDispatcher rd = request.getRequestDispatcher("jsp/password/passwordComplete.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("error", "パスワードの変更に失敗しました");
				RequestDispatcher rd = request.getRequestDispatcher("jsp/passwort/passwordCheck.jsp");
				rd.forward(request, response);
			}
		}
	}

}
