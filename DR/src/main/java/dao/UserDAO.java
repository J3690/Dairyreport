package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;

public class UserDAO {
	
	public User findUser(String userId, String password) { /* ログイン */
		String sql = "SELECT * FROM user_table WHERE user_id = ? AND password = ?";
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, userId);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return new User(rs.getString("user_id"), rs.getString("password"), rs.getString("userName"));
			}
		} catch(Exception e) { 
			e.printStackTrace(); 
			} return null;
	} 
	
	public boolean inserUser(User user) { /* 新規ユーザー登録 */
		String sql = "INSERT INTO user_table (user_id, password. userName) VALUES (?, ?, ?)";
		try(Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, user.getUserId());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getUserName());
			return ps.executeUpdate() > 0;
		} catch(Exception e) {
			e.printStackTrace();
		} return false;
	}
	
	public boolean verifyUser(String userId, String userName) { /* パスワード変更の際の確認 */
		String sql = "SELECT * FROM user_table WHERE user_id = ? AND name = ?";
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, userId);
			ps.setString(2,  userName);
			ResultSet rs = ps.executeQuery();
			return rs.next();
		} catch(Exception e) {
			e.printStackTrace();
		} return false;
	}
	
	public boolean updatePassword(String userId, String newPassword) { /* パスワード変更 */
		String sql = "UPDATE user_table SET password = ? WHERE user_id = ?";
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, newPassword);
			ps.setString(2,  userId);
			return ps.executeUpdate() > 0;
		} catch(Exception e) {
			e.printStackTrace();
		} return false;
	}
}

