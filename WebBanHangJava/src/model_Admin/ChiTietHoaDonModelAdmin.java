package model_Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller_User.MyConnect;
import entities.ChiTietHoaDon;
import entities.HoaDon;

public class ChiTietHoaDonModelAdmin {
	ChiTietHoaDon chiTietHoaDon;

	public ChiTietHoaDonModelAdmin(ChiTietHoaDon chiTietHoaDon) {
		super();
		this.chiTietHoaDon = chiTietHoaDon;
	}

	public ChiTietHoaDonModelAdmin() {
		super();
	}

	public ArrayList getListIdHD(int idHD) {
		ArrayList<ChiTietHoaDon> list = new ArrayList<ChiTietHoaDon>();
		Connection cnConnection = new MyConnect().getcn();
		int stt = 0;
		if (cnConnection == null) {
			return null;
		}
		try {
			String sqlString = "Select ChiTietHoaDon.*,SanPham.tenSP,SanPham.gia from ChiTietHoaDon,SanPham where ChiTietHoaDon.idHD=? and ChiTietHoaDon.idSP= SanPham.idSP ";
			PreparedStatement ps = cnConnection.prepareStatement(sqlString);
			ps.setInt(1, idHD);

			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				stt += 1;
				ChiTietHoaDon HD = new ChiTietHoaDon(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3),
						stt, resultSet.getString(4), resultSet.getInt(5));
				list.add(HD);
				System.out.println(HD.getGia() + HD.getTenSP() + idHD + "huhuhuhuu");
			}
			ps.close();
			cnConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}

	public int updateAccountAdminGetIduser(int idUser) {
		int kq = 0;
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return 0;
		}

		try {

			String sqlString = "update NguoiDung set userName=?,passWord=?,email=?,sdt=? where idUser=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
//
//			pStatement.setString(1, account.getUserName());
//			pStatement.setString(2, account.getPassWord());
//			pStatement.setString(3, account.getEmail());
//			pStatement.setString(4, account.getSdt());
//			pStatement.setInt(5, idUser);
//			System.out.println(account.getUserName() + account.getPassWord());
			kq = pStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;
	}

	public int deleteAccount(String idSP,int idHD) {
		int kq = 0;
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return 0;
		}

		try {
			String sqlString = "delete from ChiTietHoaDon where idSP=? and idHD=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			pStatement.setString(1, idSP);
			pStatement.setInt(2, idHD);
			kq = pStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;
	}
	 public int tongtien(int idHD) {
		 int kq = 0;
			Connection cnConnection = new MyConnect().getcn();
			if (cnConnection == null) {
				return 0;
			}

			try {
				String sqlString = "Select ChiTietHoaDon.soLuong,SanPham.gia from ChiTietHoaDon,SanPham where idHD=? and SanPham.idSP=ChiTietHoaDon.idSP";
				PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
				pStatement.setInt(1, idHD);

				ResultSet resultSet = pStatement.executeQuery();
				while(resultSet.next()) {
					kq=kq+ resultSet.getInt(1)*resultSet.getInt(2);
					
				}
				

			} catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			return kq;
	 }

}
