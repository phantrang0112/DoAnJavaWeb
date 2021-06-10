package entities;

/**
 * @author Admin
 *
 */
public class ChiTietHoaDon {
private  int idHD;
private String idSP;
private int soLuong;
private int stt;
private String tenSP;
private int gia;
public int getGia() {
	return gia;
}
public void setGia(int gia) {
	this.gia = gia;
}
public ChiTietHoaDon(int idHD, String idSP, int soLuong, int stt, String tenSP, int gia) {
	super();
	this.idHD = idHD;
	this.idSP = idSP;
	this.soLuong = soLuong;
	this.stt = stt;
	this.tenSP = tenSP;
	this.gia = gia;
}
public String getTenSP() {
	return tenSP;
}
public void setTenSP(String tenSP) {
	this.tenSP = tenSP;
}
public ChiTietHoaDon(int idHD, String idSP, int soLuong, int stt, String tenSP) {
	super();
	this.idHD = idHD;
	this.idSP = idSP;
	this.soLuong = soLuong;
	this.stt = stt;
	this.tenSP = tenSP;
}
public int getStt() {
	return stt;
}
public void setStt(int stt) {
	this.stt = stt;
}
public ChiTietHoaDon(int idHD, String idSP, int soLuong, int stt) {
	super();
	this.idHD = idHD;
	this.idSP = idSP;
	this.soLuong = soLuong;
	this.stt = stt;
}
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
