package Model.BEAN;

public class AdminBEAN {
	private String username;
	private int password;
	public AdminBEAN(String username , int password) {
		this.username=username;
		this.password=password;
	}
	public String getUsername() {
		return username;
	}
	public int getPassword() {
		return password;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public void setPassword(int password) {
		this.password=password;
	}
	
}
