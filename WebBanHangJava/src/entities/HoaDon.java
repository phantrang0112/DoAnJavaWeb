package entities;

import java.sql.Date;

public class HoaDon {
 private int idHD;
private int idUser;
private Date ngayLap;
private int tong;
private int stt;
public int getStt() {
	return stt;
}
public void setStt(int stt) {
	this.stt = stt;
}
public HoaDon(int idHD, int idUser, Date ngayLap, int tong, int stt) {
	super();
	this.idHD = idHD;
	this.idUser = idUser;
	this.ngayLap = ngayLap;
	this.tong = tong;
	this.stt = stt;
}
public int getTong() {
	return tong;
}
public void setTong(int tong) {
	this.tong = tong;
}
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
public HoaDon(int idHD, int idUser, Date ngayLap, int tong) {
	super();
	this.idHD = idHD;
	this.idUser = idUser;
	this.ngayLap = ngayLap;
	this.tong = tong;
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
