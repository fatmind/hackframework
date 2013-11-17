package com.fatmind.ibatis.nplus1;

import java.util.List;

public class Department {

	private int id;
	private String name;
	
	private List<Employe> employes;

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

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	
	
	
}
