/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: Person.java 
 * @Prject: zheng-common
 * @Package: com.zheng.common.util 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年3月26日 下午4:55:00 
 * @version: V1.0   
 */
package com.zheng.common.util;

import java.util.Date;

/** 
 * @ClassName: Person 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年3月26日 下午4:55:00  
 */
public class Person {
	private String name;
	private Integer age;
	private String about;
	private Date created;
	public Person(String name, Integer age, String about, Date created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
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
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about
				+ ", created=" + created + "]";
	}
	
}
