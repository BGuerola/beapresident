package com.bepresident.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String username;
	
	@Column
	private String contrasenya;
	
	@Column 
	private String rolename;
	

	public UserEntity() {
	}
	
	public UserEntity(String username, String contrasenya, String rolename) {
		super();
		this.username = username;
		this.contrasenya = contrasenya;
		this.rolename = rolename;
	}
	
	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContrasenya() {
		return contrasenya;
	}
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
	
	
//	public static Object withDefaultPasswordEncoder() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

}
