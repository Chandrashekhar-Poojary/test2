package com.cognizant.springlearn.bean;

public class Skill {

	private int id;
	private String name;
	
	public Skill() {
		System.out.println("Inside Skill Constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + "]";
	}
	
	

}
