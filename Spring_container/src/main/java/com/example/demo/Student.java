package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id = 1;
	private String sName = "Ismaeel";
	private String college = "Makhanlal";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sName=" + sName + ", college=" + college + "]";
	}
	
	
	
}
