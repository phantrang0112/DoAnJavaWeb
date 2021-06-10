package model_Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import controller_User.MyConnect;
import entities.Account;

public class AccountModel_Admin {
	Account account;

	public AccountModel_Admin() {
		super();
	}

	public AccountModel_Admin(Account account) {
		super();
		this.account = account;
	}

	public ArrayList getList() {
		ArrayList<Account> list = new ArrayList<Account>();
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return null;
		}
		try {
			String sqlString = "Select * from NguoiDung";
			PreparedStatement ps = cnConnection.prepareStatement(sqlString);
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				Account tempAccount = new Account(resultSet.getString(1), resultSet.getString(2));
				list.add(tempAccount);
			}
			ps.close();
			cnConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}

	public ArrayList<Account> getlistNV() {
		ArrayList<Account> list = new ArrayList<Account>();
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return null;
		}
		try {
			String sqlString = "Select NguoiDung.* from NguoiDung,Quyen where NguoiDung.idQuyen=Quyen.idQuyen and LoWer(Quyen.tenQuyen)=lower('admin')";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			ResultSet rSet = pStatement.executeQuery();
			while (rSet.next()) {
				Account temP = new Account(rSet.getInt(1), rSet.getString(2), rSet.getString(3), rSet.getString(4),
						rSet.getString(5));
				list.add(temP);
			}
			pStatement.close();
			cnConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;

	}

	public ArrayList<Account> getlistKH() {
		ArrayList<Account> list = new ArrayList<Account>();
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return null;
		}
		try {
			String sqlString = "Select NguoiDung.* from NguoiDung,Quyen where NguoiDung.idQuyen=Quyen.idQuyen and LoWer(Quyen.tenQuyen)=lower('user')";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			ResultSet rSet = pStatement.executeQuery();
			while (rSet.next()) {
				Account temP = new Account(rSet.getInt(1), rSet.getString(2), rSet.getString(3), rSet.getString(4),
						rSet.getString(5));
				list.add(temP);
			}
			pStatement.close();
			cnConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;

	}

//	public Account gettAccount(String idUser,String userName,String passWord,String email, String sdt, String idQuyen) {
//		account.setIdUser(idUser);
//		account.setUserName(userName);
//		account.setPassWord(passWord);
//		account.setEmail(email);
//		account.setSdt(sdt);
//		account.setIdQuyen(idQuyen);
//		
//		return account;
//	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public Account getAccountHienTai(String userName, String password, HttpSession a) {
		int kq = 0;
		Account acc = null;
		Connection cn = new MyConnect().getcn();
		if (cn == null) {
			return null;
		}
		try {
			String sql = "SELECT * FROM NguoiDung ";
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(2) + userName + "...." + password + rs.getString(3));
				if (rs.getString(2).equals(userName) && rs.getString(3).equals(password)) {

					acc = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
							rs.getString(6));

					break;

				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return acc;

	}

	public int login(String userName, String password, HttpSession a) {
		int kq = 0;
		Connection cn = new MyConnect().getcn();
		if (cn == null) {
			return 0;
		}
		try {
//			
			String sql = "SELECT * FROM NguoiDung ";
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(2) + userName + "...." + password + rs.getString(3));
				if (rs.getString(2).equals(userName) && rs.getString(3).equals(password)) {
					kq = 1;
					break;

				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;

	}

	public int kiemTraTonTai(String user, String pass) {
		int kq = 0;
		Connection cn = new MyConnect().getcn();
		if (cn == null) {
			return 0;
		}
		try {
			String sqlString = " select * from NguoiDung ";
			PreparedStatement pStatement = cn.prepareStatement(sqlString);
			ResultSet rs = pStatement.executeQuery();
			System.out.println("huihu");
			if (rs.next()) {
				if (rs.getString(2).equals(user) && rs.getString(3).equals(pass)) {
					System.out.println("huihu");
					kq = 1;
				}
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;
	}

	public String getIdQuyen(String tenQuyen) {
		String kq = "";
		Connection cn = new MyConnect().getcn();

		if (cn == null) {
			return null;
		}
		try {
			String sqlString = "select idQuyen from Quyen where tenQuyen=? ";
			PreparedStatement pStatement = cn.prepareStatement(sqlString);
			pStatement.setString(1, tenQuyen);
			ResultSet rs = pStatement.executeQuery();
			if (rs.next()) {
				kq = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;
	}

	public int insertAccount(String quyen) {
		int kq = 0;
		Connection cn = new MyConnect().getcn();
		String Q = getIdQuyen(quyen);

		if (cn == null) {
			return 0;
		}
		try {
			int kttt = kiemTraTonTai(account.getUserName(), account.getPassWord());
			System.out.println(kttt+"huhu");
			if (kttt == 0) {
				String sqlString = "insert into NguoiDung values(?,?,?,?,?) ";
				PreparedStatement pStatement = cn.prepareStatement(sqlString);
				pStatement.setString(1, account.getUserName());
				pStatement.setString(2, account.getPassWord());
				pStatement.setString(3, account.getEmail());
				pStatement.setString(4, account.getSdt());
				pStatement.setString(5, Q);
				kq = pStatement.executeUpdate();

			} else {
				return 0;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;
	}

	public int updateAccountAdmin() {
		int kq = 0;
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return 0;
		}

		try {

			String sqlString = "update NguoiDung set userName=?,passWord=?,email=?,sdt=? where idUser=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);

			pStatement.setString(1, account.getUserName());
			pStatement.setString(2, account.getPassWord());
			pStatement.setString(3, account.getEmail());
			pStatement.setString(4, account.getSdt());
			pStatement.setInt(5, account.getIdUser());
			System.out.println(account.getUserName() + account.getPassWord());
			kq = pStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;
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

			pStatement.setString(1, account.getUserName());
			pStatement.setString(2, account.getPassWord());
			pStatement.setString(3, account.getEmail());
			pStatement.setString(4, account.getSdt());
			pStatement.setInt(5, idUser);
			System.out.println(account.getUserName() + account.getPassWord());
			kq = pStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;
	}

	public int deleteAccount(int idUser) {
		int kq = 0;
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return 0;
		}

		try {
			String sqlString = "delete from NguoiDung where idUser=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
			pStatement.setInt(1, idUser);
			kq = pStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return kq;
	}

}
