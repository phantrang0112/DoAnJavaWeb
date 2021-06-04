package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.MyConnect;
import entities.ProductType;


public class ProductTypeModel {
ProductType productType;


public ProductType getProductType() {
	return productType;
}
public void setProductType(ProductType productType) {
	this.productType = productType;
}
public ProductTypeModel() {
	super();
}
public ProductTypeModel(ProductType productType) {
	super();
	this.productType = productType;
}
public ArrayList<ProductType> getlist() {
	ArrayList<ProductType> list = new ArrayList<ProductType>();
	Connection cnConnection = new MyConnect().getcn();
	if (cnConnection == null) {
		return null;
	}
	try {
		String sqlString = "Select * from LoaiSanPham";
		PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
		ResultSet rSet = pStatement.executeQuery();
		while (rSet.next()) {
			ProductType tempt= new ProductType(rSet.getString(1),rSet.getString(2),rSet.getString(3),rSet.getString(4));
			list.add(tempt);
			System.out.println(tempt.getTenLoai()+tempt.getFilter());
		}
		pStatement.close();
		cnConnection.close();
	} catch (SQLException e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	return list;

}
public ProductType getProductTypeIdLoai(String idLoai) {
	Connection cnConnection = new MyConnect().getcn();
	ProductType protype = null;
	if (cnConnection == null) {
		return null;
	}
	try {
		String sqlString = "Select * from LoaiSanPham where idLoai=?";
		PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
		System.out.println("hihi");
		pStatement.setString(1, idLoai);
		ResultSet rSet = pStatement.executeQuery();
		if (rSet.next()) {
		 protype = new ProductType(rSet.getString(1), rSet.getString(2), rSet.getString(3), rSet.getString(4));
			System.out.println(protype);

		}
		pStatement.close();
		cnConnection.close();
	} catch (SQLException e) {
		e.printStackTrace();
		// TODO: handle exception
	}

	return protype;

}
}
