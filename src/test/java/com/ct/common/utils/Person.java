package com.ct.common.utils;

import java.util.Date;

public class Person {
	private String name;
	private int age;
	private String about;
	private Date created;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Person(String name, int age, String about, Date created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [姓名=" + name + ", 年龄=" + age + ", 介绍=" + about + ", 注册日期=" + created + "]";
	}
	
	
	
	

}
