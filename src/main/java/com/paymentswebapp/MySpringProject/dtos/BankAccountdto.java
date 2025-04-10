package com.paymentswebapp.MySpringProject.dtos;

import com.paymentswebapp.MySpringProject.Entities.UserEntity;

public class BankAccountdto {

    private int BankAccountId;
    private String BankAccountNo;
    private String IFSCCode;
    private String BankName;
    private String Branch;
    private String isActive;
    private long currentBalance;
    private UserEntity user;

    // ✅ No-arg constructor
    public BankAccountdto() {
    }

    // ✅ All-args constructor
    public BankAccountdto(int BankAccountId, String BankAccountNo, String IFSCCode, String BankName, String Branch,
          String isActive, long currentBalance, UserEntity user) 
    {
    	   this.BankName = BankName;
        this.BankAccountId = BankAccountId;
        this.BankAccountNo = BankAccountNo;
        this.IFSCCode = IFSCCode;
     
        this.Branch = Branch;
        this.isActive = isActive;
        this.currentBalance = currentBalance;
        this.user = user;
    }

    
    public int getBankAccountId() {
        return BankAccountId;
    }

    public void setBankAccountId(int BankAccountId) {
        this.BankAccountId = BankAccountId;
    }

    public String getBankAccountNo() {
        return BankAccountNo;
    }

    public void setBankAccountNo(String BankAccountNo) {
        this.BankAccountNo = BankAccountNo;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(long currentBalance) {
        this.currentBalance = currentBalance;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
