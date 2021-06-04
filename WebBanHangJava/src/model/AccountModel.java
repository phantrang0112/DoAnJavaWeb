package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;





import controller.MyConnect;
import entities.Account;

public class AccountModel {
	Account account;

	
	public AccountModel(Account account) {

		this.account = account;
	}

	public AccountModel() {
		super();
	}

	public ArrayList getList() {
		ArrayList<Account> list = new ArrayList<Account>();
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return null;
		}
		try {
			String sqlString = "Select * from admin";
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
	
	public Account getAccountHienTai(String userName, String password, HttpSession a){
		int kq = 0;
		Account acc=null;
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
				
				acc = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				
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

//	public int insertAccount() {
//		int kq = 0;
//		Connection cn = new MyConnect().getcn();
//		if (cn == null) {
//			return 0;
//		}
//		try {
//			String sqlString = "insert into admin values(?,?)";
//			PreparedStatement pStatement = cn.prepareStatement(sqlString);
//			pStatement.setString(1, account.getUsername());
//			pStatement.setString(2, account.getPassword());
//			kq = pStatement.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}
//		return kq;
//	}

	public int updateAccount() {
		int kq = 0;
		Connection cnConnection = new MyConnect().getcn();
		if (cnConnection == null) {
			return 0;
		}

		try {
			
			String sqlString = "update NguoiDung set userName=?,passWord=?,email=?,sdt=? where idUser=?";
			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
		
			pStatement.setString(1, account.getUserName());
			pStatement.setString(2,account.getPassWord());
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
}
//	public int deleteAccount() {
//		int kq = 0;
//		Connection cnConnection = new MyConnect().getcn();
//		if (cnConnection == null) {
//			return 0;
//		}
//
//		try {
//			String sqlString = "delete from admin where username=?";
//			PreparedStatement pStatement = cnConnection.prepareStatement(sqlString);
//			pStatement.setString(1, account.getUsername());
//			kq = pStatement.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}
//		return kq;
//	}
	
