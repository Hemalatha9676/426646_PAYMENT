package com.paymentswebapp.MySpringProject.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details")
public class UserEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="UserId")
	private int UserId;
	@Column(name="UserName")
	private String UserName;
	
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="LastName")
	private String LastName;
	@Column(name="Password")
	private String Password;
	@Column(name="PhoneNumber")
	private long PhoneNumber;
	@Column(name="Email")
	private String Email;
	@Column(name="Address")
	private String Address;
	
	public int getUserId() {
		return UserId;
	}


	public void setUserId(int userId) {
		this.UserId = UserId;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

   public String getFirstName() {
		return FirstName;
	}


	public void setFirstname(String FirstName) {
		this.FirstName = FirstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastname(String LastName) {
		this.LastName = LastName;
	}

	public String getPassword() {
		return Password;
	}


	public void setPassword(String Password) {
		this.Password = Password;
	}

	public long getPhonenumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(long PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		this.Address = address;
	}
	

	

}
