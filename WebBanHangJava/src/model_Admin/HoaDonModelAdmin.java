package model_Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller_User.MyConnect;
import entities.HoaDon;
import entities.Product;

public class HoaDonModelAdmin {
HoaDon hoaDon;

public HoaDonModelAdmin(HoaDon hoaDon) {
	super();
	this.hoaDon = hoaDon;
}

public HoaDonModelAdmin() {
	super();
}
public ArrayList getList() {
	ArrayList<HoaDon> list = new ArrayList<HoaDon>();
	Connection cnConnection = new MyConnect().getcn();
	int stt=0;
	if (cnConnection == null) {
		return null;
	}
	try {
		String sqlString = "Select * from HoaDon";
		PreparedStatement ps = cnConnection.prepareStatement(sqlString);
		ResultSet resultSet = ps.executeQuery();
		while (resultSet.next()) {
			stt+=1;
			HoaDon HD = new HoaDon(resultSet.getInt(1),resultSet.getInt(2),resultSet.getDate(3),resultSet.getInt(4),stt);
			list.add(HD);
		}
		ps.close();
		cnConnection.close();
	} catch (SQLException e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	return list;
}
public int updateTongGia(int idHD,int tongTien) {
	int kq = 0;
	Connection cnConnection = new MyConnect().getcn();
	if (cnConnection == null) {
		return 0;
	}

	try {

		String sqlString = "update HoaDon set tongTien=? where idHD=?";
		PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);

		pStatement.setInt(1, tongTien);
		pStatement.setInt(2, idHD);
		
		
		kq = pStatement.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	return kq;
}
}
