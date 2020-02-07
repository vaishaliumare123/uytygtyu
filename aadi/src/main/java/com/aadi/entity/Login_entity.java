package com.aadi.entity;
import javax.persistence.*;

@Entity
@Table

public class Login_entity {
	

	@Column(name="uname")
	private String uname="";

	@Column(name="password")
	private String password="";

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	@Override
	public String toString() {
		return "Login_entity [uname=" + uname + ", password=" + password + "]";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
