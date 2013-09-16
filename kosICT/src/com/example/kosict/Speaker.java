package com.example.kosict;

public class Speaker {
	private int picID;
	private String name;
	private String website;
	private String facebook;
	private String Des;
	
	public Speaker(int p,String n,String w,String f,String d)
	{
		setPicID(p);
		setName(n);
		setWebsite(w);
		setFacebook(f);
		setDes(d);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public int getPicID() {
		return picID;
	}

	public void setPicID(int picID) {
		this.picID = picID;
	}

	public String getDes() {
		return Des;
	}

	public void setDes(String des) {
		Des = des;
	}
}
