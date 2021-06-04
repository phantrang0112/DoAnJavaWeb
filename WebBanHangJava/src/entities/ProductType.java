package entities;

public class ProductType {
private String idLoai;
private String tenLoai;
private String hinhLoai;
private String filter;
public String getFilter() {
	return filter;
}
public void setFilter(String filter) {
	this.filter = filter;
}
public ProductType(String idLoai, String tenLoai, String hinhLoai, String filter) {
	super();
	this.idLoai = idLoai;
	this.tenLoai = tenLoai;
	this.hinhLoai = hinhLoai;
	this.filter = filter;
}
public ProductType(String idLoai, String tenLoai, String hinhLoai) {
	super();
	this.idLoai = idLoai;
	this.tenLoai = tenLoai;
	this.hinhLoai = hinhLoai;
}
public ProductType() {
	super();
}
public String getIdLoai() {
	return idLoai;
}
public void setIdLoai(String idLoai) {
	this.idLoai = idLoai;
}
public String getTenLoai() {
	return tenLoai;
}
public void setTenLoai(String tenLoai) {
	this.tenLoai = tenLoai;
}
public String getHinhLoai() {
	return hinhLoai;
}
public void setHinhLoai(String hinhLoai) {
	this.hinhLoai = hinhLoai;
}
}
