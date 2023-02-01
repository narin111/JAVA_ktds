package vo;

import java.sql.Date;

public class User {
	private Integer id;
	private String name;
	private String email;
	private Date joinDate;
	private String address;
	private String tel;

	
	
	public User(Integer id, String name, String email, Date joinDate, String address, String tel) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.joinDate = joinDate;
		this.address = address;
		this.tel = tel;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", joinDate=" + joinDate + ", address="
				+ address + ", tel=" + tel + "]";
	}
	
	
	
	
}
