package Model.BEAN;

public class sinhvien {
	private int maso;
	private String hoten;
	private String gioitinh;
	private String khoa;
	public sinhvien(int maso , String hoten, String gioitinh , String khoa) {
		this.maso = maso;
		this.hoten=hoten; 
		this.gioitinh=gioitinh;
		this.khoa=khoa;
	}

	public int getMaso() {
		return maso;
	}
	public void setMaso(int maso) {
		this.maso=maso;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten=hoten;
	}
	public void setGioitinh(String ioitinh) {
		this.gioitinh=gioitinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa=khoa;
	}
}
