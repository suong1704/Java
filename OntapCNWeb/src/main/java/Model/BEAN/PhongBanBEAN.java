package Model.BEAN;

public class PhongBanBEAN {
	private String IDPB;
	private String TENPB;
	private String MOTA;
	public PhongBanBEAN(String IDPB,String TENPB,String MOTA) {
		this.IDPB=IDPB;
		this.TENPB=TENPB;
		this.MOTA=MOTA;
		
	}
	public String getIDPB() {
		return IDPB;
	}
	public String getTENPB() {
		return TENPB;
	}
	public String getMOTA() {
		return MOTA;
	}
	public void setIDPB(String IDPB) {
		this.IDPB=IDPB;
	}
	public void setTENPB(String TENPB) {
		this.TENPB=TENPB;
	}
	public void setMOTA(String MOTA) {
		this.MOTA=MOTA;
	}
}
