package entities;

/**
 * @author Admin
 *
 */
public class ChiTietHoaDon {
private  int idHD;
private String idSP;
private int soLuong;
public ChiTietHoaDon() {
	super();
}
public ChiTietHoaDon(int idHD, String idSP, int soLuong) {
	super();
	this.idHD = idHD;
	this.idSP = idSP;
	this.soLuong = soLuong;
}
public int getIdHD() {
	return idHD;
}
public void setIdHD(int idHD) {
	this.idHD = idHD;
}
public String getIdSP() {
	return idSP;
}
public void setIdSP(String idSP) {
	this.idSP = idSP;
}
public int getSoLuong() {
	return soLuong;
}
public void setSoLuong(int soLuong) {
	this.soLuong = soLuong;
}

}
