package model.bean;

public class admin {

	private String username;
	
	private String password;
	private String firstname;
	private String lastname;
	private int roles;
	
	public int getRoles() {
		return roles;
	}
	public void setRoles(int roles) {
		this.roles = roles;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String name) {
		this.firstname = name;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String name) {
		this.lastname = name;
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
