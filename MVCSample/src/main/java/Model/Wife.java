package Model;

public class Wife {
	private String name;
	private String address;
	private boolean alive;
	
	public Wife(String name,String address , Boolean alive) {
		this.name = name;
		this.address = address;
		this.alive = alive;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
}
