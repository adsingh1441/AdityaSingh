package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	@Id
private String userEmailId;
private String userName;
private String userContact;
private String userAddress;
private String userPassword;
public String getUserEmailId() {
	return userEmailId;
}
public void setUserEmailId(String userEmailId) {
	this.userEmailId = userEmailId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserContact() {
	return userContact;
}
public void setUserContact(String userContact) {
	this.userContact = userContact;
}
public String getUserAddress() {
	return userAddress;
}
public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}

}
