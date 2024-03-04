package com.surbhi.springreact.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	private int bkid;
	private String bkname;
	private int bkprice;

	public Book() {
		super();
	}

	public Book(int bkid, String bkname, int bkprice) {
		super();
		this.bkid = bkid;
		this.bkname = bkname;
		this.bkprice = bkprice;
	}

	public int getBkid() {
		return bkid;
	}

	public void setBkid(int bkid) {
		this.bkid = bkid;
	}

	public String getBkname() {
		return bkname;
	}

	public void setBkname(String bkname) {
		this.bkname = bkname;
	}

	public int getBkprice() {
		return bkprice;
	}

	public void setBkprice(int bkprice) {
		this.bkprice = bkprice;
	}

	@Override
	public String toString() {
		return "Book [bkid=" + bkid + ", bkname=" + bkname + ", bkprice=" + bkprice + "]";
	}

}
