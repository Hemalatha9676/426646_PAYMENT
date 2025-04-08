package com.paymentswebapp.MySpringProject.dtos;

import javax.swing.Spring;

public class Userdtos 
{

	private int UserId;
	private String userName;
    private String FirstName;
	private String LastName;
	private String password;
	private long PhoneNumber;
	private String Email;
	private String Address;
	public Userdtos(int UserId, String userName, String FirstName, String LastName, String password,long PhoneNumber,
			String Email,String Address) {
		super();
		this.UserId = UserId;
		this.userName = userName;
       this.FirstName = FirstName;
		this.LastName = LastName;
		this.password = password;
		this.PhoneNumber = PhoneNumber;
		this.Email = Email;
		this.Address=Address;
		
	}
	public int getUserid() {
		return UserId;
	}
	public void setUserid(int UserId) {
		this.UserId = UserId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhonenumber(long PhoneNumber) {
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

    public void setAddress(String Address) {
		this.Address = Address;
	}
	
	
	
}
