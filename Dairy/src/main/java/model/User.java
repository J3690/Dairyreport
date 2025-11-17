package model;

public class User {
	private String userid;
	private String username;
	private String password;
	
	public User() {}
	
	public User(String userid, String username, String password) {
		this.userid = userid;
		this.username = username;
		this.password = password;
	}
	
	public String getUserid() { return this.userid; }
	public String getUsername() { return this.username; }
	public String getPassword() { return this.password; }
	
	public void setUserid(String userId) { this.userid = userId; }
	public void setUsername(String userName) { this.username = userName; }
	public void setPassword(String password) { this.password = password; }

}
