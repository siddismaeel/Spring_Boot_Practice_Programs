package com.example.demo;

public class Student {

	private int stId;
	private String sName;
	private String lang;
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", sName=" + sName + ", lang=" + lang + "]";
	}
	
	
	
}
