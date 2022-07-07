package Model.BEAN;

public class NhanVienBEAN {
		private String IDNV;
		private String HOTEN;
		private String IDPB;
		private String DIACHI;
		public NhanVienBEAN(String IDNV,String HOTEN, String IDPB,String DIACHI) {
			this.IDNV=IDNV;
			this.HOTEN=HOTEN;
			this.IDPB=IDPB;
			this.DIACHI=DIACHI;
		}
	public String getIDNV() {
		return IDNV;
	}
	public String getHOTEN() {
		return HOTEN;
	}
	public String getIDPB() {
		return IDPB;
	}
	public String getDIACHI() {
		return DIACHI;
	}
	public void setIDNV(String IDNV) {
		this.IDNV=IDNV;
	}
	public void setHOTEN(String HOTEN) {
		this.HOTEN=HOTEN;
	}
	public void setIDPB(String IDPB) {
		this.IDPB=IDPB;
	}public void setDIACHI(String DIACHI) {
		this.DIACHI=DIACHI;
	}
}
