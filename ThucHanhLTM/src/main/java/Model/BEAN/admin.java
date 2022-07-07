package Model.BEAN;

public class admin {
	private String roles;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	public admin(String roles , String username, String password, String firstname, String lastname) {
		this.roles=roles;
		this.username=username;
		this.password=password; 
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
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
