package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private int name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Name "+getName());
		System.out.println("Id "+getId());
	}

}
