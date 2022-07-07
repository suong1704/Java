package Model.BEAN;

public class VacxinBEAN {
	private int MaVX;
	private String TenVX;
	private int SoMui;
	private String MoTa;
	private int GiaVX;
	private String TenHangVX;
	public VacxinBEAN(int MaVX, String TenVX,int SoMui,String MoTa,int GiaVX, String TenHangVX) {
		this.MaVX=MaVX;
		this.TenVX=TenVX;
		this.SoMui=SoMui;
		this.MoTa=MoTa;
		this.GiaVX=GiaVX;
		this.TenHangVX=TenHangVX;
	}
public int getMaVX() {
	return MaVX;
}
public void setMaVX(int MaVX) {
	this.MaVX=MaVX;
}
public String getTenVX() {
	return TenVX;
}
public void setTenVX(String TenVX) {
	this.TenVX=TenVX;
}
public int getSoMui() {
	return SoMui;
}
public void setSoMui(int SoMui) {
	this.SoMui=SoMui;
}
public String getMoTa() {
	return MoTa;
}
public void setMoTa(String MoTa) {
	this.MoTa=MoTa;
}
public int getGiaVX() {
	return GiaVX;
}
public void setGiaVX(int GiaVX) {
	this.GiaVX=GiaVX;
}
public String getTenHangVX() {
	return TenHangVX;
}
public void setTenHangVX(String TenHangVX) {
	this.TenHangVX=TenHangVX;
}
}
