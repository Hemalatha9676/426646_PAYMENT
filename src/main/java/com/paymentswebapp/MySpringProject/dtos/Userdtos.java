package com.paymentswebapp.MySpringProject.dtos;

import javax.swing.Spring;

public class Userdtos 
{

	private int UserId;
	private String UserName;
    private String FirstName;
	private String LastName;
	private String Password;
	private long PhoneNumber;
	private String Email;
	private String Address;
	public Userdtos(int UserId, String UserName, String FirstName, String LastName, String Password,long PhoneNumber,
			String Email,String Address) {
		super();
		this.UserId = UserId;
		this.UserName = UserName;
       this.FirstName = FirstName;
		this.LastName = LastName;
		this.Password = Password;
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
		return UserName;
	}
	public void setUserName(String UserName) {
		this.UserName = UserName;
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
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
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
