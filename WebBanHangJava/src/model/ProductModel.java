package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.MyConnect;
import entities.Item;
import entities.Product;

/**
 * @author Admin
 *
 */
public class ProductModel {
	Product Product = new Product();

	public ProductModel(entities.Product Product) {
		super();
		this.Product = Product;
	}

	public ProductModel() {
		super();
	}

	public Product getProduct() {
		return Product;
	}

	public void setProduct(Product Product) {
		this.Product = Product;
	}

	public ArrayList<Product> getlist() {
		ArrayList<Product> list = new ArrayList<Product>();
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return null;
		}
		try {
			String sqlString = "Select * from SanPham";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			ResultSet rSet = pStatement.executeQuery();
			while (rSet.next()) {
				Product temP = new Product(rSet.getString(1), rSet.getString(2), rSet.getInt(3), rSet.getInt(4),rSet.getDate(5), rSet.getString(6), rSet.getString(7), rSet.getString(8));
				list.add(temP);
				System.out.println(temP.getIdSP() + temP.getGia() + temP.getHinhSP() + temP.getTenSP() + rSet.getString(8));

			}
			pStatement.close();
			cnConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;

	}

	public ArrayList<Item> getlistFilter() {
		ArrayList<Item> list = new ArrayList<Item>();
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return null;
		}
		try {
			String sqlString = "select SanPham.*,LoaiSanPham.filter from SanPham,LoaiSanPham where SanPham.idLoai=LoaiSanPham.idLoai";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			ResultSet rSet = pStatement.executeQuery();
			while (rSet.next()) {
				Product temP = new Product(rSet.getString(1), rSet.getString(2), rSet.getInt(3), rSet.getInt(4),rSet.getDate(5), rSet.getString(6), rSet.getString(7), rSet.getString(8));
				Item item = new Item(temP, rSet.getString(9));
				list.add(item);
				System.out.println(item.getProduct().getHinhSP() + item.getProduct().getIdSP() + item.getFilter());

			}
			pStatement.close();
			cnConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;

	}

	public ArrayList<Product> getProductLoai(String tenLoai) {
		Connection cnConnection = new MyConnect().getcn();
		ArrayList<Product> list = new ArrayList<Product>();
		if (cnConnection == null) {
			return null;
		}
		try {
			String sqlString = "Select SanPham.* from SanPham,LoaiSanPham where SanPham.idLoai=LoaiSanPham.idLoai and LoaiSanPham.tenLoai=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			System.out.println("hihi");
			pStatement.setString(1, tenLoai);
			ResultSet rSet = pStatement.executeQuery();
			while(rSet.next()) {
				Product pro = new Product(rSet.getString(1), rSet.getString(2), rSet.getInt(3), rSet.getInt(4),rSet.getDate(5), rSet.getString(6), rSet.getString(7));
				list.add(pro);
				System.out.println(pro.getHinhSP()+"hinh nha");

			}
			pStatement.close();
			cnConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
//		Product pro= new Product(masp,"trang",10,"hi");
		return list;

	}

	public String getFiLter(String idLoai) {
		Connection cnConnection = new MyConnect().getcn();
		String filter = "";
		if (cnConnection == null) {
			return null;
		}
		try {
			String sqlString = "Select filter from SanPham,LoaiSanPham where SanPham.idLoai=LoaiSanPham.idLoai&& LoaiSanPham.idLoai=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			System.out.println("hihi");
			pStatement.setString(1, idLoai);
			ResultSet rSet = pStatement.executeQuery();

			filter = rSet.getString(1);

			pStatement.close();
			cnConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
//		Product pro= new Product(masp,"trang",10,"hi");
		return filter;
	}

	public Product getProductloaiIdSP(String idSP, String tenLoai) {
		Connection cnConnection = new MyConnect().getcn();
		Product pro = null;
		if (cnConnection == null) {
			return null;
		}
		try {
			String sqlString = "Select SanPham.* from SanPham,LoaiSanPham where idSP=?&& SanPham.idLoai=LoaiSanPham.idLoai&& LoaiSanPham.tenLoai=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			System.out.println("hihi");
			pStatement.setString(1, idSP);
			pStatement.setString(2, tenLoai);
			ResultSet rSet = pStatement.executeQuery();
			if (rSet.next()) {
				pro = new Product(rSet.getString(1), rSet.getString(2), rSet.getInt(3), rSet.getInt(4), rSet.getDate(5),
						rSet.getString(6), rSet.getString(7));
				System.out.println(pro);

			}
			pStatement.close();
			cnConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
//		Product pro= new Product(masp,"trang",10,"hi");
		return pro;

	}
	public Product getProductIdSP(int idSP) {
		Connection cnConnection = new MyConnect().getcn();
		Product pro = null;
		if (cnConnection == null) {
			return null;
		}
		try {
			String sqlString = "Select SanPham.* from SanPham where idSP=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			System.out.println("hihi");
			pStatement.setInt(1, idSP);
		
			ResultSet rSet = pStatement.executeQuery();
			if (rSet.next()) {
				pro = new Product(rSet.getString(1), rSet.getString(2), rSet.getInt(3), rSet.getInt(4), rSet.getDate(5),
						rSet.getString(6), rSet.getString(7));
				System.out.println(pro);

			}
			pStatement.close();
			cnConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
//		Product pro= new Product(masp,"trang",10,"hi");
		return pro;

	}
	public void UpdateSoLuong(String idSP, int sl) {
		int kq = 0;
		Product pro = new ProductModel().getProductIdSP(idSP);
		int slg=0;
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			kq=0;
		}

		try {
			String sqlString = "update SanPham set soLuong=? where idSP=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			slg=pro.getSoLuong()-sl;
			pStatement.setInt(1, slg);
			pStatement.setString(2,idSP);
			
			kq = pStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	public Product getProductIdSP(String idSP) {
		Connection cnConnection = new MyConnect().getcn();
		Product pro = null;
		if (cnConnection == null) {
			return null;
		}
		try {
			String sqlString = "Select * from SanPham where idSP=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			System.out.println("hihi");
			pStatement.setString(1, idSP);
			ResultSet rSet = pStatement.executeQuery();
			if (rSet.next()) {
				pro = new Product(rSet.getString(1), rSet.getString(2), rSet.getInt(3), rSet.getInt(4), rSet.getDate(5),
						rSet.getString(6), rSet.getString(7));
				System.out.println("pro"+rSet.getString(1));

			}
			pStatement.close();
			cnConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
//		Product pro= new Product(masp,"trang",10,"hi");
		return pro;

	}

}
