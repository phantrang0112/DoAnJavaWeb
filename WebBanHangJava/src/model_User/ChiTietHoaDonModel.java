package model_User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controller_User.MyConnect;
import entities.ChiTietHoaDon;

public class ChiTietHoaDonModel {
	ChiTietHoaDon cthd;

	public ChiTietHoaDonModel(ChiTietHoaDon cthd) {
		super();
		this.cthd = cthd;
	}

	public int insertChiTietHoaDon() {
		int kq = 0;
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return 0;

		}
		try {
			String sql = "insert into ChiTietHoaDon values (?,?,?)";
			PreparedStatement ps = cnConnection.prepareStatement(sql);
			System.out.println(cthd.getIdHD()+".."+cthd.getIdSP()+cthd.getSoLuong());
			ps.setInt(1, cthd.getIdHD());
			ps.setString(2, cthd.getIdSP());
			ps.setInt(3, cthd.getSoLuong());
			kq = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;
	}
	

}
