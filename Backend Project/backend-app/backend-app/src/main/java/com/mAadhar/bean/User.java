package com.mAadhar.bean;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uid;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public float getUadhar() {
		return uadhar;
	}
	public void setUadhar(float uadhar) {
		this.uadhar = uadhar;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public double getMnumber() {
		return mnumber;
	}
	public void setMnumber(double mnumber) {
		this.mnumber = mnumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	private String address;
	private String uname;
	private float uadhar;
	private String emailid;
	private double mnumber;
	private String gender;
	private String dob;
	@Override
	public String toString() {
		return "User [uid=" + uid + ", url=" + url + ", address=" + address + ", uname=" + uname + ", uadhar=" + uadhar
				+ ", emailid=" + emailid + ", mnumber=" + mnumber + ", gender=" + gender + " , dob=" + dob + "]";
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	 
	}
	
