package com.paymentswebapp.MySpringProject.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="bank_account")
public class BankAccountsEntity 
{
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="BankAccountId")
	private int BankAccountId;
	@Column(name="BankAccountNo")
	private String BankAccountNo;
	@Column(name="IFSCCode")
	private String IFSCCode;
	@Column(name="BankName")
	private String BankName;
	@Column(name="BankBranch")
	private String Branch;
	@Column(name="isActive")
	private String isActive;
	@Column(name="CurrentBalance")
	private long CurrentBalance;
	@ManyToOne
	@JoinColumn(name="UserId")
	private UserEntity user;
	
	
	public BankAccountsEntity() {
	    // Default constructor required for entity creation
	}

	public BankAccountsEntity(int BankAccountId, String BankAccountNo, String IFSCCode, String BankName, String Branch,
			String isActive, long CurrentBalance, UserEntity user) {
		 this.BankName = BankName;
	   this.BankAccountId = BankAccountId;
	   this.BankAccountNo = BankAccountNo;
	   this.IFSCCode = IFSCCode;
	  
	   this.Branch = Branch;
		this.isActive = isActive;
		this.CurrentBalance = CurrentBalance;
		this.user = user;
	}
	public int getBankAccountId() {
		return BankAccountId;
	}
	public void setBankAccountId(int BankAccountId) {
		BankAccountId = BankAccountId;
	}
	public String getBankAccountNo() {
		return BankAccountNo;
	}
	public void setBankAccountNo(String BankAccountNo) {
		BankAccountNo = BankAccountNo;
	}
	public String getIFSCCode() {
		return IFSCCode;
	}
	public void setIFSCCode(String IFSCCode) {
		IFSCCode = IFSCCode;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String BankName) {
		BankName = BankName;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String Branch) {
		Branch = Branch;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public long getCurrentBalance() {
		return CurrentBalance;
	}
	public void setCurrentBalance(long CurrentBalance) {
		this.CurrentBalance = CurrentBalance;
	}
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	

}
