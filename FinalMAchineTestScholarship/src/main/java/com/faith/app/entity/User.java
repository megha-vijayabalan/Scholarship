package com.faith.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@Column(nullable = false, unique= true)
	private String userName;
	
	@Column(nullable = false)
	private String password;
	
	private String isActive;
	
	private int roleId;
	
	@ManyToOne
	@JoinColumn(name="roleId", insertable = false, updatable = false)
	private Role role;

	public User() {
		super();
	}

	public User(int userId, String userName, String password, String isActive, int roleId, Role role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.isActive = isActive;
		this.roleId = roleId;
		this.role = role;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	@JsonBackReference
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", isActive=" + isActive
				+ ", roleId=" + roleId + ", role=" + role + "]";
	}

	
	
}
