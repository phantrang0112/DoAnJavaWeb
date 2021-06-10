package model_Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller_User.MyConnect;
import entities.Account;
import entities.Product;

public class ProductModelAdmin {
	Product product;

	public ProductModelAdmin(Product product) {
		super();
		this.product = product;
	}

	public ProductModelAdmin() {
		super();
	}

	public ArrayList getList() {
		ArrayList<Product> list = new ArrayList<Product>();
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return null;
		}
		try {
			String sqlString = "Select * from SanPham";
			PreparedStatement ps = cnConnection.prepareStatement(sqlString);
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				Product pro = new Product(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3),
						resultSet.getInt(4), resultSet.getDate(5), resultSet.getString(6), resultSet.getString(7));
				list.add(pro);
			}
			ps.close();
			cnConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}

	public int updateSPGetIdSP(String idSP) {
		int kq = 0;
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return 0;
		}

		try {

			String sqlString = "update SanPham set tenSP=?,soLuong=?,gia=?,ngayNhap=?,trangThai=? where idSP=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);

			pStatement.setString(1, product.getTenSP());
			pStatement.setInt(2, product.getSoLuong());
			pStatement.setInt(3, product.getGia());
			pStatement.setDate(4, product.getNgayNhap());
			pStatement.setString(5, product.getTrangThai());
			pStatement.setString(6, idSP);

			kq = pStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;
	}

	public String getIdLoai(String tenLoai) {
		Connection cn = new MyConnect().getcn();
		String idLoai = "";
		if (cn == null) {
			return null;
		}
		try {
			String sql = "select * from LoaiSanPham where tenLoai=? ";
			PreparedStatement pStatement = cn.prepareStatement(sql);
			pStatement.setString(1, tenLoai);
			ResultSet rSet = pStatement.executeQuery();
			if (rSet.next()) {
				idLoai = rSet.getString(1);

			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return idLoai;
	}

	public int insertProduct( String tenLoai) {
		int kq = 0;
		Connection cn = new MyConnect().getcn();
		String idLoai=getIdLoai(tenLoai);
		if (cn == null) {
			return 0;
		}
		try {
			// int kttt = kiemtraTonTaiIdSP(product.getIdSP());
//		System.out.println(kttt+"huhu");
			// if (kttt == 0) {
			String sqlString = "insert into SanPham values( ?,?,?,?,?,?,?,?) ";
			PreparedStatement pStatement = cn.prepareStatement(sqlString);
			pStatement.setString(1, product.getIdSP());
			pStatement.setString(2, product.getTenSP());
			pStatement.setInt(3, product.getSoLuong());
			pStatement.setInt(4, product.getGia());
			pStatement.setDate(5, product.getNgayNhap());
			pStatement.setString(6, product.getHinhSP());
			pStatement.setString(7, product.getTrangThai());
			pStatement.setString(8, idLoai);
			kq = pStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;
	}
	public int deleteProduct(String idSP) {
		int kq = 0;
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return 0;
		}

		try {
			String sqlString = "delete from SanPham where idSP=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			pStatement.setString(1, idSP);
			kq = pStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;
	}


}