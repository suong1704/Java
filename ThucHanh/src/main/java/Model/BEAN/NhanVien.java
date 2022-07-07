package Model.BEAN;


public class NhanVien {
	private String IDNV ;
	private String HOTEN ;
	private String IDPB;
	private String DIACHI ;
	public NhanVien(String idnv , String hoten , String idpb , String diachi ) {
		this.IDNV=idnv;
		this.HOTEN=hoten;
		this.IDPB=idpb;
		this.DIACHI=diachi;
	}
}
