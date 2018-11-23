package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier {
	@Id
	@GeneratedValue
	private String subpplierId;
	private String subpplierName;
	private String subpplierAddress;
	private String subpplierContact;
	private String subpplierGmail;
	public String getSubpplierId() {
		return subpplierId;
	}
	public void setSubpplierId(String subpplierId) {
		this.subpplierId = subpplierId;
	}
	public String getSubpplierName() {
		return subpplierName;
	}
	public void setSubpplierName(String subpplierName) {
		this.subpplierName = subpplierName;
	}
	public String getSubpplierAddress() {
		return subpplierAddress;
	}
	public void setSubpplierAddress(String subpplierAddress) {
		this.subpplierAddress = subpplierAddress;
	}
	public String getSubpplierContact() {
		return subpplierContact;
	}
	public void setSubpplierContact(String subpplierContact) {
		this.subpplierContact = subpplierContact;
	}
	public String getSubpplierGmail() {
		return subpplierGmail;
	}
	public void setSubpplierGmail(String subpplierGmail) {
		this.subpplierGmail = subpplierGmail;
	}
	

}
