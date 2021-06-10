package model_User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller_User.MyConnect;
import entities.HoaDon;

public class HoaDonModel {
	HoaDon hoadon;

	public HoaDonModel(HoaDon hoadon) {
		super();
		this.hoadon = hoadon;
	}

	public int intsertHoaDon() {
		int kq = 0;
		Connection cnConnection = new MyConnect().getcn();
		int tong= 0;
		if (cnConnection == null) {
			return 0;
		}
		try {
			String sqlString = "insert into HoaDon values(?,?,?)";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			pStatement.setInt(1, hoadon.getIdUser());
			pStatement.setDate(2, (Date) hoadon.getNgayLap());
			pStatement.setInt(3, tong);
		
			System.out.println("hoa don" + hoadon.getNgayLap()+ hoadon.getIdHD()+hoadon.getIdUser());
			kq = pStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;

	}
	public void updateTongTien(int idHD,int tong) {
		int kq=0;
		Connection cnConnection = new MyConnect().getcn();
		try {

			String sqlString = "update HoaDon set tongTien=? where idHD=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			
			pStatement.setInt(1, tong);
			pStatement.setInt(2, idHD);
			kq = pStatement.executeUpdate();
		
			} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println( idHD+"nay"+kq+"huhu"+tong+ "khhsq");

	}
	public int getNewestIdHoaDon() {
		Connection cnConnection = new MyConnect().getcn();
		int MaxId = 0;
		if (cnConnection == null) {
			return 0;
		}
		try {
			String sqlString = "select MAX(idHD) from HoaDon";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			ResultSet rSet = pStatement.executeQuery();
			if (rSet.next()) {
				MaxId = rSet.getInt(1);
			}
			pStatement.close();
			cnConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return MaxId;
	}

}
