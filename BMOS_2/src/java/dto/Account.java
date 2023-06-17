/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Date;

/**
 *
 * @author THUAN
 */
public class Account {
    private String accountID;
    private String username;
    private String password;
    private String fullname;
    private boolean status;
    private boolean gender;
    private String email;
    private String phone;
    private String address;
    private Date date;
    private int roleID;

    public Account() {
    }

    public Account(String accountID, String username, String password, String fullname, boolean status, boolean gender, String email, String phone, String address, Date date, int roleID) {
        this.accountID = accountID;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.status = status;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.date = date;
        this.roleID = roleID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    
    
    
}
