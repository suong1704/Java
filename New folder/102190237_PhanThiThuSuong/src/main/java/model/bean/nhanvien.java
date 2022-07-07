package model.bean;

public class nhanvien {
	private int IDNV;
	private String HOTEN;
	private  int IDPB;
	private String DIACHI;
	
	public int getIDNV() {
		return IDNV;
	}
	public void setIDNV(int id) {
		this.IDNV = id;
	}
	public String getName() {
		return HOTEN;
	}
	public void setName(String name) {
		this.HOTEN = name;
	}
	public String getDIACHI() {
		return DIACHI;
	}
	public void setDIACHI(String diachi) {
		this.DIACHI = diachi;
	}
	public int getIDPB() {
		return IDPB;
	}
	public void setIDPB(int idpb) {
		this.IDPB = idpb;
	}
}
