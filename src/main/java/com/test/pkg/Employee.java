package com.test.pkg;

public class Employee {
	private String name;
	private int age;
	private Integer sal;
	private String city;

	public Employee(String name, int age, Integer sal, String city) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.city = city;
	}

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

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
