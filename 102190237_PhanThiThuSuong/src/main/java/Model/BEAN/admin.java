package Model.BEAN;

public class admin {
	private String username;
	private String password;
	public admin(String username, String password) {
		this.username=username;
		this.password=password;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String name) {
		this.username = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String name) {
		this.password = name;
	}
}
