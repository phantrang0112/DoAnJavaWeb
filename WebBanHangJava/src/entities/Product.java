package entities;

import java.sql.Date;

public class Product {
	private String idSP;
	private String tenSP;
	private int soLuong;
	private int gia;
	private Date ngayNhap;
	private String hinhSP;
	private String trangThai;
	private String idLoai;

	
	public String getIdLoai() {
		return idLoai;
	}

	public void setIdLoai(String idLoai) {
		this.idLoai = idLoai;
	}

	public Product(String idSP, String tenSP, int soLuong, int gia, Date ngayNhap, String hinhSP, String trangThai,String idLoai) {
	super();
	this.idSP = idSP;
	this.tenSP = tenSP;
	this.soLuong = soLuong;
	this.gia = gia;
	this.ngayNhap = ngayNhap;
	this.hinhSP = hinhSP;
	this.trangThai = trangThai;
	this.idLoai = idLoai;
}
	
	public Product(String tenSP, int soLuong, int gia, Date ngayNhap, String trangThai) {
		super();
		this.tenSP = tenSP;
		this.soLuong = soLuong;
		this.gia = gia;
		this.ngayNhap = ngayNhap;
		this.trangThai = trangThai;
	}

	public Product(String tenSP, int soLuong, int gia, Date ngayNhap, String hinhSP, String trangThai) {
		super();
		this.tenSP = tenSP;
		this.soLuong = soLuong;
		this.gia = gia;
		this.ngayNhap = ngayNhap;
		this.hinhSP = hinhSP;
		this.trangThai = trangThai;
	}
	public Product() {
		super();
	}
	public String getIdSP() {
		return idSP;
	}
	public void setIdSP(String idSP) {
		this.idSP = idSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public Date getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public String getHinhSP() {
		return hinhSP;
	}
	public void setHinhSP(String hinhSP) {
		this.hinhSP = hinhSP;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public Product(String idSP, String tenSP, int soLuong, int gia, Date ngayNhap, String hinhSP, String trangThai) {
		super();
		this.idSP = idSP;
		this.tenSP = tenSP;
		this.soLuong = soLuong;
		this.gia = gia;
		this.ngayNhap = ngayNhap;
		this.hinhSP = hinhSP;
		this.trangThai = trangThai;
	}


}
