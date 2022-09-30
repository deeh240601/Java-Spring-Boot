package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long userId;
	private String name;
	private String desc;
	private String type;
	private int year;
	

	public Product(Long userId, String name, String desc, String type, int year) {
		this.userId = userId;
		this.name = name;
		this.desc = desc;
		this.type = type;
		this.year = year;
	}
	public Product() {
		this.userId = null;
		this.name = null;
		this.desc = null;
		this.type = null;
		this.year = 0;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desc=" + desc + ", type=" + type + ", year=" + year + "]";
	}

	
	
	
}
