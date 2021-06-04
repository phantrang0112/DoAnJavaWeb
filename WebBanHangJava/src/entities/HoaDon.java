package entities;

import java.sql.Date;

public class HoaDon {
 private int idHD;
private int idUser;
private Date ngayLap;
public HoaDon(int idUser, java.sql.Date ngayLap) {
	super();
	this.idUser = idUser;
	this.ngayLap = ngayLap;
}
public int getIdHD() {
	return idHD;
}
public void setIdHD(int idHD) {
	this.idHD = idHD;
}
public int getIdUser() {
	return idUser;
}
public void setIdUser(int idUser) {
	this.idUser = idUser;
}
public Date getNgayLap() {
	return ngayLap;
}
public void setNgayLap(Date ngayLap) {
	this.ngayLap = ngayLap;
}
public HoaDon() {
	super();
}
public HoaDon(int idHD, int idUser, Date ngayLap) {
	super();
	this.idHD = idHD;
	this.idUser = idUser;
	this.ngayLap = ngayLap;
}

}
