package entities;

public class Account {
	private int idUser;
	private String userName;
	private String passWord;
	private String email;
	private String sdt;
	private String idQuyen;
	public Account(int idUser, String userName, String passWord, String email, String sdt) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.sdt = sdt;
	}
	public Account() {
		super();
	}
	public Account(int idUser, String userName, String passWord, String email, String sdt, String idQuyen) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.sdt = sdt;
		this.idQuyen = idQuyen;
	}
	public Account(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	public Account(String userName, String passWord, String email, String sdt) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public String getIdQuyen() {
		return idQuyen;
	}
	public int getIdUser() {
		return idUser;
	}
	public String getPassWord() {
		return passWord;
	}
	public String getSdt() {
		return sdt;
	}
	public String getUserName() {
		return userName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setIdQuyen(String idQuyen) {
		this.idQuyen = idQuyen;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
